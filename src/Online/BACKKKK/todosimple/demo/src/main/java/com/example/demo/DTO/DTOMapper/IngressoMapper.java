package com.example.demo.DTO.DTOMapper;

import org.springframework.beans.BeanUtils;

import com.example.demo.DTO.DTOCLASS.IngressoDto;
import com.example.demo.models.Ingresso;

public class IngressoMapper {

    public static IngressoDto toDto(Ingresso ingresso) {
        IngressoDto ingressoDto = new IngressoDto();
        BeanUtils.copyProperties(ingresso, ingressoDto);
        ingressoDto.setIdUser(ingresso.getUser().getId());
        if (ingresso.getCompra() != null) {
            ingressoDto.setIdCompra(ingresso.getCompra().getId());
        }
        return ingressoDto;
    }

    public static Ingresso toEntity(IngressoDto ingressoDto) {
        Ingresso ingresso = new Ingresso();
        BeanUtils.copyProperties(ingressoDto, ingresso);
        // Aqui, você pode carregar a referência da compra do banco de dados conforme necessário.
        return ingresso;
    }
}