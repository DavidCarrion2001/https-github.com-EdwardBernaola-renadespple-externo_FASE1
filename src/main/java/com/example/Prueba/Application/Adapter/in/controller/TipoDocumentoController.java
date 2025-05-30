package com.example.Prueba.Application.Adapter.in.controller;

import com.example.Prueba.Application.Domain.Model.TipoDocumento;
import com.example.Prueba.Application.Domain.Port.In.TipoDocumentoUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tipo_documento")
public class TipoDocumentoController {

    private final TipoDocumentoUseCase service;
    public TipoDocumentoController(TipoDocumentoUseCase service) {
        this.service = service;
    }

    @GetMapping
    public List<TipoDocumento> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<TipoDocumento> findById(@PathVariable Integer id){
        return service.findById(id);
    }

    @PostMapping
    public TipoDocumento save(@RequestBody TipoDocumento tipoDocumento){
        return service.save(tipoDocumento);
    }
}
