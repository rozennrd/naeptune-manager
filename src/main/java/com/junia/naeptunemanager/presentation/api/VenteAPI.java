package com.junia.naeptunemanager.presentation.api;

import com.junia.naeptunemanager.data.entities.ProduitVente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ventes/")
public interface VenteAPI {

    @PostMapping("")
    public void vendre(@RequestBody ProduitVente[] produitVentes);



}
