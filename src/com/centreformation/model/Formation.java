package com.centreformation.model;

import java.util.ArrayList;
import java.util.List;

public class Formation {

    private int idFormation;
    private String titre;
    private int duree; // en heures par ex.
    private CategorieFormation categorie;
    private List<Session> sessions = new ArrayList<>();

    public Formation(int idFormation, String titre, int duree, CategorieFormation categorie) {
        this.idFormation = idFormation;
        this.titre = titre;
        this.duree = duree;
        this.categorie = categorie;
    }

    public void ajouterSession(Session s) {
        if (s != null && !sessions.contains(s)) {
            sessions.add(s);
        }
    }

    public void supprimerSession(int idSession) {
        sessions.removeIf(s -> s.getIdSession() == idSession);
    }

    public int getIdFormation() {
        return idFormation;
    }

    public String getTitre() {
        return titre;
    }

    public int getDuree() {
        return duree;
    }

    public CategorieFormation getCategorie() {
        return categorie;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setCategorie(CategorieFormation categorie) {
        this.categorie = categorie;
    }
}
