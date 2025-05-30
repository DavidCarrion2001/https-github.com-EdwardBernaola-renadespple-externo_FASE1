package com.example.Prueba.Application.Adapter.out.persistence;

import com.example.Prueba.Application.Domain.Model.TipoEstablecimiento;
import com.example.Prueba.Application.Domain.Port.Out.TipoEstablecimientoRepositoryport;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class TipoEstablecimientoRepositoryAdapter implements TipoEstablecimientoRepositoryport {

    private final TipoEstablecimientoJpaRepository repository;

    public TipoEstablecimientoRepositoryAdapter(TipoEstablecimientoJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public TipoEstablecimiento save(TipoEstablecimiento tipoEstablecimiento) {
        TipoEstablecimientoJpaEntity entity = ToEntity(tipoEstablecimiento);
        return ToDomain(repository.save(entity));
    }

    @Override
    public List<TipoEstablecimiento> findAll() {
        return repository.findAll().stream().map(this::ToDomain).collect(Collectors.toList());
    }

    @Override
    public Optional<TipoEstablecimiento> findById(Integer id) {
        return repository.findById(id).map(this::ToDomain);
    }


    private TipoEstablecimiento ToDomain(TipoEstablecimientoJpaEntity entity){
        TipoEstablecimiento domain = new TipoEstablecimiento();
        domain.setId_tipo_extablecimiento(entity.getId());
        domain.setDescripcion(entity.getDescripcion());
        domain.setActivo(entity.getActivo());
        domain.setUsuario_creador(entity.getUsuarioCreador());
        domain.setFecha_creacion(entity.getFechaCreacion());
        domain.setFecha_modificacion(entity.getFechaModificacion());
        domain.setUsuario_modificador(entity.getUsuarioModificador());

        return domain;

    };

    private TipoEstablecimientoJpaEntity ToEntity(TipoEstablecimiento domain){
        TipoEstablecimientoJpaEntity entity = new TipoEstablecimientoJpaEntity();
        entity.setId(domain.getId_tipo_extablecimiento());
        entity.setDescripcion(domain.getDescripcion());
        entity.setActivo(domain.getActivo());
        entity.setFechaCreacion(domain.getFecha_creacion());
        entity.setFechaModificacion(domain.getFecha_modificacion());
        entity.setUsuarioCreador(domain.getUsuario_creador());
        entity.setUsuarioModificador(domain.getUsuario_modificador());
        return entity;

    };
}
