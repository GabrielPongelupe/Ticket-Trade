package com.example.demo.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.DTO.DTOMapper.UserMapper;
import com.example.demo.DTO.DTOCLASS.UserDTO;
import com.example.demo.models.Notificacao;
import com.example.demo.models.User;
import com.example.demo.models.User.CreateUser;
import com.example.demo.services.UserService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin("*")
@RequestMapping("/user") //Mostra que todos os metodos vao mexer em /user (Entidade User no SGBD)
@Validated 
public class UserController {
    
    @Autowired
    private UserService userService;

    
    //   ESTAS FUNCAO RETORNA DIRETO NA API, FRONT-END COMUNICA COM CONTROLLERS    
   

    @GetMapping("/{id}") //mostra que é uma funcao Get e mostra pelo oq mapeia para achar no SGBD
    public ResponseEntity<UserDTO> buscarPeloId(@PathVariable Long id){ //NAO APLICAR @Bory EM PARAMETRO DE GET
        //ResponseEntity<User> é uma Entidade responsiva do tipo user
        //Ao retornar apenas User:  public User buscarPeloId() || retorna um json para o front-end

        User obj = this.userService.buscarPeloIdUser(id); //CHAMA METODO DO SERVICE
        //FRONT-END COMUNICA COM CONTROLLER, CONTROLLER COMUNICA COM SERVICE, SERVICE PUXA REPOSITORY QUE
        // MODIFICA O MODEL...

        //return obj; - da ruim pois precisa retornar uma ResponseEntity<User>
        
        UserDTO userDTO = UserMapper.toDTO(obj);

        return ResponseEntity.ok().body(userDTO);
        // Retorna o tipo ResponseEntity, ok() metodo para retornar qnd tudo estiver ok;
        // bory() é onde vai chegar o dado. passar objeto como @param


    }

    @GetMapping("/cpf/{cpf}")
    public ResponseEntity<UserDTO> findByCPF(@PathVariable String cpf){
        User obj = this.userService.findByCPF(cpf);

        UserDTO userDTO = UserMapper.toDTO(obj);
        return ResponseEntity.ok().body(userDTO);
    }

    @GetMapping("/id/{cpf}")
        public ResponseEntity<Long> findUserIdByCPF(@PathVariable String cpf){
            Long obj = this.userService.findUserIdByCPF(cpf);

            return ResponseEntity.ok().body(obj);
        }
    

    @GetMapping("/username/{username}")
    public ResponseEntity<UserDTO> findbyUsername(@PathVariable String username){
        User obj = this.userService.findByUsername(username);

        UserDTO userDTO = UserMapper.toDTO(obj);

        return ResponseEntity.ok().body(userDTO);
    }
    
    @GetMapping("/login/{email}")
    public ResponseEntity<UserDTO> loginRequest(@PathVariable String email){
        User obj = this.userService.loginRequest(email);

        UserDTO userDTO = UserMapper.toDTO(obj);

        return ResponseEntity.ok().body(userDTO);
    }

    
    


    @PostMapping
    @Validated(CreateUser.class) //@Validated serve para indicar que se deve validar as regras de negocios
    // presentes na interface CreateUser -> aplicada nos models User.java 
    public ResponseEntity<User> create(@Valid @RequestBody UserDTO userDTO){ // @Valid indica que é este dado que deve validar
        User obj = UserMapper.toEntity(userDTO);
        this.userService.create(obj); //chama metodo userService


        // ServletUriComponentsBuilder é um builder que pega o contexto da requisicao atual
        //fromCurrentRequest() = requisicao atual
        //.path("/{id}").buildAndExpand(obj.getId()).toUri(); mostra caminho
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(obj.getId()).toUri();
        // complexo para entender mas o metodo basicamente motra qual o caminho para encontrar este user
        // colocar msm logica em outros componentes


        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{id}")
    @Validated(CreateUser.class)
    public ResponseEntity<Void> update(@Valid @RequestBody User obj, @PathVariable Long id){
        obj.setId(id);

        this.userService.update(obj);

        return ResponseEntity.noContent().build(); //como é void retorna noContent()

    } 

    

    //TODOS OS METODOS DO CONTROLLER DEVEM RETORNAR ResponseEntity<?>  
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.userService.delete(id);

        return ResponseEntity.noContent().build(); //como é void retorna noContent()
    }

     @GetMapping("/{id}/notificacoes-nao-lidas")
    public ResponseEntity<List<Notificacao>> notificacaoNaoLida(@PathVariable Long id) {
        List<Notificacao> notificacoesNaoLidas = userService.notificacaoNaoLida(id);
        return ResponseEntity.ok().body(notificacoesNaoLidas);
    }


    


}
