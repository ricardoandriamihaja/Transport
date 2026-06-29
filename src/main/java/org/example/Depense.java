package org.example;

import java.time.LocalDate;

public class Depense {
    private int id;
    private double montant;
    private LocalDate dateDepense;
    private String description;

    public Depense(int id, double montant, LocalDate dateDepense, String description) {
        this.id = id;
        this.montant = montant;
        this.dateDepense = dateDepense;
        this.description = description;
    }

    public void enregistrerDepense() {
        System.out.println("LOG: Dépense enregistrée avec succès -> [ID: " + this.id + " | " + this.description + " : " + this.montant + "]");
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

    public LocalDate getDateDepense() {
        return dateDepense;
    }

    public void setDateDepense(LocalDate dateDepense) {
        this.dateDepense = dateDepense;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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