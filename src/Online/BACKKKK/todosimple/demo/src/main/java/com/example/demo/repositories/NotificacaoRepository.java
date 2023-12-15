package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.models.Notificacao;

public interface NotificacaoRepository extends JpaRepository<Notificacao, Long>{
    
    @Query(value = "SELECT d FROM Notificacao d WHERE d.user.id = :user_id")
    List<Notificacao> findPeloUserID(@Param("user_id") Long id);
}