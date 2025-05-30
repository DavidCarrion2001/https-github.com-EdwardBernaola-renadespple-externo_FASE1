package com.example.Prueba.Application.Domain.Port.Out;

import com.example.Prueba.Application.Domain.Model.TipoEgreso;
import com.example.Prueba.Application.Domain.Model.TipoEstablecimiento;

import java.util.List;
import java.util.Optional;

public interface TipoEgresoRepositoryport {

    TipoEgreso save(TipoEgreso tipoEgreso);
    List<TipoEgreso> findAll();
    Optional<TipoEgreso> findById(Integer id);
}
