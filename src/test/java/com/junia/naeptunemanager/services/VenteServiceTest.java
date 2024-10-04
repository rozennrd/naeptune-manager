package com.junia.naeptunemanager.services;


import com.junia.naeptunemanager.domain.services.VenteService;
import com.junia.naeptunemanager.data.entities.Vente;
import com.junia.naeptunemanager.data.repositories.VenteRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

@ExtendWith(MockitoExtension.class)
public class VenteServiceTest {
    @Mock
    VenteRepository venteRepository;

    @InjectMocks
    VenteService venteService;

    @Test
    public void givenSomeVentesWhenGetAllVentesThenSuccess() {
        Vente v1 = new Vente();
        Vente v2 = new Vente();

        ArrayList<Vente> ventes = new ArrayList<>();
        ventes.add(v1);
        ventes.add(v2);
        Mockito.when(venteRepository.findAll()).thenReturn(ventes);

        ArrayList<Vente> result = venteService.getAllVentes();

        Assertions.assertEquals(result, ventes);
    }


    @Test
    public void givenANewVenteWhenRegisteringVenteThenSuccess() {

    }
}
