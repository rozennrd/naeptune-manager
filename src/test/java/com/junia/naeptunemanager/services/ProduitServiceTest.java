package com.junia.naeptunemanager.services;

import com.junia.naeptunemanager.domain.exceptions.NotEnoughInfoForProductCreationException;
import com.junia.naeptunemanager.domain.exceptions.ProductNotFoundException;
import com.junia.naeptunemanager.domain.services.ProduitService;
import com.junia.naeptunemanager.data.entities.Produit;
import com.junia.naeptunemanager.data.repositories.ProduitRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ProduitServiceTest {

    @Mock
    ProduitRepository produitRepository;

    @InjectMocks
    ProduitService produitService;


    @Nested
    @DisplayName("AJOUT DE PRODUITS")
    class AddProduct{
        @Test
        @DisplayName("Etant donné un nouveau produit, quand on enregistre le produit sans information, alors échec")
        public void givenANewProductWithoutInfoWhenRegisteringThenFailure() {

            Produit p = new Produit();

            NotEnoughInfoForProductCreationException e = Assertions.assertThrows(
                    NotEnoughInfoForProductCreationException.class,() -> { produitService.save(p);});


        }

        @Test
        @DisplayName("Etant donné un nouveau produit, quand on enregistre le produit avec les informations requises, alors succès")
        public void givenANewProductWithAllInfoWhenRegisteringThenSuccess() throws NotEnoughInfoForProductCreationException {
            Produit p = Produit.builder()
                    .name("Thé")
                    .stock(5)
                    .idealStock(10)
                    .priceMember(0.2)
                    .priceNonMember(0.5)
                    .build();

            Mockito.when(produitRepository.save(p)).thenReturn(p);
            Produit registered = produitService.save(p);

            Assertions.assertEquals(registered, p);
        }
    }

    @Nested
    @DisplayName("SUPPRESSION DE PRODUITS")
    class DeleteProducts {


        @Test
        @DisplayName("Etant donné un produit qui existe, lorsqu'on le supprime, alors le repo est appelé et le produit est supprimé")
        public void givenExistentProductWhenSuppressingThenSuccess() {
            Long productId = 1L;
            Mockito.when(produitRepository.existsById(productId)).thenReturn(true);

            produitService.deleteById(productId);

            Mockito.verify(produitRepository, Mockito.times(1)).deleteById(productId);
        }

        @Test
        @DisplayName("Etant donné un produit qui n'existe pas, lorsqu'on le supprime, alors une erreur est renvoyée")
        public void givenNonExistentProductWhenSuppressingThenSuccess() {
            Long nonExistentProductId = 1L;

            Mockito.when(produitRepository.existsById(nonExistentProductId)).thenReturn(false);

            Assertions.assertThrows(ProductNotFoundException.class, () -> { produitService.deleteById(nonExistentProductId);});
        }
    }

    @Nested
    @DisplayName("MODIFICATION DE PRODUITS")
    class UpdateProduct {
        @Test
        @DisplayName("Etant donné un produit qui existe, lorsqu'on modifie le produit, alors ça fonctionne")
        public void givenExistentProductAndValidInfosWhenUpdateThenSuccess() {

        }

        @Test
        @DisplayName("Étant donné un produit existant, lorsqu'on modifie le produit, alors échec")
        public void givenExistentProductAndInvalidInfosWhenUpdateThenFailure() {

        }

        @Test
        @DisplayName("Étant donné un produit non existant, lorsqu'on modifie le produit, alors une erreur est levée")
        public void givenNonExistentProductWhenUpdateThenErrorIsThrown() {

        }
    }

}
