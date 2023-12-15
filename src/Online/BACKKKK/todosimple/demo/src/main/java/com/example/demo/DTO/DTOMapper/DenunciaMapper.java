package com.example.demo.DTO.DTOMapper;

import org.springframework.beans.BeanUtils;

import com.example.demo.DTO.DTOCLASS.DenunciaDTO;
import com.example.demo.models.Denuncia;

public class DenunciaMapper {
    

    public static Denuncia toEntity(DenunciaDTO denunciaDTO){
        Denuncia denuncia = new Denuncia();
        if (denunciaDTO.getUser_id() != null){
            BeanUtils.copyProperties(denunciaDTO, denuncia);
            
        }
        return denuncia;
    }

    public static DenunciaDTO toDTO(Denuncia denuncia){
        DenunciaDTO denunciaDTO = new DenunciaDTO(null, null, null, null, null);
        
        BeanUtils.copyProperties(denuncia, denunciaDTO);
        
        
        return denunciaDTO;
    }
}
