package com.example.demo.services;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.DTO.DTOCLASS.AvaliacaoDTO;
import com.example.demo.DTO.DTOMapper.AvaliacaoMapper;
import com.example.demo.models.Avaliacao;
import com.example.demo.models.User;
import com.example.demo.repositories.AvaliacaoRepository;

@Service
public class AvaliacaoService {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    @Autowired
    private UserService userService;

    
    public Avaliacao encontrarAvaliacaoPorId(Long avaliacaoId) {
        Optional<Avaliacao> avaliacaoOptional = avaliacaoRepository.findById(avaliacaoId);
        return avaliacaoOptional.orElseThrow(() -> new RuntimeException(
                "Avaliação não encontrada com o ID: " + avaliacaoId));
    }

    public List<Avaliacao> buscarAvaliacoesDoUsuario(Long id){
        User user = userService.buscarPeloIdUser(id);
        return user.getRating();
    }

    @Transactional
    public Avaliacao create(AvaliacaoDTO avaliacaoDTO) {
        Avaliacao avaliacao = AvaliacaoMapper.toEntity(avaliacaoDTO);

        avaliacao.setData(LocalDate.now());
        avaliacao.setAvaliadoPor(this.userService.buscarPeloIdUser(avaliacaoDTO.getUserId()));
        avaliacao.setAvaliacaoId(null); // Certificando-se de que o ID seja gerado automaticamente
        return avaliacaoRepository.save(avaliacao);
    }

    @Transactional
    public Avaliacao update(Avaliacao avaliacao) {
        Avaliacao existingAvaliacao = encontrarAvaliacaoPorId(avaliacao.getAvaliacaoId());
        existingAvaliacao.setEstrelas(avaliacao.getEstrelas());
        existingAvaliacao.setStatus(avaliacao.isStatus());
        
        return avaliacaoRepository.save(existingAvaliacao);
    }

    @Transactional
    public void delete(Long avaliacaoId) {

        encontrarAvaliacaoPorId(avaliacaoId);
        
        
        try{
            this.avaliacaoRepository.deleteById(avaliacaoId);
        }catch(Exception e){
            throw new RuntimeException("Não foi possivel deletar esta avaliação");
            // propaga RunTimeException ao captar exception
        }
    }




}