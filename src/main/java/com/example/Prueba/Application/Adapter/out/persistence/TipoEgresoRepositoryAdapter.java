package com.example.Prueba.Application.Adapter.out.persistence;


import com.example.Prueba.Application.Domain.Model.TipoEgreso;
import com.example.Prueba.Application.Domain.Port.Out.TipoEgresoRepositoryport;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class TipoEgresoRepositoryAdapter implements TipoEgresoRepositoryport {

    private final TipoEgresoJpaRepository repository;

    public TipoEgresoRepositoryAdapter(TipoEgresoJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public TipoEgreso save(TipoEgreso tipoEgreso) {
        TipoEgresoJpaEntity entity = ToEntity(tipoEgreso);
        return ToDomain(repository.save(entity));
    }

    @Override
    public List<TipoEgreso> findAll() {
        return repository.findAll().stream().map(this::ToDomain).collect(Collectors.toList());
    }

    @Override
    public Optional<TipoEgreso> findById(Integer id)
    {
        return repository.findById(id).map(this::ToDomain);
    }


    private TipoEgreso ToDomain(TipoEgresoJpaEntity entity){
        TipoEgreso domain = new TipoEgreso();
        domain.setId_tipo_egreso(entity.getId());
        domain.setDescripcion(entity.getDescripcion());
        domain.setActivo(entity.getActivo());
        domain.setUsuario_creador(entity.getUsuarioCreador());
        domain.setFecha_creacion(entity.getFechaCreacion());
        domain.setFecha_modificacion(entity.getFechaModificacion());
        domain.setUsuario_modificador(entity.getUsuarioModificador());

        return domain;

    };

    private TipoEgresoJpaEntity ToEntity(TipoEgreso domain){
        TipoEgresoJpaEntity entity = new TipoEgresoJpaEntity();
        entity.setId(domain.getId_tipo_egreso());
        entity.setDescripcion(domain.getDescripcion());
        entity.setActivo(domain.getActivo());
        entity.setFechaCreacion(domain.getFecha_creacion());
        entity.setFechaModificacion(domain.getFecha_modificacion());
        entity.setUsuarioCreador(domain.getUsuario_creador());
        entity.setUsuarioModificador(domain.getUsuario_modificador());
        return entity;

    };
}
