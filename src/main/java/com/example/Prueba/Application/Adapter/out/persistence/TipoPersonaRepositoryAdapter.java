package com.example.Prueba.Application.Adapter.out.persistence;

import com.example.Prueba.Application.Domain.Model.TipoPersona;
import com.example.Prueba.Application.Domain.Port.Out.TipoPersonaRepositoryport;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class TipoPersonaRepositoryAdapter implements TipoPersonaRepositoryport {

    private final TipoPersonaJpaRepository repository;

    public TipoPersonaRepositoryAdapter(TipoPersonaJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public TipoPersona save(TipoPersona tipoPersona) {
        TipoPersonaJpaEntity entity = ToEntity(tipoPersona);
        return ToDomain(repository.save(entity));
    }

    @Override
    public List<TipoPersona> findAll()
    {
        return repository.findAll().stream().map(this::ToDomain).collect(Collectors.toList());
    }

    @Override
    public Optional<TipoPersona> findById(Integer id) {
        return repository.findById(id).map(this::ToDomain);
    }


    private TipoPersona ToDomain(TipoPersonaJpaEntity entity){
        TipoPersona domain = new TipoPersona();
        domain.setId_tipo_perosona(entity.getId_tipo_persona());
        domain.setDescripcion(entity.getDescripcion());
        domain.setActivo(entity.getActivo());

        return domain;
    };

    private TipoPersonaJpaEntity ToEntity(TipoPersona domain){
        TipoPersonaJpaEntity entity = new TipoPersonaJpaEntity();
        entity.setId_tipo_persona(domain.getId_tipo_perosona());
        entity.setDescripcion(domain.getDescripcion());
        entity.setActivo(domain.getActivo());
        return entity;

    };
}
