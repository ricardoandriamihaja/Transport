
import java.util.ArrayList;
import java.util.List;

public class Admin extends Utilisateur {
    private String matricule;
    private EntrepriseTransport entreprise;

    public Admin(int id, String nom, String prenom, String telephone, String email, String matricule) {
        super(id, nom, prenom, telephone, email);
        this.matricule = matricule;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public EntrepriseTransport getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(EntrepriseTransport entreprise) {
        this.entreprise = entreprise;
    }

    public void ajouterVehicule(Vehicule vehicule) {
        if (entreprise != null) {
            entreprise.getVehicules().add(vehicule);
        }
    }

    public void modifierVehicule(Vehicule vehicule) {
        if (entreprise == null) {
            return;
        }

        List<Vehicule> vehicules = entreprise.getVehicules();

        for (int i = 0; i < vehicules.size(); i++) {
            if (vehicules.get(i).getId() == vehicule.getId()) {
                vehicules.set(i, vehicule);
                break;
            }
        }
    }

    public void ajouterTrajet(Trajet trajet) {
        if (entreprise != null) {
            entreprise.getTrajets().add(trajet);
        }
    }

    public void modifierTrajet(Trajet trajet) {
        if (entreprise == null) {
            return;
        }

        List<Trajet> trajets = entreprise.getTrajets();

        for (int i = 0; i < trajets.size(); i++) {
            if (trajets.get(i).getId() == trajet.getId()) {
                trajets.set(i, trajet);
                break;
            }
        }
    }

    public List<RapportFinancier> consulterRapportsFinanciers() {
        if (entreprise != null) {
            return entreprise.getRapportsFinanciers();
        }
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + getId() +
                ", nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", matricule='" + matricule + '\'' +
                '}';
    }
}