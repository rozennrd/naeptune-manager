package com.junia.naeptunemanager.domain.services;

import com.junia.naeptunemanager.data.entities.Vente;
import com.junia.naeptunemanager.data.repositories.VenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class VenteService {
    @Autowired
    VenteRepository venteRepository;


    public ArrayList<Vente> getAllVentes(){
        return (ArrayList<Vente>) this.venteRepository.findAll();
    }
}
