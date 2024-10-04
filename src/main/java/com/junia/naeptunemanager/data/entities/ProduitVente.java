package com.junia.naeptunemanager.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class ProduitVente {
    private @Id
    @GeneratedValue long id;

    private int quantite;
    private double prixTotal;
    @OneToOne
    private Produit produit;
}
