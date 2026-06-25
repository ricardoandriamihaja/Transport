
import java.time.LocalDate;

public class Paiment {
    private final int id;
    private final double montant;
    private LocalDate datePaiement;
    private final String modePaiement;
    private final Reservation reservation;
    private boolean effectue;

    public Paiment(int id, Reservation reservation, String modePaiement) {
        if (reservation == null) {
            throw new IllegalArgumentException("La réservation ne peut pas être null.");
        }
        if (modePaiement == null || modePaiement.isBlank()) {
            throw new IllegalArgumentException("Le mode de paiement doit être précisé.");
        }
        this.id = id;
        this.reservation = reservation;
        this.modePaiement = modePaiement;
        this.montant = reservation.getMontantTotal();
        this.effectue = false;
    }

    public void effectuerPaiement() {
        if (effectue) {
            throw new IllegalStateException("Ce paiement a déjà été effectué.");
        }
        if (reservation.getStatut() == StatutReservation.ANNULEE) {
            throw new IllegalStateException("Impossible de payer une réservation annulée.");
        }
        this.datePaiement = LocalDate.now();
        this.effectue = true;
        if (reservation.getStatut() == StatutReservation.EN_ATTENTE) {
            reservation.confirmer();
        }
    }

    public int getId() {
        return id;
    }

    public double getMontant() {
        return montant;
    }

    public LocalDate getDatePaiement() {
        return datePaiement;
    }

    public String getModePaiement() {
        return modePaiement;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public boolean isEffectue() {
        return effectue;
    }

    @Override
    public String toString() {
        return "Paiement{" +
                "id=" + id +
                ", montant=" + montant +
                ", datePaiement=" + datePaiement +
                ", modePaiement='" + modePaiement + '\'' +
                ", effectue=" + effectue +
                '}';
    }

}
