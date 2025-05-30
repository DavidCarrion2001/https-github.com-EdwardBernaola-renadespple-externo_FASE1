package com.example.Prueba.Application.Servicios;

import com.example.Prueba.Application.Domain.Model.TipoPersona;
import com.example.Prueba.Application.Domain.Port.In.TipoPersonaUseCase;
import com.example.Prueba.Application.Domain.Port.Out.TipoPersonaRepositoryport;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoPerosnaService implements TipoPersonaUseCase {

    private final TipoPersonaRepositoryport repository;

    public TipoPerosnaService(TipoPersonaRepositoryport repository) {
        this.repository = repository;
    }

    @Override
    public TipoPersona save(TipoPersona tipoPersona) {
        return repository.save(tipoPersona);
    }

    @Override
    public List<TipoPersona> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<TipoPersona> findById(Integer id) {
        return repository.findById(id);
    }
}
