package com.example.Prueba.Application.Domain.Port.Out;

import com.example.Prueba.Application.Domain.Model.TiempoMedida;
import com.example.Prueba.Application.Domain.Model.TipoDocumento;

import java.util.List;
import java.util.Optional;

public interface TiempoMedidaRepositoryport {

    TiempoMedida save(TiempoMedida tiempoMedida);
    List<TiempoMedida> findAll();
    Optional<TiempoMedida> findById(Integer id);
}
