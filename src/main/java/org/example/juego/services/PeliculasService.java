package org.example.juego.services;

import org.example.juego.models.Peliculas;
import org.example.juego.repositories.PeliculasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Primary
@Service
public class PeliculasService {
    @Autowired
    private PeliculasRepository peliculasRepository;


    public List<Peliculas> getAll() {
        return peliculasRepository.findAll();
    }

    public Peliculas getPreguntaAleatoria() {
        List<Peliculas> todasLasPreguntas = peliculasRepository.findAll();
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