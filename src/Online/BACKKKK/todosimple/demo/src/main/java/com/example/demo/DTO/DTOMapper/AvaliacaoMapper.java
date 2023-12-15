package com.example.demo.DTO.DTOMapper;

import com.example.demo.DTO.DTOCLASS.AvaliacaoDTO;
import com.example.demo.models.Avaliacao;
import java.util.List;
import java.util.stream.Collectors;

public class AvaliacaoMapper {

    private AvaliacaoMapper() {
        // Construtor privado para evitar instanciação
    }

    public static AvaliacaoDTO toDTO(Avaliacao avaliacao) {
        return new AvaliacaoDTO(
                avaliacao.getAvaliacaoId(),
                avaliacao.getEstrelas(),
                avaliacao.isStatus(),
                avaliacao.getData(),
                avaliacao.getAvaliadoPor().getId()
        );
    }

    public static List<AvaliacaoDTO> toDTOList(List<Avaliacao> avaliacoes) {
        return avaliacoes.stream()
                .map(AvaliacaoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public static Avaliacao toEntity(AvaliacaoDTO avaliacaoDTO) {
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setAvaliacaoId(avaliacaoDTO.getId());
        avaliacao.setEstrelas(avaliacaoDTO.getEstrelas());
        avaliacao.setStatus(avaliacaoDTO.isStatus());
        avaliacao.setData(avaliacaoDTO.getData());
        // Aqui você pode carregar o objeto relacionado do banco de dados conforme necessário.
        return avaliacao;
    }
}