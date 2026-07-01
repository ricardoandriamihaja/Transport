
import java.util.Date;

public class Reservation {
    private int id;
    private Date dateReservation;
    private int nombrePlaces;
    private StatutReservation statut;
    private Trajet trajet;
    private Voyageur voyageur;
    private Paiement paiement;

    public Reservation() {
        this.statut = StatutReservation.EN_ATTENTE;
    }

    public Reservation(int id, Date dateReservation, int nombrePlaces, Trajet trajet, Voyageur voyageur) {
        this.id = id;
        this.dateReservation = dateReservation;
        this.nombrePlaces = nombrePlaces;
        this.trajet = trajet;
        this.voyageur = voyageur;
        this.statut = StatutReservation.EN_ATTENTE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public int getNombrePlaces() {
        return nombrePlaces;
    }

    public void setNombrePlaces(int nombrePlaces) {
        this.nombrePlaces = nombrePlaces;
    }

    public StatutReservation getStatut() {
        return statut;
    }

    public void setStatut(StatutReservation statut) {
        this.statut = statut;
    }

    public Trajet getTrajet() {
        return trajet;
    }

    public void setTrajet(Trajet trajet) {
        this.trajet = trajet;
    }

    public Voyageur getVoyageur() {
        return voyageur;
    }

    public void setVoyageur(Voyageur voyageur) {
        this.voyageur = voyageur;
    }

    public Paiement getPaiement() {
        return paiement;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }

    public double getMontantTotal() {
        if (trajet == null) {
            return 0.0;
        }
        return trajet.getPrixActuel() * nombrePlaces;
    }

    public void confirmer() {
        this.statut = StatutReservation.CONFIRMEE;
    }

    public void annuler() {
        this.statut = StatutReservation.ANNULEE;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", dateReservation=" + dateReservation +
                ", nombrePlaces=" + nombrePlaces +
                ", statut=" + statut +
                '}';
    }
}