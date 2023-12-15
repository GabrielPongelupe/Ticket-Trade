package com.example.demo.models;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Table(name = "compra")
@Entity
public class Compra {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data", nullable = false)
    @NotNull
    private LocalDate data;

    @Column(name = "cpf_Comprador")
    @NotBlank
    private String cpf_Comprador;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusCompra status;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "usuario_comprador_id",  nullable = false, updatable = false)
    private User comprador;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "usuario_vendedor_id",  nullable = false, updatable = false)
    private User vendedor;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "ingresso_id", nullable = false, updatable = false)
    private Ingresso ingresso;


    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }

    public Compra() {
        // Construtor padrão
    }

    public Compra(LocalDate data, StatusCompra status, User usuarioComprador, User usuarioVendedor) {
        this.data = data;
        this.status = status;
        this.comprador = usuarioComprador;
        this.vendedor = usuarioVendedor;
       
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getComprador() {
        return comprador;
    }

    public String getCpf_Comprador() {
        return cpf_Comprador;
    }

    public User getVendedor() {
        return vendedor;
    }

    public void setComprador(User comprador) {
        this.comprador = comprador;
    }

    public void setCpf_Comprador(String cpf_Comprador) {
        this.cpf_Comprador = cpf_Comprador;
    }

    public void setVendedor(User vendedor) {
        this.vendedor = vendedor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public StatusCompra getStatus() {
        return status;
    }

    public void setStatus(StatusCompra status) {
        this.status = status;
    }

    public User getUsuarioComprador() {
        return comprador;
    }

    public void setUsuarioComprador(User usuarioComprador) {
        this.comprador = usuarioComprador;
    }

    public User getUsuarioVendedor() {
        return vendedor;
    }

    public void setUsuarioVendedor(User usuarioVendedor) {
        this.vendedor = usuarioVendedor;
    }

    
}

/* 
{
  "data": "2023-11-17",
  "status": "NAO_PAGO",
  "comprador": {
    "id": 1,
    "username": "usuarioComprador",
    "password": "senha123",
    "cpf": "123.456.789-01",
    "email": "comprador@example.com",
    "chavePix": "chavePixComprador",
    "rg": "1234567"
  },
  "vendedor": {
    "id": 2,
    "username": "usuarioVendedor",
    "password": "senha456",
    "cpf": "987.654.321-01",
    "email": "vendedor@example.com",
    "chavePix": "chavePixVendedor",
    "rg": "7654321"
  }
}
*/