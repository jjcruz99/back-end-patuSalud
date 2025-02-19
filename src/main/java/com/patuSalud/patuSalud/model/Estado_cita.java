package com.patuSalud.patuSalud.model;


import jakarta.persistence.*;

@Entity // Indica que esta clase es una entidad JPA (se mapeará a una tabla en la base de datos)
@Table(name = "estado_cita") // Especifica el nombre de la tabla en la base de datos
public class Estado_cita {

    @Id // Define este campo como la clave primaria de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Hace que el ID sea autoincrementable en la BD
    private Long idEstadoCita;

    @Column(length = 20, nullable = false) // Define una columna con un máximo de 20 caracteres y NOT NULL
    private String descripcion;

    // Constructor vacío requerido por JPA
    public Estado_cita() {
    }

    // Constructor sin ID (el ID se generará automáticamente en la base de datos)
    public Estado_cita(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public Long getIdEstadoCita() {
        return idEstadoCita;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}


//public class Estado_cita {
//
//}
