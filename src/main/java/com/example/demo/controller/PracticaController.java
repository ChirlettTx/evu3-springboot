package com.example.demo.controller;

import com.example.demo.model.Practica;
import com.example.demo.service.PracticaService;

import jakarta.validation.Valid;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Prácticas", description = "Gestión de prácticas profesionales")
@RestController
@RequestMapping("/practicas")
public class PracticaController {

    private final PracticaService service;

    public PracticaController(PracticaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Practica> listar() {
        return service.listar();
    }

    @PostMapping
    public Practica crear(@Valid @RequestBody Practica p) {
        return service.guardar(p);
    }

    @PutMapping("/{id}")
    public Practica editar(@PathVariable Long id, @Valid @RequestBody Practica p) {
        return service.actualizar(id, p);
    }

    @Operation(summary = "Eliminar una práctica por ID")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
