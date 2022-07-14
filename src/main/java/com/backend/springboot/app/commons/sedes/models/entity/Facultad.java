package com.backend.springboot.app.commons.sedes.models.entity;

import javax.persistence.*;

@Entity
@Table(name ="tcd_facultad")
public class Facultad {

    @Id
    @Column(name = "id_facultad")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacultad;

    @Column(name = "no_facultad")
    private String nombre;

    @Column(name = "ab_facultad")
    private String abreviacion;

    @Column(name = "no_coordinador")
    private String coordinador;

    @Column(name = "im_facultad")
    private String fotoFacultad;

    public Long getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(Long idFacultad) {
        this.idFacultad = idFacultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public void setAbreviacion(String abreviacion) {
        this.abreviacion = abreviacion;
    }

    public String getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(String coordinador) {
        this.coordinador = coordinador;
    }


    public String getFotoFacultad() {
        return fotoFacultad;
    }

    public void setFotoFacultad(String fotoFacultad) {
        this.fotoFacultad = fotoFacultad;
    }
}
