package com.example.demo.DTO.DTOCLASS;

import com.example.demo.models.Avaliacao;
import java.time.LocalDate;

public class AvaliacaoDTO {

    private Long id;
    private float estrelas;
    private boolean status;
    private LocalDate data;
    private Long userId;  // Referência ao usuário

    public AvaliacaoDTO() {
        // Construtor padrão
    }

    public AvaliacaoDTO(Long id, float estrelas, boolean status, LocalDate data, Long userId) {
        this.id = id;
        this.estrelas = estrelas;
        this.status = status;
        this.data = data;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public static AvaliacaoDTO fromEntity(Avaliacao avaliacao) {
        return new AvaliacaoDTO(
                avaliacao.getAvaliacaoId(),
                avaliacao.getEstrelas(),
                avaliacao.isStatus(),
                avaliacao.getData(),
                avaliacao.getAvaliadoPor().getId()
        );
    }
}