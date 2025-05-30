package com.example.Prueba.Application.Adapter.out.persistence;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Table(name="tiempo:medida")
@Setter
@Getter
public class TiempoMedidaJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_tiempo_medida")
    private Integer id_tiempo_medida;

    private String descripcion;

    @Column(name = "activo")
    private String activo;

    @Column(name = "usuario_creador")
    private String usuario_creador;

    @Column(name = "fecha_creacion")
    private ZonedDateTime fecha_creacion;

    @Column(name = "ususario_modificador")
    private String ususario_modificador;

    @Column(name = "fecha_modificacion")
    private ZonedDateTime fecha_modificacion;
}
