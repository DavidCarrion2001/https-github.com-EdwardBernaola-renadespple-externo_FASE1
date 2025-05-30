package com.example.Prueba.Application.Adapter.in.controller;

import com.example.Prueba.Application.Domain.Model.TipoEgreso;
import com.example.Prueba.Application.Domain.Port.In.TipoEgresoUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tipo_egreso")
public class TipoEgresoController {

    private final TipoEgresoUseCase service;
    public TipoEgresoController(TipoEgresoUseCase service) {
        this.service = service;
    }

    @GetMapping
    public List<TipoEgreso> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<TipoEgreso> findById(@PathVariable Integer id){
        return service.findById(id);
    }

    @PostMapping
    public TipoEgreso save(@RequestBody TipoEgreso tipoEgreso){
        return service.save(tipoEgreso);
    }
}
