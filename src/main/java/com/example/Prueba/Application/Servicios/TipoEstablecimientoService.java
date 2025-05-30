package com.example.Prueba.Application.Servicios;

import com.example.Prueba.Application.Domain.Model.TipoEstablecimiento;
import com.example.Prueba.Application.Domain.Port.In.TipoEstablecimientoUseCase;
import com.example.Prueba.Application.Domain.Port.Out.TipoEstablecimientoRepositoryport;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoEstablecimientoService implements TipoEstablecimientoUseCase {

    private final TipoEstablecimientoRepositoryport repository;

    public TipoEstablecimientoService(TipoEstablecimientoRepositoryport repository) {
        this.repository = repository;
    }

    @Override
    public TipoEstablecimiento save(TipoEstablecimiento tipoEstablecimiento) {
        return this.repository.save(tipoEstablecimiento);
    }

    @Override
    public List<TipoEstablecimiento> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Optional<TipoEstablecimiento> findById(Integer id) {
        return this.repository.findById(id);
    }
}
