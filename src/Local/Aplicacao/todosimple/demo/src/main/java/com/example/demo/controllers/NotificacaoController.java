package com.example.demo.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.DTO.DTOCLASS.NotificacaoDTO;
import com.example.demo.DTO.DTOMapper.NotificacaoMapper;
import com.example.demo.models.Notificacao;
import com.example.demo.services.NotificacaoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/notificacao")
@Validated
public class NotificacaoController {


    @Autowired
    private NotificacaoService notificacaoService;

    @GetMapping("/{id}")
    public ResponseEntity<NotificacaoDTO> buscarPeloId(@PathVariable Long id) {
        Notificacao notificacao = notificacaoService.buscarNotificacaoPorId(id);
        NotificacaoDTO notificacaoDTO = NotificacaoMapper.toDTO(notificacao);
        return ResponseEntity.ok().body(notificacaoDTO);
    }

    @GetMapping("/nao-lidas")
    public ResponseEntity<List<Notificacao>> buscarNotificacoesNaoLidas(Long id) {
        List<Notificacao> notificacoesNaoLidas = notificacaoService.buscarNotificacoesNaoLidas();
        return ResponseEntity.ok().body(notificacoesNaoLidas);
    }

    @PostMapping
    @Validated
    public ResponseEntity<Notificacao> create(@Valid @RequestBody NotificacaoDTO notificacaoDTO) {
        Notificacao notificacao = this.notificacaoService.create(notificacaoDTO);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(notificacao.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    /*
     * @PostMapping
     * public ResponseEntity<Notificacao> create(
     * 
     * @PathVariable Long userId,
     * 
     * @Valid @RequestBody Notificacao notificacao) {
     * 
     * 
     * Notificacao createdNotificacao = userService.createNotificacao(notificacao,
     * userId);
     * 
     * URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
     * .path("/{id}").buildAndExpand(createdNotificacao.getId()).toUri();
     * 
     * return ResponseEntity.created(uri).body(createdNotificacao);
     * }
     */

    @PutMapping("/{id}")
    @Validated
    public ResponseEntity<Void> update(@Valid @RequestBody Notificacao notificacao, @PathVariable Long id) {
        notificacao.setId(id);
        notificacaoService.update(notificacao);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        notificacaoService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}/lerMensagem")
    @Validated
    public ResponseEntity<Void> lerMensagem(@Valid @RequestBody Notificacao notificacao, @PathVariable Long id) {
        notificacao.setId(id);
        notificacao.setLida(true);
        notificacaoService.update(notificacao);
        return ResponseEntity.noContent().build();
    }

}