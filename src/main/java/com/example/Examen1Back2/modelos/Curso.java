package com.example.Examen1Back2.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
@Entity
@Table(name = "curso")
public class Curso {

    @Id //Se completa ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) //completa el generatedValue y Type
    private Integer id;
    private String nombre;//

    @ManyToOne
    @JoinColumn(name="fk_docente", referencedColumnName = "id")//se elimina el punto y coma
    @JsonBackReference(value = "docente-curso")
    Docente docente;

    public Curso() {
    }

    public Curso(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    //Generamos los  getter y setter

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}
