package com.example.demo.service;

import com.example.demo.model.Estudiante;
import com.example.demo.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    private final EstudianteRepository repo;

    public EstudianteService(EstudianteRepository repo) {
        this.repo = repo;
    }

    public Estudiante guardar(Estudiante e) {
        return repo.save(e);
    }

    public List<Estudiante> listar() {
        return repo.findAll();
    }
}
