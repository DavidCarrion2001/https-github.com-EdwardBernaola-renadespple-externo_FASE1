package com.example.Prueba.Application.Servicios;

import com.example.Prueba.Application.Domain.Model.TiempoMedida;
import com.example.Prueba.Application.Domain.Port.In.TiempoMedidaUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TiempoMedidaService implements TiempoMedidaUseCase {

    @Override
    public TiempoMedida save(TiempoMedida tiempoMedida) {
        return null;
    }

    @Override
    public List<TiempoMedida> findAll() {
        return List.of();
    }

    @Override
    public Optional<TiempoMedida> findById(Integer id) {
        return Optional.empty();
    }
}
