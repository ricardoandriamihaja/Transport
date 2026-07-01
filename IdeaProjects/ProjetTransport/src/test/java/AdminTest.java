
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {

    @Test
    void constructeurDoitInitialiserLesChamps() {
        Admin admin = new Admin(1, "Rakoto", "Jean", "0342852030", "jean@test.com", "ADM001");

        assertEquals(1, admin.getId());
        assertEquals("Rakoto", admin.getNom());
        assertEquals("Jean", admin.getPrenom());
        assertEquals("0342852030", admin.getTelephone());
        assertEquals("jean@test.com", admin.getEmail());
        assertEquals("ADM001", admin.getMatricule());
    }

    @Test
    void setMatriculeDoitModifierLeMatricule() {
        Admin admin = new Admin(1, "Rakoto", "Jean", "0342852030", "jean@test.com", "ADM001");

        admin.setMatricule("ADM002");

        assertEquals("ADM002", admin.getMatricule());
    }

    @Test
    void setEntrepriseDoitModifierEntreprise() {
        Admin admin = new Admin(1, "Rakoto", "Jean", "0342852030", "jean@test.com", "ADM001");

        EntrepriseTransport entreprise = new EntrepriseTransport();

        admin.setEntreprise(entreprise);

        assertEquals(entreprise, admin.getEntreprise());
    }

    @Test
    void ajouterVehiculeDoitAjouterLeVehiculeALaListe() {
        Admin admin = new Admin(1, "Rakoto", "Jean", "0342852030", "jean@test.com", "ADM001");

        EntrepriseTransport entreprise = new EntrepriseTransport();
        admin.setEntreprise(entreprise);

        Vehicule vehicule = new Vehicule(1, "1234TAA", "Mercedes Sprinter", 30);

        admin.ajouterVehicule(vehicule);

        assertTrue(entreprise.getVehicules().contains(vehicule));
    }

    @Test
    void consulterRapportsFinanciersDoitRetournerListeVideSiEntrepriseNull() {
        Admin admin = new Admin(1, "Rakoto", "Jean", "0342852030", "jean@test.com", "ADM001");

        List<RapportFinancier> rapports = admin.consulterRapportsFinanciers();

        assertNotNull(rapports);
        assertTrue(rapports.isEmpty());
    }

    @Test
    void toStringNeDoitPasEtreNull() {
        Admin admin = new Admin(1, "Rakoto", "Jean", "0342852030", "jean@test.com", "ADM001");

        assertNotNull(admin.toString());
    }

    @Test
    void toStringDoitContenirLesInformationsPrincipales() {
        Admin admin = new Admin(1, "Rakoto", "Jean", "0342852030", "jean@test.com", "ADM001");

        String resultat = admin.toString();

        assertTrue(resultat.contains("Rakoto"));
        assertTrue(resultat.contains("Jean"));
        assertTrue(resultat.contains("ADM001"));
    }
}