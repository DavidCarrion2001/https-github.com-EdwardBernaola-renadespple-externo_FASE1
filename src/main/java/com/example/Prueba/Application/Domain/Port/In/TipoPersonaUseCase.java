package com.example.Prueba.Application.Domain.Port.In;

import com.example.Prueba.Application.Domain.Model.TipoPersona;

import java.util.List;
import java.util.Optional;

public interface TipoPersonaUseCase {

    TipoPersona save(TipoPersona tipoPersona);
    List<TipoPersona> findAll();
    Optional<TipoPersona> findById(Integer id);
}
