package com.example.Prueba.Application.Domain.Port.Out;


import com.example.Prueba.Application.Domain.Model.TipoTraslado;

import java.util.List;
import java.util.Optional;

public interface TipoTrasladoRepositoryport {

    TipoTraslado save(TipoTraslado tipoTraslado);
    List<TipoTraslado> findAll();
    Optional<TipoTraslado>findById(Integer id);
    void deleteByIdAI(TipoTraslado tipoTraslado);

}
