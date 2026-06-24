import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Trajet {
    private UUID id;
    private String villeDepart;
    private String villeArrivee;
    private LocalDate dateDepart;
    private LocalTime heureDepart;
    private double prixActuel;
    private double distanceKm;
    private List<Object> listeReservations;

    public Trajet(UUID id, String villeDepart, String villeArrivee, LocalDate dateDepart,
                  LocalTime heureDepart, double prixActuel, double distanceKm) {
        this.id = id;
        this.villeDepart = villeDepart;
        this.villeArrivee = villeArrivee;
        this.dateDepart = dateDepart;
        this.heureDepart = heureDepart;
        this.prixActuel = prixActuel;
        this.distanceKm = distanceKm;
        this.listeReservations = new ArrayList<>();
    }

    public int nombrePlacesRestantes() {
        
        return 0;
    }

    public boolean verifierDisponibilite(int nombrePlaces) {
        return nombrePlacesRestantes() >= nombrePlaces;
    }

    public double calculerTauxRemplissage() {
        
        return 0.0;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getVilleDepart() { return villeDepart; }
    public void setVilleDepart(String villeDepart) { this.villeDepart = villeDepart; }

    public String getVilleArrivee() { return villeArrivee; }
    public void setVilleArrivee(String villeArrivee) { this.villeArrivee = villeArrivee; }

    public LocalDate getDateDepart() { return dateDepart; }
    public void setDateDepart(LocalDate dateDepart) { this.dateDepart = dateDepart; }

    public LocalTime getHeureDepart() { return heureDepart; }
    public void setHeureDepart(LocalTime heureDepart) { this.heureDepart = heureDepart; }

    public double getPrixActuel() { return prixActuel; }
    public void setPrixActuel(double prixActuel) { this.prixActuel = prixActuel; }

    public double getDistanceKm() { return distanceKm; }
    public void setDistanceKm(double distanceKm) { this.distanceKm = distanceKm; }

    public List<Object> getListeReservations() { return listeReservations; }
    public void setListeReservations(List<Object> listeReservations) { this.listeReservations = listeReservations; }

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
