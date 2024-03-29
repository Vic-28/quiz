package org.example.juego.repositories;

import org.example.juego.models.Musica;
import org.example.juego.models.Victor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VictorRepository extends JpaRepository<Victor,Long> {
}
