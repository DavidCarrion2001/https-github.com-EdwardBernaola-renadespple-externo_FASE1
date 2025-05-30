package com.example.Prueba.Application.Domain.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TipoPersona {
    private Integer id_tipo_perosona;
    private String descripcion;
    private String activo;
    private ZonedDateTime fecha_creacion;
}
