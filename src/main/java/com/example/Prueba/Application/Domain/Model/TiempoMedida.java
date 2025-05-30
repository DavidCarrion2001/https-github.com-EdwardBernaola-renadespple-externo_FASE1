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
public class TiempoMedida {
    private Integer id_tiempo_medida;
    private String descripcion;
    private String activo;
    private String usuario_creador;
    private ZonedDateTime fecha_creacion;
    private String ususario_modificador;
    private ZonedDateTime fecha_modificacion;
}
