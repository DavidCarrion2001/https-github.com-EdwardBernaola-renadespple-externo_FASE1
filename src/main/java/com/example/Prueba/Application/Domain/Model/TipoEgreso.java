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
public class TipoEgreso {

    private Integer id_tipo_egreso;
    private String descripcion;
    private String activo;
    private String usuario_creador;
    private ZonedDateTime fecha_creacion;
    private String usuario_modificador;
    private ZonedDateTime fecha_modificacion;
}
