package com.example.demo.config;

import com.example.demo.model.Estudiante;
import com.example.demo.model.Profesor;
import com.example.demo.model.Practica;
import com.example.demo.repository.EstudianteRepository;
import com.example.demo.repository.ProfesorRepository;
import com.example.demo.repository.PracticaRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner cargarDatos(
            EstudianteRepository estudianteRepo,
            ProfesorRepository profesorRepo,
            PracticaRepository practicaRepo) {

        return args -> {

            // estudiantes
            Estudiante e1 = new Estudiante(null, "Chirlett", "Teixeira", "20.898.110-2");
            Estudiante e2 = new Estudiante(null, "Cristopher", "Rivera", "19.456.789-0");

            estudianteRepo.save(e1);
            estudianteRepo.save(e2);

            // profesores
            Profesor p1 = new Profesor(null, "María González", "Informática");
            Profesor p2 = new Profesor(null, "Juan Pérez", "Redes");

            profesorRepo.save(p1);
            profesorRepo.save(p2);

            // practicas
            Practica pr1 = new Practica(
                    null,
                    "Empresa Tech",
                    "Av. Siempre Viva 742",
                    "987654321",
                    "Juan Pérez",
                    "juan@empresa.cl",
                    LocalDate.of(2025, 1, 1),
                    LocalDate.of(2025, 6, 30),
                    "Práctica profesional en desarrollo backend",
                    e1,
                    p1
            );

            Practica pr2 = new Practica(
                    null,
                    "Empresa Soft",
                    "Calle Central 123",
                    "912345678",
                    "Ana Torres",
                    "ana@empresa.cl",
                    LocalDate.of(2025, 3, 1),
                    LocalDate.of(2025, 8, 30),
                    "Práctica en soporte y mantenimiento",
                    e2,
                    p2
            );

            practicaRepo.save(pr1);
            practicaRepo.save(pr2);

            System.out.println("Datos iniciales cargados correctamente");
        };
    }
}
