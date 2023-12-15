package com.example.demo.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.DTO.DTOCLASS.CompraDTO;
import com.example.demo.DTO.DTOMapper.CompraMapper;
import com.example.demo.models.Compra;
import com.example.demo.services.CompraService;


import jakarta.validation.Valid;

@RestController
@RequestMapping("/compra")
@Validated
public class CompraController {

    @Autowired
    private CompraService compraService;

    

    @GetMapping("/{id}")
    public ResponseEntity<CompraDTO> buscarPeloId(@PathVariable Long id) {
        Compra compra = this.compraService.buscarCompraPeloId(id);
        CompraDTO compraDTO = CompraMapper.toDTO(compra);
        return ResponseEntity.ok().body(compraDTO);
    }

    @GetMapping("/comprador/{id}")
    public ResponseEntity<List<CompraDTO>> findPeloCompradorId(@PathVariable Long id) {
        List<Compra> compras = this.compraService.findPeloCompradorId(id);
        List<CompraDTO> compraDTOs = compras.stream().map(CompraMapper::toDTO).toList();
        
        return ResponseEntity.ok().body(compraDTOs);
    }

    @GetMapping("/vendedor/{id}")
    public ResponseEntity<List<CompraDTO>> findPeloVendedorId(@PathVariable Long id) {
        List<Compra> compras = this.compraService.findPeloVendedorId(id);
        List<CompraDTO> compraDTOs = compras.stream().map(CompraMapper::toDTO).toList();
        return ResponseEntity.ok().body(compraDTOs);
    }
 
    @PostMapping
    @Validated
    public ResponseEntity<Compra> create(@Valid @RequestBody CompraDTO compraDTO) {
        
        
    
        Compra compra = this.compraService.create(compraDTO);
        

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(compra.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }


    @PutMapping("/{id}")
    @Validated
    public ResponseEntity<Void> update(@Valid @RequestBody CompraDTO compraDTO, @PathVariable Long id) {
        Compra compra = CompraMapper.toEntity(compraDTO);
        compra.setId(id);

        this.compraService.update(compra);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.compraService.delete(id);

        return ResponseEntity.noContent().build();
    }

    //METODOS DOS INDICADORES:
    @GetMapping("/porMes/{mes}")
    public ResponseEntity<Integer> countComprasPorMes(@PathVariable int mes) throws Exception{
        if (mes > 0 && mes < 13){
            List<Compra> compras = this.compraService.findComprasByMes(mes);
            return ResponseEntity.ok().body(compras.size());
        }else{
            throw new Exception("Mes invalido, tente novamente");
        }
    }

    @GetMapping("/LucroPorMes/{mes}")
    public ResponseEntity<Double> lucroPorMes(@PathVariable int mes) throws Exception {
        if (mes > 0 && mes < 13){
            Double valor = this.compraService.sumValorIngressosPorMes(mes);
            return ResponseEntity.ok().body(valor);
        }else{
            throw new Exception("Mes invalido, tente novamente");
        }
    }
}