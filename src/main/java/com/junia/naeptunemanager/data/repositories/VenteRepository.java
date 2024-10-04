package com.junia.naeptunemanager.data.repositories;

import com.junia.naeptunemanager.data.entities.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenteRepository extends JpaRepository<Vente, Long> {
}
