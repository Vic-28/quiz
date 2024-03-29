package org.example.juego.repositories;

import org.example.juego.models.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicaRepository extends JpaRepository<Musica,Long> {
}
