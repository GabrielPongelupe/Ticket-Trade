package com.example.demo.DTO.DTOMapper;

import org.springframework.beans.BeanUtils;

import com.example.demo.DTO.DTOCLASS.NotificacaoDTO;
import com.example.demo.models.Notificacao;

public class NotificacaoMapper {

    public static Notificacao toEntity(NotificacaoDTO notificacaoDTO) {
        Notificacao notificacao = new Notificacao();
        
        BeanUtils.copyProperties(notificacaoDTO, notificacao);
        
        return notificacao;
    }

    public static NotificacaoDTO toDTO(Notificacao notificacao) {
        NotificacaoDTO notificacaoDTO = new NotificacaoDTO();

        BeanUtils.copyProperties(notificacao, notificacaoDTO);

        if (notificacao.getUser() != null) {
            notificacaoDTO.setUserId(notificacao.getUser().getId());
        }

        return notificacaoDTO;
    }
}