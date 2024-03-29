package org.example.juego.repositories;

import org.example.juego.models.Cultura;
import org.example.juego.models.Historia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoriaRepository extends JpaRepository<Historia,Long> {
}
