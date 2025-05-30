package com.example.Prueba.Application.Domain.Port.Out;

import com.example.Prueba.Application.Domain.Model.TipoPersona;

import java.util.List;
import java.util.Optional;

public interface TipoPersonaRepositoryport {

    TipoPersona save(TipoPersona tipoPersona);
    List<TipoPersona> findAll();
    Optional<TipoPersona> findById(Integer id);

}
