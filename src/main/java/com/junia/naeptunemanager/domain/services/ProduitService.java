package com.junia.naeptunemanager.domain.services;

import com.junia.naeptunemanager.data.entities.Produit;
import com.junia.naeptunemanager.data.repositories.ProduitRepository;
import com.junia.naeptunemanager.data.repositories.ProduitVenteRepository;
import com.junia.naeptunemanager.domain.exceptions.NotEnoughInfoForProductCreationException;
import com.junia.naeptunemanager.domain.exceptions.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitService {

    @Autowired
    ProduitRepository produitRepository;

    public Produit save(Produit p) throws NotEnoughInfoForProductCreationException {
        if (p.getName() == null || p.getIdealStock() == 0  || p.getPriceMember() == 0 || p.getPriceNonMember() == 0) {
            throw new NotEnoughInfoForProductCreationException();
        }

        return produitRepository.save(p);
    }

    public void deleteById(Long productId) {
        if (!produitRepository.existsById(productId)) {
            throw new ProductNotFoundException("Le produit à supprimer n'existe pas en base de données");
        }
        produitRepository.deleteById(productId);
    }
}
