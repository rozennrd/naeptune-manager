package com.junia.naeptunemanager.data.repositories;

import com.junia.naeptunemanager.data.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

    Produit save(Produit p);
}
