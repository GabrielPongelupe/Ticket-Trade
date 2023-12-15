package com.example.demo.DTO.DTOCLASS;

import java.time.LocalDate;

import com.example.demo.models.DenunciaStatus;

public class DenunciaDTO {
    private Long id;

    private String motivo;

    private DenunciaStatus status;

    private LocalDate data;

    private Long user_id;


    public DenunciaDTO(Long id, String motivo, DenunciaStatus status, LocalDate data, Long user_id) {
        this.id = id;
        this.motivo = motivo;
        this.status = status;
        this.data = data;
        this.user_id = user_id;
    }

    public DenunciaDTO(){
        
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotivo() {
        return this.motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public DenunciaStatus getStatus() {
        return this.status;
    }

    public void setStatus(DenunciaStatus status) {
        this.status = status;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Long getUser_id() {
        return this.user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

}
