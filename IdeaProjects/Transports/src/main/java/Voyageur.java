
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Voyageur extends Utilisateur {
    private String numeroClient;
    private List<Reservation> reservations;

    public Voyageur(int id, String nom, String prenom, String telephone, String email, String numeroClient) {
        super(id, nom, prenom, telephone, email);
        this.numeroClient = numeroClient;
        this.reservations = new ArrayList<>();
    }

    public String getNumeroClient() {
        return numeroClient;
    }

    public void setNumeroClient(String numeroClient) {
        this.numeroClient = numeroClient;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Reservation reserverTrajet(Trajet trajet, int nombrePlaces) {
        if (trajet == null || !trajet.verifierDisponibilite(nombrePlaces)) {
            throw new IllegalStateException("Nombre de places non disponible pour ce trajet.");
        }
        Reservation reservation = new Reservation(
                this.reservations.size() + 1,
                new Date(),
                nombrePlaces,
                trajet,
                this
        );
        this.reservations.add(reservation);
        trajet.ajouterReservation(reservation);
        return reservation;
    }

    public void annulerReservation(Reservation reservation) {
        if (reservation != null && this.reservations.contains(reservation)) {
            reservation.annuler();
        }
    }

    public List<Reservation> consulterReservations() {
        return this.reservations;
    }

    @Override
    public String toString() {
        return "Voyageur{" +
                "id=" + getId() +
                ", nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", numeroClient='" + numeroClient + '\'' +
                '}';
    }
}