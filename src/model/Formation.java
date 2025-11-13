package src.model;
import java.util.ArrayList;
import java.util.List;

public class Formation {
    private int idFormation;
    private String titre;
    private int duree;
    private String categorie;
    private List sessions = new ArrayList<>();
    
    public Formation(int id, String titre, int duree, String categorie) {
        this.idFormation = id;
        this.titre = titre;
        this.duree = duree;
        this.categorie = categorie;
    }

    public void ajouterSession(Session s) { }
    public void supprimerSession(int id) { }
// getters / setters
    
}
