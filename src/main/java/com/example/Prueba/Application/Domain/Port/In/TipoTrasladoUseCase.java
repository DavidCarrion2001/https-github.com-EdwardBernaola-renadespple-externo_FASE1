package com.example.Prueba.Application.Domain.Port.In;

import com.example.Prueba.Application.Domain.Model.TipoTraslado;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

public interface TipoTrasladoUseCase {

    TipoTraslado save(TipoTraslado tipoTraslado);
    List<TipoTraslado>findAll();
    Optional<TipoTraslado>findByID(Integer id);
    //TipoTraslado update(Integer id, String descripcion, String usuario_modificador, ZonedDateTime fecha_modificacion);
}
