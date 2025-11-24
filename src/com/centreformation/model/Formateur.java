package com.centreformation.model;

import java.util.ArrayList;
import java.util.List;

import com.centreformation.model.observer.Observateur;

public class Formateur implements Observateur {

    private int idFormateur;
    private String nom;
    private String prenom;
    private List<String> specialites = new ArrayList<>();

    public Formateur(int idFormateur, String nom, String prenom) {
        this.idFormateur = idFormateur;
        this.nom = nom;
        this.prenom = prenom;
    }

    public void ajouterSpecialite(String s) {
        if (s != null && !s.isBlank() && !specialites.contains(s)) {
            specialites.add(s);
        }
    }

    @Override
    public void update(String message) {
        System.out.println("Notification formateur " + nom + " " + prenom + " : " + message);
    }

    public int getIdFormateur() {
        return idFormateur;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public List<String> getSpecialites() {
        return specialites;
    }
}
