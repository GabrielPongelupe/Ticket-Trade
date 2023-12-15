package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Ingresso;

import java.util.List;
 
@Repository
public interface IngressoRepository extends JpaRepository<Ingresso, Long> {

    List<Ingresso> findByUser_id(Long id);

    @Query(value = "SELECT i FROM Ingresso i WHERE i.user.id = :user_id")
    List<Ingresso> findPeloUserID(@Param("user_id") Long id);

    /*@Query("SELECT i FROM Ingresso i WHERE i.compra.userComprador.id = :user_id")
    List<Ingresso> findByCompradorId(@Param("user_id") Long id);*/
     
}