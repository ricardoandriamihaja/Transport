package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RapportFinancierTest {

    @Test
    public void testCalculerBenefice() {
        var carburant = new Depense(1, 150.0, LocalDate.now(), "Achat Carburant");
        var reparation = new Depense(2, 350.0, LocalDate.now(), "Réparation Camion");

        carburant.enregistrerDepense();
        reparation.enregistrerDepense();

        var listeDepenses = List.of(carburant, reparation);

        var rapport = new RapportFinancier(1, 1000.0, LocalDate.now());

        double beneficeObtenu = rapport.calculerBenefice(listeDepenses);

        // Vérifications JUnit 5
        assertEquals(500.0, rapport.getDepenseTotale(), "La dépense totale calculée est incorrecte");
        assertEquals(500.0, beneficeObtenu, "Le bénéfice calculé retourné est incorrect");
        assertEquals(500.0, rapport.getBenefice(), "L'attribut bénéfice mis à jour est incorrect");
    }
}