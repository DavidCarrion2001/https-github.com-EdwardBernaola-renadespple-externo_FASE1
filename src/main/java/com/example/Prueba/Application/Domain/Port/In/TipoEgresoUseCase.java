package com.example.Prueba.Application.Domain.Port.In;

import com.example.Prueba.Application.Domain.Model.TipoEgreso;

import java.util.List;
import java.util.Optional;

public interface TipoEgresoUseCase {

    TipoEgreso save(TipoEgreso tipoEgreso);
    List<TipoEgreso> findAll();
    Optional<TipoEgreso> findById(Integer id);
}
