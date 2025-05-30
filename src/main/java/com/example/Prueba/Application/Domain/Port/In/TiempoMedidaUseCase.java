package com.example.Prueba.Application.Domain.Port.In;

import com.example.Prueba.Application.Domain.Model.TiempoMedida;
import com.example.Prueba.Application.Domain.Model.TipoDocumento;

import java.util.List;
import java.util.Optional;

public interface TiempoMedidaUseCase {

    TiempoMedida save(TiempoMedida tiempoMedida);
    List<TiempoMedida> findAll();
    Optional<TiempoMedida> findById(Integer id);
}
