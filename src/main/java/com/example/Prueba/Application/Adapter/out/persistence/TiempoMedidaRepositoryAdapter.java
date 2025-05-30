package com.example.Prueba.Application.Adapter.out.persistence;

import com.example.Prueba.Application.Domain.Model.TiempoMedida;
import com.example.Prueba.Application.Domain.Port.Out.TiempoMedidaRepositoryport;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class TiempoMedidaRepositoryAdapter implements TiempoMedidaRepositoryport {

    private final TiempoMedidaJpaRepository repository;

    public TiempoMedidaRepositoryAdapter(TiempoMedidaJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public TiempoMedida save(TiempoMedida tiempoMedida) {
        TiempoMedidaJpaEntity entity = new TiempoMedidaJpaEntity();
        return ToDomain(repository.save(entity));
    }

    @Override
    public List<TiempoMedida> findAll() {
        return repository.findAll().stream().map(this::ToDomain).collect(Collectors.toList());
    }

    @Override
    public Optional<TiempoMedida> findById(Integer id) {
        return repository.findById(id).map(this::ToDomain);
    }

    private TiempoMedida ToDomain(TiempoMedidaJpaEntity entity){
        TiempoMedida domain = new TiempoMedida();
        domain.setId_tiempo_medida(entity.getId_tiempo_medida());
        domain.setDescripcion(entity.getDescripcion());
        domain.setActivo(entity.getActivo());
        domain.setUsuario_creador(entity.getUsuario_creador());
        domain.setFecha_creacion(entity.getFecha_creacion());
        domain.setFecha_modificacion(entity.getFecha_modificacion());
        domain.setUsusario_modificador(entity.getUsusario_modificador());

        return domain;

    };

    private TiempoMedidaJpaEntity ToEntity(TiempoMedida domain){
        TiempoMedidaJpaEntity entity = new TiempoMedidaJpaEntity();
        entity.setId_tiempo_medida(domain.getId_tiempo_medida());
        entity.setDescripcion(domain.getDescripcion());
        entity.setActivo(domain.getActivo());
        entity.setFecha_creacion(domain.getFecha_creacion());
        entity.setFecha_modificacion(domain.getFecha_modificacion());
        entity.setUsuario_creador(domain.getUsuario_creador());
        entity.setFecha_modificacion(domain.getFecha_modificacion());

        return entity;

    };
}
