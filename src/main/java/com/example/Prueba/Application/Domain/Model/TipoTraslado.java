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

public class TipoTraslado {
    private Integer id;
    private String descripcion;
    private String activio;
    //private String ususarioCreador;
    private ZonedDateTime fechaCreacion;
    /*private String usuarioModificador;
    private ZonedDateTime fechaModificacion;*/
}