package com.junia.naeptunemanager.presentation.controllers;

import com.junia.naeptunemanager.data.entities.Produit;
import com.junia.naeptunemanager.presentation.api.ProduitApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/produits")
public class ProduitController implements ProduitApi {


    @Override
    public Produit create(Produit p) {
        return null;
    }

    @Override
    public Produit update(Produit p, long idProduit) {
        return null;
    }

    @Override
    public void delete(long idProduit) {

    }

    @Override
    public ArrayList<Produit> getAllProduits() {
        return null;
    }

    @Override
    public Produit getProduitById(long id) {
        return null;
    }

    @Override
    public Produit restock(long idProduit, int stock) {
        return null;
    }
}
