package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;




@Entity
@Table(name = User.TABLE_NAME)
public class User {

    public interface CreateUser {
    }

    public interface UpdateUser {
    }

    public static final String TABLE_NAME = "user";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "username", length = 100, nullable = false)
    @NotEmpty(groups = CreateUser.class)
    @NotNull(groups = CreateUser.class)
    @Size(groups = CreateUser.class, min = 3, max = 100)
    private String username;

    @Column(name = "password", length = 60, nullable = false)
    @NotNull(groups = {CreateUser.class, UpdateUser.class})
    @NotEmpty(groups = {CreateUser.class, UpdateUser.class})
    @Size(groups = {CreateUser.class, UpdateUser.class}, min = 7, max = 60)
    private String password;

    @Column(name = "cpf", unique = true, nullable = false)
    @NotEmpty(groups = CreateUser.class)
    @NotNull(groups = CreateUser.class)
    private String cpf;

    @Column(name = "email", unique = true, nullable = false)
    @NotEmpty(groups = CreateUser.class)
    @NotNull(groups = CreateUser.class)
    private String email;

    @Column(name = "chave_pix")
    @NotBlank
    private String chavePix;

    
    @OneToMany(mappedBy = "user")
    private List<Avaliacao> rating = new ArrayList<>();

    @Column(name = "rg", unique = true, nullable = false)
    @NotEmpty(groups = CreateUser.class)
    @NotNull(groups = CreateUser.class)
    private String rg;

    @Column(name = "valido", nullable = false)
    @NotNull
    private boolean valido;


    
    @OneToMany(mappedBy = "user")
    private List<Ingresso> ingressos = new ArrayList<>();

    
    @OneToMany(mappedBy = "user")
    private List<Notificacao> notificacoes = new ArrayList<>();

    
    @OneToMany(mappedBy = "comprador")
    private List<Compra> comprasComoComprador = new ArrayList<>();

    
    @OneToMany(mappedBy = "user")
    private List<Denuncia> denuncias = new ArrayList<>();

    
    @OneToMany(mappedBy = "vendedor")
    private List<Compra> comprasComoVendedor = new ArrayList<>();

    public User() {
    }

    public User(Long id, String username, String password, String cpf, String email, String chavePix, Float rating, String rg) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.cpf = cpf;
        this.email = email;
        this.chavePix = chavePix;
        this.rg = rg;
    }

    // Getters e setters para todos os atributos

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

    public List<Notificacao> getNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(List<Notificacao> notificacoes) {
        this.notificacoes = notificacoes;
    }

    public List<Compra> getComprasComoComprador() {
        return comprasComoComprador;
    }

    public void setComprasComoComprador(List<Compra> comprasComoComprador) {
        this.comprasComoComprador = comprasComoComprador;
    }

    public List<Compra> getComprasComoVendedor() {
        return comprasComoVendedor;
    }

    public void setComprasComoVendedor(List<Compra> comprasComoVendedor) {
        this.comprasComoVendedor = comprasComoVendedor;
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

    public List<Avaliacao> getRating() {
        return this.rating;
    }

    public void setRating(List <Avaliacao> rating) {
        this.rating = rating;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public void adicionarCompraComoComprador(Compra compra) {
        this.comprasComoComprador.add(compra);
    }
    
    public void adicionarCompraComoVendedor(Compra compra) {
        this.comprasComoVendedor.add(compra);
    }

    public double getMediaRating(){
        
        

        OptionalDouble media = rating.stream()
                .mapToDouble(Avaliacao::getEstrelas)
                .average();

        return media.orElse(0.0); // Ou qualquer valor padrão que você deseje retornar
    }

    

    // Método equals atualizado para incluir os novos atributos

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        User other = (User) obj;
        return Objects.equals(this.id, other.id) && Objects.equals(this.username, other.username) &&
                Objects.equals(this.password, other.password) && Objects.equals(this.cpf, other.cpf) &&
                Objects.equals(this.email, other.email) && Objects.equals(this.chavePix, other.chavePix) &&
                Objects.equals(this.rating, other.rating) && Objects.equals(this.rg, other.rg);
    }

    // Método hashCode também deve ser atualizado para incluir os novos atributos

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, cpf, email, chavePix, rating, rg);
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

    public List<Denuncia> getDenuncias() {
        return this.denuncias;
    }

    public void setDenuncias(List<Denuncia> denuncias) {
        this.denuncias = denuncias;
    }


    // metodos UserDatails IMPLEMENTAR

    

}

/* 
{
  "id": 1,
  "username": "usuarioExemplo",
  "password": "senha123",
  "cpf": "123.456.789-01",
  "email": "usuario@example.com",
  "chavePix": "chavePixExemplo",
  "rg": "1234567",
  "valido": true,
  "rating": [
    {
      "estrelas": 4.5,
      "status": true,
      "data": "2023-11-17"
    },
    {
      "estrelas": 5.0,
      "status": true,
      "data": "2023-11-18"
    }
  ],
  "ingressos": [
    {
      "description": "Concerto",
      "data": "2023-12-01",
      "status": "VALIDO"
    },
    {
      "description": "Teatro",
      "data": "2023-12-15",
      "status": "EM_COMPRA"
    }
  ],
  "notificacoes": [
    {
      "notificacao": "Nova mensagem recebida",
      "data": "2023-11-17",
      "lida": false
    },
    {
      "notificacao": "Novo evento disponível",
      "data": "2023-11-18",
      "lida": true
    }
  ],
  "comprasComoComprador": [
    {
      "data": "2023-11-20",
      "status": "CONCLUIDA",
      "vendedor": {
        "id": 2,
        "username": "vendedorExemplo",
        "password": "senha456",
        "cpf": "987.654.321-01",
        "email": "vendedor@example.com",
        "chavePix": "chavePixVendedor",
        "rg": "7654321"
      }
    }
  ],
  "comprasComoVendedor": [
    {
      "data": "2023-11-25",
      "status": "PENDENTE",
      "comprador": {
        "id": 3,
        "username": "compradorExemplo",
        "password": "senha789",
        "cpf": "111.222.333-01",
        "email": "comprador@example.com",
        "chavePix": "chavePixComprador",
        "rg": "112233"
      }
    }
  ],
  "denuncias": [
    {
      "motivo": "Comportamento inadequado",
      "status": "PENDENTE",
      "data": "2023-11-30"
    }
  ]
}
}
*/

/* 
{
  "id": 1,
  "username": "usuarioExemplo",
  "password": "senha123",
  "cpf": "123.456.789-01",
  "email": "usuario@example.com",
  "chavePix": "chavePixExemplo",
  "rg": "1234567",
  "valido": true
}
*/