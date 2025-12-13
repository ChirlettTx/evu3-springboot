package com.example.demo.service;

import com.example.demo.model.Practica;
import com.example.demo.repository.PracticaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PracticaService {

    private final PracticaRepository repo;

    public PracticaService(PracticaRepository repo) {
        this.repo = repo;
    }

    public Practica agregar(Practica p) {
        return repo.save(p);
    }

    public List<Practica> listar() {
        return repo.findAll();
    }

    public Practica guardar(Practica p) {
        return repo.save(p);
    }

    public Practica actualizar(Long id, Practica nueva) {
        Practica p = repo.findById(id).orElseThrow();
        p.setEmpresa(nueva.getEmpresa());
        p.setDireccion(nueva.getDireccion());
        p.setTelefono(nueva.getTelefono());
        p.setJefeDirecto(nueva.getJefeDirecto());
        p.setContactoJefe(nueva.getContactoJefe());
        p.setFechaInicio(nueva.getFechaInicio());
        p.setFechaTermino(nueva.getFechaTermino());
        p.setDescripcion(nueva.getDescripcion());
        return repo.save(p);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}