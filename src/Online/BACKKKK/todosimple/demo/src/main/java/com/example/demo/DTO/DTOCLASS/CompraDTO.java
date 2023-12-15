package com.example.demo.DTO.DTOCLASS;

import java.time.LocalDate;

import com.example.demo.models.StatusCompra;

public class CompraDTO {

    private LocalDate data;
    private String cpf_Comprador;
    private StatusCompra status;
    private Long compradorId;
    private Long vendedorId;
    private Long ingressoId;

    public CompraDTO() {
        // Construtor padrão
    }

    public CompraDTO(LocalDate data, String cpf_Comprador, StatusCompra status, Long compradorId, Long vendedorId, Long ingressoId) {
        this.data = data;
        this.cpf_Comprador = cpf_Comprador;
        this.status = status;
        this.compradorId = compradorId;
        this.vendedorId = vendedorId;
        this.ingressoId = ingressoId;
    }

    // Getters e Setters

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getCpf_Comprador() {
        return cpf_Comprador;
    }

    public void setCpf_Comprador(String cpf_Comprador) {
        this.cpf_Comprador = cpf_Comprador;
    }

    public StatusCompra getStatus() {
        return status;
    }

    public void setStatus(StatusCompra status) {
        this.status = status;
    }

    public Long getCompradorId() {
        return compradorId;
    }

    public void setCompradorId(Long compradorId) {
        this.compradorId = compradorId;
    }

    public Long getVendedorId() {
        return vendedorId;
    }

    public void setVendedorId(Long vendedorId) {
        this.vendedorId = vendedorId;
    }

    public Long getIngressoId() {
        return ingressoId;
    }

    public void setIngressoId(Long ingressoId) {
        this.ingressoId = ingressoId;
    }
}