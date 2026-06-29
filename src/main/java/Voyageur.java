import java.util.UUID;

public class Voyageur extends Utilisateur {
    private String numeroClient;

    public Voyageur(UUID id, String nom, String prenom, String telephone, String email, String numeroClient) {
        super(id, nom, prenom, telephone, email);
        this.numeroClient = numeroClient;
    }

    public String getNumeroClient() { return numeroClient; }
    public void setNumeroClient(String numeroClient) { this.numeroClient = numeroClient; }

    public void reserverTrajet() {
        
    }

    public void annulerReservation() {
        
    }

    @Override
    public String toString() {
        return "Voyageur{" +
                "numeroClient='" + numeroClient + '\'' +
                ", utilisateur=" + super.toString() +
                '}';
    }
}
