package com.junia.naeptunemanager.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Vente {
    private @Id @GeneratedValue long id;
    private LocalDateTime dateHeure;
    private double prixTotal;
    @OneToMany
    private ProduitVente[] produitVentes;
}
