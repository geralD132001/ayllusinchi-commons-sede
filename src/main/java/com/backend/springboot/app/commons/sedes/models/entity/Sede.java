package com.backend.springboot.app.commons.sedes.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "tma_sede")
public class Sede {

    @Id
    @Column(name = "id_sede")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSede;

    @Column(name = "no_sede")
    private String nombre;

    public Long getIdSede() {
        return idSede;
    }

    public void setIdSede(Long idSede) {
        this.idSede = idSede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
