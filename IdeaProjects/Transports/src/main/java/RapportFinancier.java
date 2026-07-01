
import java.util.Date;

public class RapportFinancier {

    private int id;
    private double revenuTotal;
    private double depenseTotale;
    private double benefice;
    private Date dateGeneration;

    public RapportFinancier(int id, double revenuTotal, double depenseTotale, Date dateGeneration) {
        this.id = id;
        this.revenuTotal = revenuTotal;
        this.depenseTotale = depenseTotale;
        this.dateGeneration = dateGeneration;
        this.benefice = calculerBenefice();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRevenuTotal() {
        return revenuTotal;
    }

    public void setRevenuTotal(double revenuTotal) {
        this.revenuTotal = revenuTotal;
    }

    public double getDepenseTotale() {
        return depenseTotale;
    }

    public void setDepenseTotale(double depenseTotale) {
        this.depenseTotale = depenseTotale;
    }

    public double getBenefice() {
        return benefice;
    }

    public void setBenefice(double benefice) {
        this.benefice = benefice;
    }

    public Date getDateGeneration() {
        return dateGeneration;
    }

    public void setDateGeneration(Date dateGeneration) {
        this.dateGeneration = dateGeneration;
    }

    public double calculerBenefice() {
        this.benefice = this.revenuTotal - this.depenseTotale;
        return this.benefice;
    }

    @Override
    public String toString() {
        return "RapportFinancier{" +
                "id=" + id +
                ", revenuTotal=" + revenuTotal +
                ", depenseTotale=" + depenseTotale +
                ", benefice=" + benefice +
                ", dateGeneration=" + dateGeneration +
                '}';
    }
}
