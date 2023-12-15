package com.example.demo.DTO.DTOCLASS;

import java.time.LocalDate;

public class NotificacaoDTO {

    private Long id;
    private String notificacao;
    private LocalDate data;
    private boolean lida;
    private Long userId; // Alterei o nome para userId para refletir o relacionamento

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNotificacao() {
        return notificacao;
    }

    public void setNotificacao(String notificacao) {
        this.notificacao = notificacao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean isLida() {
        return lida;
    }

    public void setLida(boolean lida) {
        this.lida = lida;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}