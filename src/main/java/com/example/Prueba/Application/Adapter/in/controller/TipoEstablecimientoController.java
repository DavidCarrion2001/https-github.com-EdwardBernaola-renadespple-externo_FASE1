package com.example.Prueba.Application.Adapter.in.controller;

import com.example.Prueba.Application.Domain.Model.TipoEstablecimiento;
import com.example.Prueba.Application.Domain.Port.In.TipoEstablecimientoUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tipo_establecimiento")
public class TipoEstablecimientoController {

    private final TipoEstablecimientoUseCase service;
    public TipoEstablecimientoController(TipoEstablecimientoUseCase service)
    {this.service=service; }

    @GetMapping
    public List<TipoEstablecimiento> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<TipoEstablecimiento> findById(@PathVariable Integer id){
        return service.findById(id);
    }

    @PostMapping
    public TipoEstablecimiento save(@RequestBody TipoEstablecimiento tipoEstablecimiento){
        return service.save(tipoEstablecimiento);
    }

}
