package com.example.Prueba.Application.Servicios;

import com.example.Prueba.Application.Domain.Model.TipoEgreso;
import com.example.Prueba.Application.Domain.Port.In.TipoEgresoUseCase;
import com.example.Prueba.Application.Domain.Port.Out.TipoEgresoRepositoryport;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoEgresoService implements TipoEgresoUseCase {

    private final TipoEgresoRepositoryport repository;

    public TipoEgresoService(TipoEgresoRepositoryport repository) {
        this.repository = repository;
    }

    @Override
    public TipoEgreso save(TipoEgreso tipoEgreso) {
        return this.repository.save(tipoEgreso);
    }

    @Override
    public List<TipoEgreso> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Optional<TipoEgreso> findById(Integer id) {
        return this.repository.findById(id);
    }
}
