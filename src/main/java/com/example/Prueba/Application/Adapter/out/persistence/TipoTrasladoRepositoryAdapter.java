package com.example.Prueba.Application.Adapter.out.persistence;

import com.example.Prueba.Application.Domain.Model.TipoTraslado;
import com.example.Prueba.Application.Domain.Port.Out.TipoTrasladoRepositoryport;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class TipoTrasladoRepositoryAdapter implements TipoTrasladoRepositoryport {

    private final TipoTrasladoJpaRepository repository;

    public TipoTrasladoRepositoryAdapter(TipoTrasladoJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public TipoTraslado save(TipoTraslado tipoTraslado) {
        TipoTrasladoJpaEntity entity = ToEntity(tipoTraslado);
        return ToDomain(repository.save(entity));
    }

    @Override
    public List<TipoTraslado> findAll()
    {
        return repository.findAll().stream().map(this::ToDomain).collect(Collectors.toList());
    }

    @Override
    public Optional<TipoTraslado> findById(Integer id) {
        return repository.findById(id).map(this::ToDomain);
    }

    @Override
    public void deleteByIdAI(TipoTraslado tipoTraslado) {

    }

    private TipoTraslado ToDomain(TipoTrasladoJpaEntity entity){
        TipoTraslado domain = new TipoTraslado();
        domain.setId(entity.getId());
        domain.setDescripcion(entity.getDescripcion());
        domain.setActivio(entity.getActivo());
        //domain.setUsusarioCreador(entity.getUsuarioCreador());
        domain.setFechaCreacion(entity.getFechaCreacion());
        //domain.setFechaModificacion(entity.getFechaModificacion());
        //domain.setUsuarioModificador(entity.getUsuarioModificador());

        return domain;

    };

    private TipoTrasladoJpaEntity ToEntity(TipoTraslado domain){
        TipoTrasladoJpaEntity entity = new TipoTrasladoJpaEntity();
        entity.setId(domain.getId());
        entity.setDescripcion(domain.getDescripcion());
        entity.setActivo(domain.getActivio());
        entity.setFechaCreacion(domain.getFechaCreacion());
        //entity.setFechaModificacion(domain.getFechaModificacion());
        //entity.setUsuarioCreador(domain.getUsusarioCreador());
        //entity.setUsuarioModificador(domain.getUsuarioModificador());
        return entity;

    };
}
