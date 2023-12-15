package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "denuncia")
public class Denuncia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "motivo", nullable = false)
    @Size(max = 255)
    @NotBlank
    private String motivo;

    @Column(name = "status", nullable = false)
    @NotNull 
    private DenunciaStatus status;

    @Column(name = "data", nullable = false)
    @NotNull
    private LocalDate data;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id") // Certifique-se de usar o nome correto da coluna
    private User user;

    public Denuncia() {
    }

    public Denuncia(String motivo, DenunciaStatus status, LocalDate data) {
        this.motivo = motivo;
        this.status = status;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public DenunciaStatus getStatus() {
        return status;
    }

    public void setStatus(DenunciaStatus status) {
        this.status = status;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}

/* 
{
  "motivo": "Conteúdo impróprio",
  "status": "PENDENTE",
  "data": "2023-11-17",
  "user": {
    "id": 1,
    "username": "usuarioDenunciante",
    "password": "senha123",
    "cpf": "123.456.789-01",
    "email": "denunciante@example.com",
    "chavePix": "chavePixDenunciante",
    "rg": "1234567"
  }
}
*/