
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EntrepriseTransport {
    private int id;
    private String nom;
    private String adresse;
    private String telephone;
    private double capital;
    private List<Vehicule> vehicules;
    private List<Trajet> trajets;
    private List<Admin> admins;
    private List<RapportFinancier> rapportsFinanciers;
    private List<Depense> depenses;

    public EntrepriseTransport() {
        this.vehicules = new ArrayList<>();
        this.trajets = new ArrayList<>();
        this.admins = new ArrayList<>();
        this.rapportsFinanciers = new ArrayList<>();
        this.depenses = new ArrayList<>();
    }

    public EntrepriseTransport(int id, String nom, String adresse, String telephone, double capital) {
        this();
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.capital = capital;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public List<Vehicule> getVehicules() {
        return vehicules;
    }

    public void setVehicules(List<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }

    public List<Trajet> getTrajets() {
        return trajets;
    }

    public void setTrajets(List<Trajet> trajets) {
        this.trajets = trajets;
    }

    public List<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(List<Admin> admins) {
        this.admins = admins;
    }

    public List<RapportFinancier> getRapportsFinanciers() {
        return rapportsFinanciers;
    }

    public void setRapportsFinanciers(List<RapportFinancier> rapportsFinanciers) {
        this.rapportsFinanciers = rapportsFinanciers;
    }

    public List<Depense> getDepenses() {
        return depenses;
    }

    public void setDepenses(List<Depense> depenses) {
        this.depenses = depenses;
    }

    public void ajouterVehicule(Vehicule vehicule) {
        vehicules.add(vehicule);
    }

    public void ajouterTrajet(Trajet trajet) {
        trajets.add(trajet);
    }

    public void ajouterAdmin(Admin admin) {
        admins.add(admin);
    }

    public void ajouterRapportFinancier(RapportFinancier rapport) {
        rapportsFinanciers.add(rapport);
    }

    public void ajouterDepense(Depense depense) {
        depenses.add(depense);
    }

    public double calculerRevenuTotal() {
        double total = 0.0;

        for (Trajet trajet : trajets) {
            for (Reservation reservation : trajet.obtenirReservations()) {
                if (reservation.getStatut() == StatutReservation.CONFIRMEE) {
                    total += reservation.getMontantTotal();
                }
            }
        }

        return total;
    }

    public Trajet obtenirTrajetPopulaire() {
        return trajets.stream()
                .max(Comparator.comparingDouble(Trajet::calculerTauxRemplissage))
                .orElse(null);
    }

    @Override
    public String toString() {
        return "EntrepriseTransport{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephone='" + telephone + '\'' +
                ", capital=" + capital +
                ", nombreVehicules=" + vehicules.size() +
                ", nombreTrajets=" + trajets.size() +
                ", nombreAdmins=" + admins.size() +
                '}';
    }
}