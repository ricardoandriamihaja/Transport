
import java.util.Date;

public class Paiement {

    private int id;
    private double montant;
    private Date datePaiement;
    private String modePaiement;

    public Paiement(int id, double montant, Date datePaiement, String modePaiement) {
        this.id = id;
        this.montant = montant;
        this.datePaiement = datePaiement;
        this.modePaiement = modePaiement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    public String getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(String modePaiement) {
        this.modePaiement = modePaiement;
    }

    public void effectuerPaiement() {
        // TODO: implementer la logique d'execution du paiement
    }

    @Override
    public String toString() {
        return "Paiement{" +
                "id=" + id +
                ", montant=" + montant +
                ", datePaiement=" + datePaiement +
                ", modePaiement='" + modePaiement + '\'' +
                '}';
    }
}