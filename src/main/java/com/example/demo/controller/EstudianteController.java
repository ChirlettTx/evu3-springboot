package com.example.demo.controller;

import com.example.demo.model.Estudiante;
import com.example.demo.service.EstudianteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    private final EstudianteService service;

    public EstudianteController(EstudianteService service) {
        this.service = service;
    }

    @PostMapping
    public Estudiante crear(@RequestBody Estudiante e) {
        return service.guardar(e);
    }

    @GetMapping
    public List<Estudiante> listar() {
        return service.listar();
    }
}
