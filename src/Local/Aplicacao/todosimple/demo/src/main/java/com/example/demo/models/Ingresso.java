package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = Ingresso.TABLE_NAME)
public class Ingresso {
    public static final String TABLE_NAME = "Ingresso";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    //NAO COLOCAR JSONIGNORE, FAZER MODELO DTO POIS NO POST DA ERRO (PRECISA DAR POST COM JSON TODO) BBBBBB
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;


    @Column(name = "valor")
    @NotNull
    private Double valor;


    @Column(name = "description", length = 255, nullable = false)
    @NotBlank
    @Size(min = 2, max = 254)
    private String description;

    @Column(name = "data", nullable = false)
    @NotNull
    private LocalDate data;

    @Enumerated
    @Column(name = "status", nullable = false)
    @NotNull
    private IngressoStatus status;

    @JsonIgnore //TIRAR ISSO CACETE
    @OneToOne(mappedBy = "ingresso")
    private Compra compra;

    public Ingresso() {
    }

    // Construtor com todos os parâmetros, exceto data, status, id
    public Ingresso(User user, String description, LocalDate data) {
        this.user = user;
        this.description = description;
        this.data = data;
        this.status = IngressoStatus.NAO_VALIDO;
    }

    
    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Compra getCompra() {
        return compra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public IngressoStatus getStatus() {
        return status;
    }

    public void setStatus(IngressoStatus status) {
        this.status = status;
    }

    public void setStatusPostado() {
        this.status = IngressoStatus.NAO_VALIDO;
    }

    public Double getValor(){
        return this.valor;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Ingresso other = (Ingresso) obj;
        return Objects.equals(id, other.id) &&
                Objects.equals(user, other.user) &&
                Objects.equals(description, other.description) &&
                Objects.equals(data, other.data) &&
                status == other.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, description, data, status);
    }
}


/*  
{
  "user": {
    "id": 1,
    "username": "usuario1",
    "password": "senha123",
    "cpf": "123.456.789-01",
    "email": "usuario1@example.com",
    "chavePix": "chavePixUsuario1",
    "rg": "1234567"
  },
  "description": "Ingresso para o evento XPTO",
  "data": "2023-12-01",
  "status": "NAO_VALIDO"
}
*/