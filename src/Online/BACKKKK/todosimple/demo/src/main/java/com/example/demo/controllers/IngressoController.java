package com.example.demo.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.DTO.DTOCLASS.IngressoDto;
import com.example.demo.models.Ingresso;
import com.example.demo.models.User;
import com.example.demo.DTO.DTOMapper.IngressoMapper;

import com.example.demo.services.IngressoService;

import jakarta.validation.Valid;




@RestController
@RequestMapping("/ingresso")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Validated
public class IngressoController {

    @Autowired
    private IngressoService ingressoService;

    @Autowired
    private UserController userController;

    


    @GetMapping("/{id}")
    public ResponseEntity<IngressoDto> buscarPeloId(@PathVariable("id") Long id) {
        



        Ingresso ingresso = ingressoService.buscarIngressoPeloId(id);

        

        IngressoDto ingressoDto = IngressoMapper.toDto(ingresso);

        ingressoDto.setIdUser(ingresso.getUser().getId());

        

        return ResponseEntity.ok().body(ingressoDto);
    

    }

    @GetMapping("/user/{id}")
    public ResponseEntity<List<IngressoDto>> buscarListaDeIngressos(@PathVariable("id") Long id){
        List<Ingresso> ingressos = this.ingressoService.buscarIngressoPeloUserId(id);
        List<IngressoDto> ingressoDtos = new ArrayList<>();
        for(Ingresso ingresso : ingressos){
            IngressoDto ingressoDto = IngressoMapper.toDto(ingresso);
            try {
                ingressoDto.setIdCompra(ingresso.getCompra().getId());
            } catch (Exception e) {
                //
            }
            ingressoDto.setIdUser(id);
            ingressoDtos.add(ingressoDto);
             
        }
        return ResponseEntity.ok().body(ingressoDtos);
    }

    /*@GetMapping("/comprador/{id}")
    public ResponseEntity<List<IngressoDto>> buscarPeloCompradorId(@PathVariable("id") Long id){
        List<Ingresso> ingressos = this.ingressoService.buscarPeloCompradorId(id);
        List<IngressoDto> ingressoDtos =  new ArrayList<>();

        for(Ingresso ingresso : ingressos){
            IngressoDto ingressoDto = IngressoMapper.toDto(ingresso);
            ingressoDtos.add(ingressoDto);
        }

        return ResponseEntity.ok().body(ingressoDtos);
    }*/

    @PostMapping
    @Validated
    public ResponseEntity<Ingresso> create(@Valid @RequestBody IngressoDto ingressoDto) {
        

        Ingresso obj = this.ingressoService.create(ingressoDto);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(obj.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }


    
    @PutMapping("/{id}")
    @Validated
    public ResponseEntity<Void> update(@Valid @RequestBody IngressoDto objDTO, @PathVariable Long id) {


        this.ingressoService.update(objDTO);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.ingressoService.delete(id);

        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}/mudarStatus")
    @Validated
    public ResponseEntity<Void> mudarStatus(@Valid @RequestBody IngressoDto obj, @PathVariable Long id){
        

        this.ingressoService.update(obj);

        return ResponseEntity.noContent().build();

    }
}