package com.example.Prueba.Application.Adapter.in.controller;

import com.example.Prueba.Application.Domain.Model.TiempoMedida;
import com.example.Prueba.Application.Domain.Port.In.TiempoMedidaUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tiempo_medida")
public class TiempoMedidaController {

    private final TiempoMedidaUseCase service;
    public TiempoMedidaController(TiempoMedidaUseCase service) {
        this.service = service;
    }

    @GetMapping
    public List<TiempoMedida> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<TiempoMedida> findById(@PathVariable Integer id){
        return service.findById(id);
    }

    @PostMapping
    public TiempoMedida save(@RequestBody TiempoMedida tiempoMedida){
        return service.save(tiempoMedida);
    }
}
