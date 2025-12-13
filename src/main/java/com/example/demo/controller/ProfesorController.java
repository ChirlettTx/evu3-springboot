package com.example.demo.controller;

import com.example.demo.model.Profesor;
import com.example.demo.service.ProfesorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesores")
public class ProfesorController {

    private final ProfesorService service;

    public ProfesorController(ProfesorService service) {
        this.service = service;
    }

    @PostMapping
    public Profesor crear(@RequestBody Profesor p) {
        return service.guardar(p);
    }

    @GetMapping
    public List<Profesor> listar() {
        return service.listar();
    }
}
