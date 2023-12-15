package com.example.demo.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.DTO.DTOCLASS.AvaliacaoDTO;
import com.example.demo.DTO.DTOMapper.AvaliacaoMapper;
import com.example.demo.models.Avaliacao;
import com.example.demo.services.AvaliacaoService;


import jakarta.validation.Valid;

@RestController
@RequestMapping("/avaliacao")
@Validated
public class AvaliacaoController {

    @Autowired
    private AvaliacaoService avaliacaoService;

    

    @GetMapping("/{id}") 
    public ResponseEntity<AvaliacaoDTO> buscarPeloId(@PathVariable("id") Long id) {
        Avaliacao avaliacao = this.avaliacaoService.encontrarAvaliacaoPorId(id);
        
        AvaliacaoDTO avaliacaoDTO = AvaliacaoMapper.toDTO(avaliacao);
        // avaliacaoDTO.setUserId(this.userService.findUserByAvaliacaoId(id).getId()); NAO PRECISA, 
        // TA DANDO CERTO
        return ResponseEntity.ok().body(avaliacaoDTO);
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<List<AvaliacaoDTO>> buscarAvaliacoesDoUsuario(@PathVariable Long id) {
        List<Avaliacao> avaliacoes = this.avaliacaoService.buscarAvaliacoesDoUsuario(id);
        List<AvaliacaoDTO> avaliacoesDTO = AvaliacaoMapper.toDTOList(avaliacoes);
        return ResponseEntity.ok().body(avaliacoesDTO);
    }

    
    @PostMapping
    @Validated
    public ResponseEntity<AvaliacaoDTO> create(@Valid @RequestBody AvaliacaoDTO avaliacaoDTO) {
        Avaliacao avaliacao = this.avaliacaoService.create(avaliacaoDTO);

        
        

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(avaliacao.getAvaliacaoId()).toUri();

        return ResponseEntity.created(uri).body(AvaliacaoMapper.toDTO(avaliacao));
    }

    

    @PutMapping("/{id}")
    @Validated
    public ResponseEntity<Void> update(@Valid @RequestBody AvaliacaoDTO avaliacaoDTO, @PathVariable Long id) {
        Avaliacao avaliacao = AvaliacaoMapper.toEntity(avaliacaoDTO);
        avaliacao.setAvaliacaoId(id);

        this.avaliacaoService.update(avaliacao);

        return ResponseEntity.noContent().build();
    }
 
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.avaliacaoService.delete(id);

        return ResponseEntity.noContent().build();
    }
}