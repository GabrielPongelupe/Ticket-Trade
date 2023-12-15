package com.example.demo.DTO.DTOMapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;

import com.example.demo.DTO.DTOCLASS.UserDTO;
import com.example.demo.models.Avaliacao;
import com.example.demo.models.Ingresso;
import com.example.demo.models.User;

public class UserMapper {
    public static UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);

        userDTO.setIngressos_Id(user.getIngressos().stream().map(Ingresso::getId).collect(Collectors.toList()));
        
      

        // Calcular a média das avaliações
        double mediaRating = calcularMediaAvaliacoes(user.getRating());
        userDTO.setMediaRating(mediaRating);

        return userDTO;
    }

    private static double calcularMediaAvaliacoes(List<Avaliacao> avaliacoes) {
        if (avaliacoes == null || avaliacoes.isEmpty()) {
            return 0.0;
        }

        double somaEstrelas = avaliacoes.stream().mapToDouble(Avaliacao::getEstrelas).sum();
        return somaEstrelas / avaliacoes.size();
    }

    public static User toEntity(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        // Aqui, você pode carregar os objetos relacionados do banco de dados conforme
        // necessário.
        return user;
    }
}