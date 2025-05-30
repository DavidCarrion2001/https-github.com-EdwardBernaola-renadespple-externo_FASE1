package com.example.Prueba.Application.Servicios;

import com.example.Prueba.Application.Domain.Model.TipoDocumento;
import com.example.Prueba.Application.Domain.Port.In.TipoDocumentoUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDocumentoService implements TipoDocumentoUseCase {
    @Override
    public TipoDocumento save(TipoDocumento tipoDocumento) {
        return null;
    }

    @Override
    public List<TipoDocumento> findAll() {
        return List.of();
    }

    @Override
    public Optional<TipoDocumento> findById(Integer id) {
        return Optional.empty();
    }
}
