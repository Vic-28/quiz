package org.example.juego.services;

import org.example.juego.models.Programacion;
import org.example.juego.repositories.ProgramacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Primary
@Service
public class ProgramacionService {
    @Autowired
    private ProgramacionRepository programacionRepository;


    public List<Programacion> getAll() {
        return programacionRepository.findAll();
    }

    public Programacion getPreguntaAleatoria() {
        List<Programacion> todasLasPreguntas = programacionRepository.findAll();
        int cantidadPreguntas = todasLasPreguntas.size();
        if (cantidadPreguntas == 0) {
            return null; // Manejar el caso de que no haya preguntas en la base de datos
        }
        Random random = new Random();
        List<Integer> idPreguntas= new ArrayList<>();
        int indiceAleatorio;
        do {
            indiceAleatorio = random.nextInt(cantidadPreguntas);
        } while (idPreguntas.contains(indiceAleatorio));
        idPreguntas.add(indiceAleatorio);
        return todasLasPreguntas.get(indiceAleatorio);
    }

}