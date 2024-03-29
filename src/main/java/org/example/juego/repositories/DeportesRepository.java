package org.example.juego.repositories;

import org.example.juego.models.Cultura;
import org.example.juego.models.Deportes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeportesRepository extends JpaRepository<Deportes,Long> {
}
