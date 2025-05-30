package com.example.Prueba.Application.Domain.Port.Out;

import com.example.Prueba.Application.Domain.Model.TipoEstablecimiento;

import java.util.List;
import java.util.Optional;

public interface TipoEstablecimientoRepositoryport {

    TipoEstablecimiento save(TipoEstablecimiento tipoEstablecimiento);
    List<TipoEstablecimiento> findAll();
    Optional<TipoEstablecimiento> findById(Integer id);

}
