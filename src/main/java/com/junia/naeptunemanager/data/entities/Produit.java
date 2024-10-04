package com.junia.naeptunemanager.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Blob;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Produit {
    private @Id
    @GeneratedValue Long id;

    private int stock;

    private int idealStock;

    private String name;

    private double priceMember;

    private double priceNonMember;
//    private Blob photo;

}
