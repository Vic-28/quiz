package org.example.juego.repositories;

import org.example.juego.models.Musica;
import org.example.juego.models.Videojuegos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoJuegosRepository extends JpaRepository<Videojuegos,Long> {
}
