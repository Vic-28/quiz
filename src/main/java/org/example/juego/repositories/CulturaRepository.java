package org.example.juego.repositories;

import org.example.juego.models.Cultura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CulturaRepository extends JpaRepository<Cultura,Long> {
}
