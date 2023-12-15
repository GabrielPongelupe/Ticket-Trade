package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "notificacao")
public class Notificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "notificacao", nullable = false,length = 255)
    @Size(min = 3, max = 255)
    @NotBlank
    private String notificacao;

    @Column(name = "data", nullable = false)
    @NotNull
    private LocalDate data;

    @Column(name = "lida", nullable = false)
    private boolean lida;

    public Notificacao() {
        // Construtor padrão sem parâmetros
    }

    public Notificacao(String notificacao, LocalDate data, boolean lida) {
        this.notificacao = notificacao;
        this.data = data;
        this.lida = lida;
    }

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

/* 
{
  "notificacao": "Nova mensagem recebida",
  "data": "2023-11-17",
  "lida": false,
  "user": {
    "id": 1,
    "username": "usuarioRecebedor",
    "password": "senha123",
    "cpf": "123.456.789-01",
    "email": "recebedor@example.com",
    "chavePix": "chavePixRecebedor",
    "rg": "1234567"
  }
}
*/