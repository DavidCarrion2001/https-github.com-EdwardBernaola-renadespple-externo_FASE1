package com.example.Prueba.Application.Adapter.out.persistence;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Table(name="tipo_documento")
@Setter
@Getter
public class TipoDocumentoJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_tipo_documento")
    private Integer id;

    private String descripcion;

    @Column(name ="sigla")
    private String sigla;

    @Column(name = "activo")
    private String activo;

    @Column(name ="usuario_creador")
    private String usuario_creador;

    @Column(name ="fechas_creacion")
    private ZonedDateTime fecha_creacion;

    @Column(name = "usuario_modificador")
    private String usuario_modificador;

    @Column(name = "fecha_modificacion")
    private ZonedDateTime fecha_modificacion;

}
