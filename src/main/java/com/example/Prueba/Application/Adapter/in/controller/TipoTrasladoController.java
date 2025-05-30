package com.example.Prueba.Application.Adapter.in.controller;

import com.example.Prueba.Application.Domain.Model.TipoTraslado;
import com.example.Prueba.Application.Domain.Port.In.TipoTrasladoUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/actividad-laboral")
public class TipoTrasladoController {
    private final TipoTrasladoUseCase service;
    public TipoTrasladoController(TipoTrasladoUseCase service)
    {this.service=service; }

    @GetMapping
    public List<TipoTraslado> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<TipoTraslado> findById(@PathVariable Integer id){
        return service.findByID(id);
    }

    @PostMapping
    public TipoTraslado save(@RequestBody TipoTraslado tipoTraslado){
        return service.save(tipoTraslado);
    }

}
