package com.example.demo.DTO.DTOMapper;

import com.example.demo.DTO.DTOCLASS.CompraDTO;
import com.example.demo.models.Compra;

import org.springframework.beans.BeanUtils;

public class CompraMapper {
    public static CompraDTO toDTO(Compra compra) {
        CompraDTO compraDTO = new CompraDTO();
        BeanUtils.copyProperties(compra, compraDTO);
        compraDTO.setCompradorId(compra.getComprador().getId());
        compraDTO.setVendedorId(compra.getVendedor().getId());
        compraDTO.setIngressoId(compra.getIngresso().getId());
        return compraDTO;
    }

    public static Compra toEntity(CompraDTO compraDTO) {
        Compra compra = new Compra();
        BeanUtils.copyProperties(compraDTO, compra);
       
        return compra;
    }
}