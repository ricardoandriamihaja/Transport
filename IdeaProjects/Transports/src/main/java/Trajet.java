
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Trajet {
    private int id;
    private String villeDepart;
    private String villeArrivee;
    private LocalDate dateDepart;
    private LocalTime heureDepart;
    private double prixActuel;
    private double distanceKm;
    private Vehicule vehicule;
    private List<Reservation> reservations;
    private List<HistoriquePrix> historiquePrix;

    public Trajet() {
        this.reservations = new ArrayList<>();
        this.historiquePrix = new ArrayList<>();
    }

    public Trajet(int id, String villeDepart, String villeArrivee, LocalDate dateDepart,
                  LocalTime heureDepart, double prixActuel, double distanceKm, Vehicule vehicule) {
        this.id = id;
        this.villeDepart = villeDepart;
        this.villeArrivee = villeArrivee;
        this.dateDepart = dateDepart;
        this.heureDepart = heureDepart;
        this.prixActuel = prixActuel;
        this.distanceKm = distanceKm;
        this.vehicule = vehicule;
        this.reservations = new ArrayList<>();
        this.historiquePrix = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVilleDepart() {
        return villeDepart;
    }

    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    public String getVilleArrivee() {
        return villeArrivee;
    }

    public void setVilleArrivee(String villeArrivee) {
        this.villeArrivee = villeArrivee;
    }

    public LocalDate getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(LocalDate dateDepart) {
        this.dateDepart = dateDepart;
    }

    public LocalTime getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(LocalTime heureDepart) {
        this.heureDepart = heureDepart;
    }

    public double getPrixActuel() {
        return prixActuel;
    }

    public void setPrixActuel(double nouveauPrix) {
        if (this.prixActuel != nouveauPrix) {
            HistoriquePrix historique = new HistoriquePrix(
                    this.historiquePrix.size() + 1,
                    this.prixActuel,
                    nouveauPrix,
                    new java.util.Date()
            );
            this.historiquePrix.add(historique);
        }
        this.prixActuel = nouveauPrix;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public void setDistanceKm(double distanceKm) {
        this.distanceKm = distanceKm;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public List<HistoriquePrix> getHistoriquePrix() {
        return historiquePrix;
    }

    public void setHistoriquePrix(List<HistoriquePrix> historiquePrix) {
        this.historiquePrix = historiquePrix;
    }

    public int nombrePlacesRestantes() {
        if (vehicule == null) {
            return 0;
        }
        int placesReservees = reservations.stream()
                .filter(r -> r.getStatut() != StatutReservation.ANNULEE)
                .mapToInt(Reservation::getNombrePlaces)
                .sum();
        return vehicule.getCapacite() - placesReservees;
    }

    public boolean verifierDisponibilite(int nombrePlaces) {
        return nombrePlacesRestantes() >= nombrePlaces;
    }

    public double calculerTauxRemplissage() {
        if (vehicule == null || vehicule.getCapacite() == 0) {
            return 0.0;
        }
        int placesOccupees = vehicule.getCapacite() - nombrePlacesRestantes();
        return (double) placesOccupees / vehicule.getCapacite();
    }

    public List<Reservation> obtenirReservations() {
        return reservations;
    }

    public void ajouterReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }

    @Override
    public String toString() {
        return "Trajet{" +
                "id=" + id +
                ", villeDepart='" + villeDepart + '\'' +
                ", villeArrivee='" + villeArrivee + '\'' +
                ", dateDepart=" + dateDepart +
                ", heureDepart=" + heureDepart +
                ", prixActuel=" + prixActuel +
                ", distanceKm=" + distanceKm +
                '}';
    }
}