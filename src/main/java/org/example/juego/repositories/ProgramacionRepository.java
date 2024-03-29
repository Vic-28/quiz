package org.example.juego.repositories;

import org.example.juego.models.Musica;
import org.example.juego.models.Programacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramacionRepository extends JpaRepository<Programacion,Long> {
}
