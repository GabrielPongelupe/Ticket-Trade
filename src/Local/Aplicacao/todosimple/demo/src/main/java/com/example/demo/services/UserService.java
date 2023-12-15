package com.example.demo.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.DTO.DTOCLASS.UserDTO;
import com.example.demo.DTO.DTOMapper.UserMapper;
import com.example.demo.models.Compra;
import com.example.demo.models.Notificacao;
import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    
   


   
    public User findByUsername(String username) {
        Optional<User> user = this.userRepository.findByUsername(username);

        return user.orElse(null);
    }

    public Long findUserIdByCPF(String cpf){
        Optional<Long> user = this.userRepository.findUserIdByCpf(cpf);
        return user.orElse(null);
    }

    public User findByCPF(String cpf){
        Optional<User> user = this.userRepository.findUserByCpf(cpf);

        return user.orElse(null);
    }
    

    public User findVendedorbyId(Long id){
        return this.userRepository.findVendedorByCompraId(id).get();
    }

    public User findCompradorbyId(Long id){
        return this.userRepository.findCompradorByCompraId(id).get();
    }




    public User buscarPeloIdUser(Long id){
        Optional<User> user = this.userRepository.findById(id);
        
        return user.orElseThrow(() -> new RuntimeException(
            "Não foi possível encontrar o usuário: " + id + " do Tipo= " + User.class.getName()
        )); 
    }

    
    public User loginRequest(String email){
        Optional<User> user = this.userRepository.loginRequest(email);
        return user.orElseThrow(()
             -> new RuntimeException(
            "não foi possível realizar o login"
        ));
        

    }

    @Transactional //import org.springframework.transaction.annotation.Transactional;
    public User create(User obj){
        obj.setId(null);
        obj.setValido(true);
        obj = this.userRepository.save(obj); //chama metodo do userRepository (atributo deste obj) para 
        //salvar o obj no Banco de dados (metodo save(obj) está implementado no JpaRepository

        //este metodo pega o metodo saveAll(List) contido no JpaRepository 
        //(TaskRepository extends JpaRepository), e salva a lista de tasks no user criado
       

        return obj;
    }

    public User create(UserDTO userDTO){
        User obj = UserMapper.toEntity(userDTO);
        obj.setId(null);
        obj.setValido(true);
        obj = this.userRepository.save(obj); 
       
        return obj;
    }
    
    @Transactional
    public User findUserByIngressoId(Long ingressoId) {
        Optional<User> userOptional = userRepository.findUserByIngressoId(ingressoId);

        if (userOptional.isPresent()) {
            return userOptional.get();
        } else {
            throw new RuntimeException("Usuário não encontrado para o ID do Ingresso: " + ingressoId);
        }
    }

    public User findUserByNotificacaoId(Long notificacaoId) {
        return userRepository.findUserByNotificacaoId(notificacaoId);
    }

    @Transactional(readOnly = true)
    public User findUserByCompraId(Long compraId) {
        return userRepository.findUserByCompraId(compraId);
    }

    @Transactional(readOnly = true)
    public User findUserByDenunciaId(Long denunciaId) {
        return userRepository.findUserByDenunciaId(denunciaId);
    }

    @Transactional(readOnly = true)
    public List<Compra> findComprasByUserId(Long userId) {
        return userRepository.findComprasByUserId(userId);
    }


    public User update(User obj){
        User newobj = buscarPeloIdUser(obj.getId()); //reuso do metodo bucarPeloIdUser dessa classe

        newobj.setPassword(obj.getPassword()); //fazer isso para todos os atributos que deseja mudar no metodo
        newobj.setEmail(obj.getEmail());
        newobj.setChavePix(obj.getChavePix());
        newobj.setValido(obj.getValido());
        newobj.setRg(obj.getRg());
        
        

        return this.userRepository.save(newobj);
    }

    public void delete(Long id){
        buscarPeloIdUser(id); //chama metodo desta classe e caso nn exista user com este id propaga exception

        try{
            this.userRepository.deleteById(id);
        }catch(Exception e){
            throw new RuntimeException("Não foi possivel deletar este user pois ha tasks relacionadas");
            // propaga RunTimeException ao captar exception
        }
    }

    /* 
    public User efetuarLogin(String username, String password) {
        Optional<User> userOptional = userRepository.findByUsername(username);

        if (userOptional.isPresent()) {
            User user = userOptional.get();

            // Verifica se a senha fornecida corresponde à senha armazenada 
            if (user.getPassword().equals(password)) {
                return user;
            }
        }

        // Retorna null se o usuário não for encontrado ou se a senha não corresponder
        return null;
    }
    */

    public List<Notificacao> notificacaoNaoLida (Long id){
        User user = this.buscarPeloIdUser(id);
        return user.getNotificacoes().stream()
                .filter(notificacao -> !notificacao.isLida())
                .collect(Collectors.toList());
    }
    


}
