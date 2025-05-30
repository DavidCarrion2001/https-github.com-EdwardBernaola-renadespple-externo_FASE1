package com.example.Prueba.Application.Domain.Port.In;

import com.example.Prueba.Application.Domain.Model.TipoEstablecimiento;

import java.util.List;
import java.util.Optional;

public interface TipoEstablecimientoUseCase {

    TipoEstablecimiento save(TipoEstablecimiento tipoEstablecimiento);
    List<TipoEstablecimiento> findAll();
    Optional<TipoEstablecimiento> findById(Integer id);
}
