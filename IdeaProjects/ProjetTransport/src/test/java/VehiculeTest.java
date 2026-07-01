
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehiculeTest {

    @Test
    void constructeurDoitInitialiserTousLesChamps() {
        Vehicule vehicule = new Vehicule(1, "1234 TAA", "Toyota", 30);

        assertEquals(1, vehicule.getId());
        assertEquals("1234 TAA", vehicule.getImmatriculation());
        assertEquals("Toyota", vehicule.getMarque());
        assertEquals(30, vehicule.getCapacite());
    }

    @Test
    void lesSettersDoiventModifierLesChamps() {
        Vehicule vehicule = new Vehicule(1, "1234 TAA", "Toyota", 30);

        vehicule.setId(2);
        vehicule.setImmatriculation("5678 TAB");
        vehicule.setMarque("Mercedes");
        vehicule.setCapacite(50);

        assertEquals(2, vehicule.getId());
        assertEquals("5678 TAB", vehicule.getImmatriculation());
        assertEquals("Mercedes", vehicule.getMarque());
        assertEquals(50, vehicule.getCapacite());
    }

    @Test
    void toStringNeDoitPasEtreNull() {
        Vehicule vehicule = new Vehicule(1, "1234 TAA", "Toyota", 30);

        assertNotNull(vehicule.toString());
    }

    @Test
    void toStringDoitContenirLesInformationsDuVehicule() {
        Vehicule vehicule = new Vehicule(1, "1234 TAA", "Toyota", 30);
        String resultat = vehicule.toString();

        assertTrue(resultat.contains("1"));
        assertTrue(resultat.contains("1234 TAA"));
        assertTrue(resultat.contains("Toyota"));
        assertTrue(resultat.contains("30"));
    }
}