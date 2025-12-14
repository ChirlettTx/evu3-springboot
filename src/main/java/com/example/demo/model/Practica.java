package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Practica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "La empresa es obligatoria")
    private String empresa;

    @NotBlank(message = "La dirección es obligatoria")
    private String direccion;

    @NotBlank(message = "El teléfono es obligatorio")
    private String telefono;

    @NotBlank(message = "El jefe directo es obligatorio")
    private String jefeDirecto;

    @NotBlank(message = "El contacto del jefe es obligatorio")
    private String contactoJefe;

    @NotNull(message = "La fecha de inicio es obligatoria")
    private LocalDate fechaInicio;

    @NotNull(message = "La fecha de término es obligatoria")
    private LocalDate fechaTermino;

    @NotBlank(message = "La descripción es obligatoria")
    private String descripcion;

    @ManyToOne
    @NotNull(message = "El estudiante es obligatorio")
    private Estudiante estudiante;

    @ManyToOne
    @NotNull(message = "El profesor es obligatorio")
    private Profesor profesor;
}
