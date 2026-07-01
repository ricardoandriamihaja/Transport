
import java.util.Date;

public class Depense {

    private int id;
    private double montant;
    private Date dateDepense;
    private String description;

    public Depense(int id, double montant, Date dateDepense, String description) {
        this.id = id;
        this.montant = montant;
        this.dateDepense = dateDepense;
        this.description = description;
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

    public Date getDateDepense() {
        return dateDepense;
    }

    public void setDateDepense(Date dateDepense) {
        this.dateDepense = dateDepense;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void enregistrerDepense() {
        // TODO: implementer la logique d'enregistrement de la depense
    }

    @Override
    public String toString() {
        return "Depense{" +
                "id=" + id +
                ", montant=" + montant +
                ", dateDepense=" + dateDepense +
                ", description='" + description + '\'' +
                '}';
    }
}