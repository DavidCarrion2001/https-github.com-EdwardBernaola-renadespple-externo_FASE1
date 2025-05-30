package com.example.Prueba.Application.Adapter.out.persistence;

import com.example.Prueba.Application.Domain.Model.TipoDocumento;
import com.example.Prueba.Application.Domain.Port.Out.TipoDocumentoRepositoryport;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class TipoDocumentoRepositoryAdapter implements TipoDocumentoRepositoryport {

    private final TipoDocumentoJpaRepository repository;

    public TipoDocumentoRepositoryAdapter(TipoDocumentoJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public TipoDocumento save(TipoDocumento tipoDocumento) {
        TipoDocumentoJpaEntity entity = new TipoDocumentoJpaEntity();
        return ToDomain(repository.save(entity));
    }

    @Override
    public List<TipoDocumento> findAll(){
        return repository.findAll().stream().map(this::ToDomain).collect(Collectors.toList());
    }

    @Override
    public Optional<TipoDocumento> findById(Integer id)
    {
        return repository.findById(id).map(this::ToDomain);
    }

    private TipoDocumento ToDomain(TipoDocumentoJpaEntity entity){
        TipoDocumento domain = new TipoDocumento();
        domain.setId_tipo_documento(entity.getId());
        domain.setDescripcion(entity.getDescripcion());
        domain.setActivo(entity.getActivo());
        domain.setUsuario_creador(entity.getUsuario_creador());
        domain.setFecha_creacion(entity.getFecha_creacion());
        domain.setFecha_modificacion(entity.getFecha_modificacion());
        domain.setUsuario_modificador(entity.getUsuario_modificador());
        domain.setSigla(entity.getSigla());

        return domain;

    };

    private TipoDocumentoJpaEntity ToEntity(TipoDocumento domain){
        TipoDocumentoJpaEntity entity = new TipoDocumentoJpaEntity();
        entity.setId(domain.getId_tipo_documento());
        entity.setDescripcion(domain.getDescripcion());
        entity.setActivo(domain.getActivo());
        entity.setFecha_creacion(domain.getFecha_creacion());
        entity.setFecha_modificacion(domain.getFecha_modificacion());
        entity.setUsuario_creador(domain.getUsuario_creador());
        entity.setFecha_modificacion(domain.getFecha_modificacion());
        entity.setSigla(domain.getSigla());

        return entity;

    };


}
