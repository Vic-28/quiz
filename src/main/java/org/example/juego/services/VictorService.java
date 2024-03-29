package org.example.juego.services;

import org.example.juego.models.Victor;
import org.example.juego.repositories.VictorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Primary
@Service
public class VictorService {
    @Autowired
    private VictorRepository victorRepository;


    public List<Victor> getAll() {
        return victorRepository.findAll();
    }

    public Victor getPreguntaAleatoria() {
        List<Victor> todasLasPreguntas = victorRepository.findAll();
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