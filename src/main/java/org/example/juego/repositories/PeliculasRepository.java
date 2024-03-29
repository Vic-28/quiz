package org.example.juego.repositories;

import org.example.juego.models.Peliculas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculasRepository extends JpaRepository<Peliculas,Long> {
}
