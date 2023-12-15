package com.example.demo.DTO.DTOCLASS;

import java.time.LocalDate;

import com.example.demo.models.IngressoStatus;

public class IngressoDto {
    
    private Long id;

    private Double valor;

    private String description;
 
    private LocalDate data;

    private IngressoStatus status;

    private Long idUser;

    private Long idCompra;



    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public IngressoStatus getStatus() {
        return this.status;
    }

    public void setStatus(IngressoStatus status) {
        this.status = status;
    }

    public Long getIdCompra() {
        return this.idCompra;
    }

    public void setIdCompra(Long idCompra) {
        this.idCompra = idCompra;
    }

}
