package com.example.demo.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.example.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.DTO.DTOCLASS.CompraDTO;
import com.example.demo.DTO.DTOMapper.CompraMapper;
import com.example.demo.models.Compra;
import com.example.demo.models.StatusCompra;
import com.example.demo.repositories.CompraRepository;

@Service
public class CompraService {

    @Autowired
    private CompraRepository compraRepository;

    @Autowired
    private UserService userService; 

   

    @Autowired
    private IngressoService ingressoService;

    @Transactional
    public Compra create(CompraDTO compraDTO) {
        
        Compra compra = CompraMapper.toEntity(compraDTO);
        
        compra.setUsuarioComprador(this.userService.buscarPeloIdUser(compraDTO.getCompradorId()));
        compra.setUsuarioVendedor(this.ingressoService.buscarIngressoPeloId(compraDTO.getIngressoId())
        .getUser());
        

        compra.setData(LocalDate.now());
        compra.setId(null);
        
        compra.setIngresso(this.ingressoService.buscarIngressoPeloId(compraDTO.getIngressoId()));
        compra.setStatus(StatusCompra.NAO_PAGO);
        this.compraRepository.save(compra);
        
        return compra;
    }

    @Transactional
    public Compra update(Compra compra) {
        Compra existingCompra = buscarCompraPeloId(compra.getId());

        existingCompra.setData(compra.getData());
        existingCompra.setStatus(compra.getStatus());
        existingCompra.setUsuarioComprador(compra.getUsuarioComprador());
        existingCompra.setUsuarioVendedor(compra.getUsuarioVendedor());
                                                                                                                                                                                                                                            

        return compraRepository.save(existingCompra);
    }

    public Compra buscarCompraPeloId(Long id) {
        Optional<Compra> compra = compraRepository.findById(id);

        return compra.orElseThrow(() -> new RuntimeException(
                "Não foi possível encontrar esta Compra: " + id + " do Tipo: " + Compra.class.getName()
        ));
    }

    public List<Compra> findPeloCompradorId(Long id) {
        User user = this.userService.buscarPeloIdUser(id);

        return user.getComprasComoComprador();
    }

    public List<Compra> findPeloVendedorId(Long id) {
        User user = userService.buscarPeloIdUser(id);

        return user.getComprasComoVendedor();
    }

    public List<Compra> findComprasByMes(int mes){
        return this.compraRepository.findComprasByMes(mes);
    }

    public void delete(Long id) {
        Compra compra = buscarCompraPeloId(id);

        try {
            compraRepository.delete(compra);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível deletar a compra: " + id);
        }
    }

    public Double sumValorIngressosPorMes(int mes){
        return this.compraRepository.sumValorIngressosPorMes(mes);
    }

}