package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Compra;
import com.example.demo.models.Notificacao;
import com.example.demo.models.User;
import java.util.List;




@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // User findByUsername(String username); NAO APLICADO POIS OS findBy DESSES ATRIBUTOS PADRAO JA ESTAO
        // IMPLEMENTADOS NO JpaRepository

    Optional<User> findByUsername(String username);

    @Query("SELECT i.user FROM Ingresso i WHERE i.id = :ingressoId")
    Optional<User> findUserByIngressoId(@Param("ingressoId") Long ingressoId);

    @Query("SELECT u.user FROM Denuncia u WHERE u.id = :denunciaId")
    User findUserByDenunciaId(@Param("denunciaId") Long denunciaId);

    @Query("SELECT u FROM User u WHERE u.cpf = :userCpf")
    Optional<User> findUserByCpf(@Param("userCpf") String userCpf);

    @Query("SELECT c FROM Compra c WHERE c.comprador.id = :userId OR c.vendedor.id = :userId")
    List<Compra> findComprasByUserId(@Param("userId") Long userId);

    @Query("SELECT u FROM User u JOIN u.notificacoes n WHERE n.id = :notificacaoId")
    User findUserByNotificacaoId(@Param("notificacaoId") Long notificacaoId);

    @Query("SELECT u FROM User u WHERE u.username = :username AND u.password = :password")
    User efetuarLogin(@Param("username") String username, @Param("password") String password);

    @Query("SELECT c.comprador FROM Compra c WHERE c.id = :compraId")
    User findUserByCompraId(@Param("compraId") Long compraId);

    @Query("SELECT u FROM User u JOIN u.comprasComoVendedor c WHERE c.id = :compraId")
    Optional<User> findVendedorByCompraId(@Param("compraId") Long compraId);

    @Query("SELECT u FROM User u JOIN u.comprasComoComprador c WHERE c.id = :compraId")
    Optional<User> findCompradorByCompraId(@Param("compraId") Long compraId);
    
    @Query("SELECT n FROM User u JOIN u.notificacoes n WHERE u.id = :userId")
    List<Notificacao> findNotificacoesByUserId(@Param("userId") Long userId);

    @Query("SELECT u.id FROM User u WHERE u.cpf = :cpf")
    Optional<Long> findUserIdByCpf(@Param("cpf") String cpf);

    @Query("SELECT u FROM User u WHERE u.email = :email")
    Optional<User> loginRequest(@Param("email") String email);
    
    User findByEmail(String email);
    
}
