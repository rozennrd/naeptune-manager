package com.junia.naeptunemanager.presentation.api;

import com.junia.naeptunemanager.data.entities.Produit;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("produits/")
public interface ProduitApi {

    @PostMapping("/")
    public Produit create(@RequestBody Produit p);

    @PutMapping("/{id}")
    public Produit update(@RequestBody Produit p, @PathVariable long idProduit);

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long idProduit);

    @GetMapping("/")
    public ArrayList<Produit> getAllProduits();

    @GetMapping("/{id}")
    public Produit getProduitById(@PathVariable long id);

    /**
     * Permet de restocker un produit avec un nombre de nouveaux produits définis
     * @param idProduit long
     * @param stock int : nombre d'articles du produit rentrés (pas stock total, juste nombre rentré
     * @return rien
     */
    @PostMapping("/{id}")
    public Produit restock (@PathVariable long idProduit, @RequestBody int stock);
}
