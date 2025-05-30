package com.example.Prueba.Application.Adapter.in.controller;

import com.example.Prueba.Application.Domain.Model.TipoPersona;
import com.example.Prueba.Application.Domain.Port.In.TipoPersonaUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tipo_persona")
public class TipoPersonaController {

    private final TipoPersonaUseCase service;
    public TipoPersonaController(TipoPersonaUseCase service) {
        this.service = service;
    }

    @GetMapping
    public List<TipoPersona>findAll()
    {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<TipoPersona> findByID(@PathVariable Integer id)
    {
        return service.findById(id);
    }

    @PostMapping
    public TipoPersona save(@RequestBody TipoPersona tipoPersona)
    {
        return service.save(tipoPersona);
    }
}
