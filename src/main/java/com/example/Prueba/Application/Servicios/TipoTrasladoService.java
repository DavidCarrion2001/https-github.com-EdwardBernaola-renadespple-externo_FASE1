package com.example.Prueba.Application.Servicios;

import com.example.Prueba.Application.Domain.Model.TipoTraslado;
import com.example.Prueba.Application.Domain.Port.In.TipoTrasladoUseCase;
import com.example.Prueba.Application.Domain.Port.Out.TipoTrasladoRepositoryport;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TipoTrasladoService implements TipoTrasladoUseCase {

    private final TipoTrasladoRepositoryport repository;

    public TipoTrasladoService(TipoTrasladoRepositoryport repository) {
        this.repository = repository;
    }


    @Override
    public TipoTraslado save(TipoTraslado tipoTraslado) {
        return repository.save(tipoTraslado);
    }

    @Override
    public List<TipoTraslado> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<TipoTraslado> findByID(Integer id) {
        return repository.findById(id);
    }

    /*@Override
    public TipoTraslado update(Integer id, String descripcion, String usuario_modificador, ZonedDateTime fecha_modificacion) {
        return null;
    }*/

}
