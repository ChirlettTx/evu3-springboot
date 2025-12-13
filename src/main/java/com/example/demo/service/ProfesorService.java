package com.example.demo.service;

import com.example.demo.model.Profesor;
import com.example.demo.repository.ProfesorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {

    private final ProfesorRepository repo;

    public ProfesorService(ProfesorRepository repo) {
        this.repo = repo;
    }

    public Profesor guardar(Profesor p) {
        return repo.save(p);
    }

    public List<Profesor> listar() {
        return repo.findAll();
    }
}
