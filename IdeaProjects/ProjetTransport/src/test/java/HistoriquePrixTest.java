
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class HistoriquePrixTest {

    @Test
    void constructeurDoitInitialiserTousLesChamps() {
        Date date = new Date();

        HistoriquePrix historique = new HistoriquePrix(1, 45000.0, 60000.0, date);

        assertEquals(1, historique.getId());
        assertEquals(45000.0, historique.getAncienPrix(), 0.001);
        assertEquals(60000.0, historique.getNouveauPrix(), 0.001);
        assertEquals(date, historique.getDateModification());
    }

    @Test
    void lesSettersDoiventModifierLesChamps() {
        HistoriquePrix historique = new HistoriquePrix(0, 0.0, 0.0, new Date());

        Date date = new Date();

        historique.setId(5);
        historique.setAncienPrix(45000.0);
        historique.setNouveauPrix(60000.0);
        historique.setDateModification(date);

        assertEquals(5, historique.getId());
        assertEquals(45000.0, historique.getAncienPrix(), 0.001);
        assertEquals(60000.0, historique.getNouveauPrix(), 0.001);
        assertEquals(date, historique.getDateModification());
    }

    @Test
    void toStringNeDoitPasEtreNull() {
        HistoriquePrix historique = new HistoriquePrix(1, 10000.0, 15000.0, new Date());

        assertNotNull(historique.toString());
    }
}
