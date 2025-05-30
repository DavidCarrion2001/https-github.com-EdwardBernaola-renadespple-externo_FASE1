package com.example.Prueba.Application.Domain.Port.In;

import com.example.Prueba.Application.Domain.Model.TipoDocumento;

import java.util.List;
import java.util.Optional;

public interface TipoDocumentoUseCase {

    TipoDocumento save(TipoDocumento tipoDocumento);
    List<TipoDocumento> findAll();
    Optional<TipoDocumento> findById(Integer id);
}
