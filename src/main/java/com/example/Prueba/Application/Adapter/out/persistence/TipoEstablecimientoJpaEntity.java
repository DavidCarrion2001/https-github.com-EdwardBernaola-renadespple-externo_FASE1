package com.example.Prueba.Application.Adapter.out.persistence;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Table(name="tipo_establecimiento")
@Setter
@Getter
public class TipoEstablecimientoJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_establecimiento")
    private Integer id;

    private String descripcion;

    @Column(name = "activo")
    private String activo;

    @Column(name="usuario_creador")
    private String usuarioCreador;

    @Column(name="fecha_creacion")
    private ZonedDateTime fechaCreacion;

    @Column(name="usuario_modificador")
    private String usuarioModificador;

    @Column(name="fecha_modificacion")
    private ZonedDateTime fechaModificacion;
}
