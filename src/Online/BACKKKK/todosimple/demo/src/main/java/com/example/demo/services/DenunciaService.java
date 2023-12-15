package com.example.demo.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.DTO.DTOCLASS.DenunciaDTO;
import com.example.demo.DTO.DTOMapper.DenunciaMapper;
import com.example.demo.models.Denuncia;
import com.example.demo.models.DenunciaStatus;
import com.example.demo.repositories.DenunciaRepository;

@Service
public class DenunciaService {

    @Autowired
    private DenunciaRepository denunciaRepository;

    @Autowired
    UserService userService;


    public Denuncia buscarDenunciaPeloId(Long id) {
        Optional<Denuncia> denuncia = this.denunciaRepository.findById(id);
        

        return denuncia.orElseThrow(() -> new RuntimeException(
                "Não foi possível encontrar esta Denúncia: " + id + " do Tipo: " + Denuncia.class.getName()
        ));
    }

    public List<Denuncia> buscarDenunciaPeloUserId(Long id){


        List<Denuncia> denuncias = this.denunciaRepository.findPeloUserID(id);

        return denuncias;
    }

    @Transactional
    public Denuncia create(DenunciaDTO denunciaDTO) {
        Denuncia obj = DenunciaMapper.toEntity(denunciaDTO);
        obj.setId(null);
        obj.setUser(this.userService.buscarPeloIdUser(denunciaDTO.getUser_id()));
        obj.setData(LocalDate.now());
        
        obj.setStatus(DenunciaStatus.PENDENTE);
        return denunciaRepository.save(obj);
    }

    @Transactional
    public Denuncia update(Denuncia denuncia) {
        Denuncia existingDenuncia = buscarDenunciaPeloId(denuncia.getId());

        existingDenuncia.setMotivo(denuncia.getMotivo());
        existingDenuncia.setStatus(denuncia.getStatus());
        existingDenuncia.setData(denuncia.getData());

        return denunciaRepository.save(existingDenuncia);
    }

    


    public void delete(Long id) {
        Denuncia denuncia = buscarDenunciaPeloId(id);

        try {
            denunciaRepository.delete(denuncia);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível deletar a denúncia: " + id);
        }
    }

    
    

}
