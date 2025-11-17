package model;

import java.util.ArrayList;
import java.util.List;

public class Apprenant {

    private int idApprenant;
    private String nom;
    private String prenom;
    private String email;
    private List<Formation> historique = new ArrayList<>();

    public Apprenant(int idApprenant, String nom, String prenom, String email) {
        this.idApprenant = idApprenant;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public void ajouterFormation(Formation f) {
        if (f != null && !historique.contains(f)) {
            historique.add(f);
        }
    }

    // Getters & Setters
}
