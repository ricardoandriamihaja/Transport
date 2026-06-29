package org.example;

import java.time.LocalDate;
import java.util.List;

public class RapportFinancier {
    private int id;
    private double revenuTotal;
    private double depenseTotale;
    private double benefice;
    private LocalDate dateGeneration;

    public RapportFinancier(int id, double revenuTotal, LocalDate dateGeneration) {
        this.id = id;
        this.revenuTotal = revenuTotal;
        this.depenseTotale = 0.0;
        this.benefice = 0.0;
        this.dateGeneration = dateGeneration;
    }

    public double calculerBenefice(List<Depense> depenses) {
        double somme = 0.0;
        for (Depense d : depenses) {
            somme += d.getMontant();
        }
        this.depenseTotale = somme;
        this.benefice = this.revenuTotal - this.depenseTotale;
        return this.benefice;
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

    public LocalDate getDateGeneration() {
        return dateGeneration;
    }

    public void setDateGeneration(LocalDate dateGeneration) {
        this.dateGeneration = dateGeneration;
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