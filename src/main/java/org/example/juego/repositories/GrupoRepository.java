package org.example.juego.repositories;

import org.example.juego.models.Cultura;
import org.example.juego.models.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrupoRepository extends JpaRepository<Grupo,Long> {
}
