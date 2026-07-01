
import java.util.Date;

public class HistoriquePrix {
    private int id;
    private double ancienPrix;
    private double nouveauPrix;
    private Date dateModification;

    public HistoriquePrix(int id, double ancienPrix, double nouveauPrix, Date dateModification) {
        this.id = id;
        this.ancienPrix = ancienPrix;
        this.nouveauPrix = nouveauPrix;
        this.dateModification = dateModification;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAncienPrix() {
        return ancienPrix;
    }

    public void setAncienPrix(double ancienPrix) {
        this.ancienPrix = ancienPrix;
    }

    public double getNouveauPrix() {
        return nouveauPrix;
    }

    public void setNouveauPrix(double nouveauPrix) {
        this.nouveauPrix = nouveauPrix;
    }

    public Date getDateModification() {
        return dateModification;
    }

    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }

    @Override
    public String toString() {
        return "HistoriquePrix{" +
                "id=" + id +
                ", ancienPrix=" + ancienPrix +
                ", nouveauPrix=" + nouveauPrix +
                ", dateModification=" + dateModification +
                '}';
    }
}