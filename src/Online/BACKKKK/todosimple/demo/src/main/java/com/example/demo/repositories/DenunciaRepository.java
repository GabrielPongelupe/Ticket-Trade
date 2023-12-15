package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.Denuncia;


public interface DenunciaRepository extends JpaRepository<Denuncia, Long> {
    
    Optional<Denuncia> findById(Long id);

    
    @Query(value = "SELECT d FROM Denuncia d WHERE d.user.id = :user_id")
    List<Denuncia> findPeloUserID(@Param("user_id") Long id);
    
}