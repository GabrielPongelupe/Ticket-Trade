package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = Avaliacao.TABLE_NAME)
public class Avaliacao {
    
    private static final String TABLE_NAME = "avaliacao";


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "estrelas", nullable = false)
    @NotNull
    private float estrelas;

    @Column(name = "status", nullable = false)
    @NotNull
    private boolean status;

    @Column(name = "data", nullable = false)
    @NotNull
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Avaliacao() {
        // Construtor padrão
    }

    public Avaliacao(float estrelas, boolean status, LocalDate data) {
        this.estrelas = estrelas;
        this.status = status;
        this.data = data;
    }

    public Long getAvaliacaoId() {
        return id;
    }

    public void setAvaliacaoId(Long avaliacaoId) {
        this.id = avaliacaoId;
    }

    public User getAvaliadoPor() {
        return user;
    }

    public void setAvaliadoPor(User avaliadoPor) {
        this.user = avaliadoPor;
    }


    public float getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(float estrelas) {
        this.estrelas = estrelas;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Long getId() {
        return null;
    }
}

/* 
{
  "estrelas": 4.5,
  "status": true,
  "data": "2023-11-17",
  "user": {
    "id": 1,
    "username": "usuario1",
    "password": "senha123",
    "cpf": "123.456.789-01",
    "email": "usuario1@example.com",
    "chavePix": "chavePixUsuario1",
    "rg": "1234567"
  }
}
*/