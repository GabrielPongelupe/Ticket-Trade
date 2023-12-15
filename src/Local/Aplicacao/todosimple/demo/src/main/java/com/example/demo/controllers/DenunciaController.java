package com.example.demo.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.DTO.DTOCLASS.DenunciaDTO;
import com.example.demo.DTO.DTOMapper.DenunciaMapper;
import com.example.demo.models.Denuncia;
import com.example.demo.services.DenunciaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/denuncia") 
@Validated
public class DenunciaController {

    @Autowired
    private DenunciaService denunciaService;

    
    @GetMapping("/{id}")
    public ResponseEntity<DenunciaDTO> buscarPeloId(@PathVariable Long id) {
        Denuncia obj = this.denunciaService.buscarDenunciaPeloId(id);
        
        DenunciaDTO denunciaDTO = DenunciaMapper.toDTO(obj);
        denunciaDTO.setUser_id(obj.getUser().getId());

        return ResponseEntity.ok().body(denunciaDTO);
    }

     

    @GetMapping("/user/{id}")
    public ResponseEntity<List<DenunciaDTO>> buscarDenunciasPorUserId(@PathVariable Long id) {
        List<Denuncia> denuncias = this.denunciaService.buscarDenunciaPeloUserId(id);
        List<DenunciaDTO> denunciaDTOs = denuncias.stream().map(DenunciaMapper::toDTO).toList();
        //denuncias.stream().map(CompraMapper::toDTO).toList();
        return ResponseEntity.ok().body(denunciaDTOs);
    }

    @PostMapping
    @Validated
    public ResponseEntity<Denuncia> create(@Valid @RequestBody DenunciaDTO denunciaDTO) {
        Denuncia obj = DenunciaMapper.toEntity(denunciaDTO);
        this.denunciaService.create(denunciaDTO);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(obj.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{id}")
    @Validated
    public ResponseEntity<Void> update(@Valid @RequestBody DenunciaDTO denunciaDTO, @PathVariable Long id) {
        Denuncia obj = DenunciaMapper.toEntity(denunciaDTO);
        
        obj.setId(id);

        this.denunciaService.update(obj);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.denunciaService.delete(id);

        return ResponseEntity.noContent().build();
    }
}
