package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Practica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String empresa;
    private String direccion; 
    private String telefono;
    private String jefeDirecto;
    private String contactoJefe;
    private LocalDate fechaInicio;
    private LocalDate fechaTermino;
    private String descripcion;

    @ManyToOne
    private Estudiante estudiante;

    @ManyToOne
    private Profesor profesor;
}
