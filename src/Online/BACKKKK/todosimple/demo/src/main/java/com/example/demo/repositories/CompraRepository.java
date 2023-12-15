package com.example.demo.repositories;

import java.util.List;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.Compra;

public interface CompraRepository extends JpaRepository<Compra, Long>{
    
   /*  
    @Query(value = "SELECT c FROM Compra c WHERE c.usuarioComprador.id = :user_id")
    List<Compra> findPeloCompradorId(@Param("user_id") Long id);

    @Query(value = "SELECT c FROM Compra c WHERE c.usuarioVendedor.id = :user_id")
    List<Compra> findPeloVendedorId(@Param("user_id") Long id);
    */ 


    // QUERY DE INDICADORES...
    @Query("SELECT c FROM Compra c WHERE MONTH(c.data) = :mes")
    List<Compra> findComprasByMes(@Param("mes") int mes);

    @Query("SELECT COALESCE(SUM(c.ingresso.valor), 0) FROM Compra c WHERE MONTH(c.data) = :mes")
    Double sumValorIngressosPorMes(@Param("mes") int mes);

    
}
