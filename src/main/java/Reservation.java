
import java.time.LocalDate;

public class Reservation {

    private final int id;
    private final LocalDate dateReservation;
    private int nombrePlaces;
    private StatutReservation statut;
    private Trajet trajet;

    public Reservation(int id, Trajet trajet, int nombrePlaces) {
        if (trajet == null) {
            throw new IllegalArgumentException("Le trajet ne peut pas être null.");
        }
        if (nombrePlaces <= 0) {
            throw new IllegalArgumentException("Le nombre de places doit être strictement positif.");
        }
        if (!trajet.verifierDisponibilite(nombrePlaces)) {
            throw new IllegalStateException("Pas assez de places disponibles sur ce trajet.");
        }
        this.id = id;
        this.trajet = trajet;
        this.nombrePlaces = nombrePlaces;
        this.dateReservation = LocalDate.now();
        this.statut = StatutReservation.EN_ATTENTE;
    }

    public double getMontantTotal() {
        return nombrePlaces * trajet.getPrixActuel();
    }

    public void confirmer() {
        if (statut != StatutReservation.EN_ATTENTE) {
            throw new IllegalStateException(
                    "Impossible de confirmer une réservation au statut " + statut + ".");
        }
        this.statut = StatutReservation.CONFIRMEE;
    }

    public void annuler() {
        if (statut == StatutReservation.ANNULEE) {
            throw new IllegalStateException("Cette réservation est déjà annulée.");
        }
        this.statut = StatutReservation.ANNULEE;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDateReservation() {
        return dateReservation;
    }

    public int getNombrePlaces() {
        return nombrePlaces;
    }

    public StatutReservation getStatut() {
        return statut;
    }

    public Trajet getTrajet() {
        return trajet;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", dateReservation=" + dateReservation +
                ", nombrePlaces=" + nombrePlaces +
                ", statut=" + statut +
                ", montantTotal=" + getMontantTotal() +
                '}';
    }
}

