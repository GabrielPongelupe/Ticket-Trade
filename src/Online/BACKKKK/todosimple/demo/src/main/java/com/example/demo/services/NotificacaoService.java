package com.example.demo.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.DTO.DTOCLASS.NotificacaoDTO;
import com.example.demo.DTO.DTOMapper.NotificacaoMapper;
import com.example.demo.models.Notificacao;
import com.example.demo.models.User;
import com.example.demo.repositories.NotificacaoRepository;

@Service
public class NotificacaoService {

    @Autowired 
    private NotificacaoRepository notificacaoRepository;

    @Autowired
    private UserService userService;

    public Notificacao buscarNotificacaoPorId(Long id) {
        Optional<Notificacao> notificacao = this.notificacaoRepository.findById(id);
        
        return notificacao.orElseThrow(() -> new RuntimeException(
                "Não foi possível encontrar esta Notificação: " + id + " do Tipo: " + Notificacao.class.getName()
        ));
    }

    public List<Notificacao> buscarNotificacoesNaoLidas() {
        List<Notificacao> notificacoes = new ArrayList<>();
        return notificacoes.stream()
            .filter(e -> e.isLida()).collect(Collectors.toList());
    }

    @Transactional
    public Notificacao create(NotificacaoDTO notificacaoDto) {
        Notificacao notificacao = NotificacaoMapper.toEntity(notificacaoDto);
        User user = this.userService.buscarPeloIdUser(notificacaoDto.getUserId());
        
        notificacao.setData(LocalDate.now());

        notificacao.setId(null);
        notificacao.setUser(user);
        notificacao.setLida(false);

        this.notificacaoRepository.save(notificacao);
        return notificacao;

}

    @Transactional
    public Notificacao update(Notificacao notificacao) {
        Notificacao existingNotificacao = buscarNotificacaoPorId(notificacao.getId());

        existingNotificacao.setNotificacao(notificacao.getNotificacao());
        existingNotificacao.setData(notificacao.getData());
        existingNotificacao.setLida(notificacao.isLida());

        return notificacaoRepository.save(existingNotificacao);
    }

    public void delete(Long id) {
        Notificacao notificacao = buscarNotificacaoPorId(id);

        try {
            notificacaoRepository.delete(notificacao);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível deletar a notificação: " + id);
        }
    }
}