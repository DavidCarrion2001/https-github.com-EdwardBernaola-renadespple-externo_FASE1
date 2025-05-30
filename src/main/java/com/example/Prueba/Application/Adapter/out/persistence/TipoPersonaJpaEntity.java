package com.example.Prueba.Application.Adapter.out.persistence;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Table(name="Tipo_persona")
@Setter
@Getter
public class TipoPersonaJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_persona")
    private Integer id_tipo_persona;

    private String descripcion;

    @Column(name="activo")
    private String activo;

    @Column(name="fecha_creacion")
    private ZonedDateTime fecha_creacion;
}
