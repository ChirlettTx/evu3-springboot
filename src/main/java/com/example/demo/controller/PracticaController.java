package com.example.demo.controller;

import com.example.demo.model.Practica;
import com.example.demo.service.PracticaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Practica crear(@RequestBody Practica p) {
        return service.guardar(p);
    }

    @PutMapping("/{id}")
    public Practica editar(@PathVariable Long id, @RequestBody Practica p) {
        return service.actualizar(id, p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
