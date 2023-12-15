package com.example.demo.DTO.DTOCLASS;

import org.springframework.beans.BeanUtils;
import com.example.demo.models.User;
import java.util.ArrayList;
import java.util.List;

public class UserDTO {
    
    private Long id;
    private String username;
    private String password;
    private String cpf;
    private String email;
    private String chavePix;
    private Double mediaRating;
    private String rg;
    private boolean valido;
    private List<Long> ingressos_Id = new ArrayList<>();

    public UserDTO(User user) {
        BeanUtils.copyProperties(user, this);
        this.mediaRating = user.getMediaRating();

        // Preencher listas de IDs
       
    }

    public UserDTO(){

    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getChavePix() {
        return this.chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public Double getMediaRating() {
        return this.mediaRating;
    }

    public void setMediaRating(Double mediaRating) {
        this.mediaRating = mediaRating;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isValido() {
        return this.valido;
    }

    public boolean getValido() {
        return this.valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    public List<Long> getIngressos_Id() {
        return this.ingressos_Id;
    }

    public void setIngressos_Id(List<Long> ingressos_Id) {
        this.ingressos_Id = ingressos_Id;
    }


}
