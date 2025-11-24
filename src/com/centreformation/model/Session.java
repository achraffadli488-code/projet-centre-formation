package com.centreformation.model;

import com.centreformation.model.observer.Observateur;
import com.centreformation.model.observer.Sujet;
import com.centreformation.model.state.SessionState;
import com.centreformation.model.state.SessionOuverteState;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Session implements Sujet {

    private int idSession;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private int nbPlacesMax;
    private EtatSession etat;
    private Formation formation;
    private Formateur formateur;
    private List<Inscription> inscriptions = new ArrayList<>();

    // Pattern State
    private SessionState state;

    // Observer
    private List<Observateur> observateurs = new ArrayList<>();

    public Session(int idSession, LocalDate dateDebut, LocalDate dateFin,
                   int nbPlacesMax, Formation formation, Formateur formateur) {
        this.idSession = idSession;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.nbPlacesMax = nbPlacesMax;
        this.formation = formation;
        this.formateur = formateur;
        this.etat = EtatSession.OUVERTE;
        this.state = new SessionOuverteState();
    }

    public int getIdSession() {
        return idSession;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public int getNbPlacesMax() {
        return nbPlacesMax;
    }

    public EtatSession getEtat() {
        return etat;
    }

    public void setEtat(EtatSession etat) {
        this.etat = etat;
    }

    public Formation getFormation() {
        return formation;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public List<Inscription> getInscriptions() {
        return inscriptions;
    }

    public void setState(SessionState state) {
        this.state = state;
    }

    public void ouvrir() {
        state.ouvrir(this);
    }

    public void cloturer() {
        state.cloturer(this);
    }

    public void annuler() {
        state.annuler(this);
    }

    public boolean verifierPlaces() {
        long confirmes = inscriptions.stream()
                .filter(i -> i.getStatut() == StatutInscription.CONFIRMEE)
                .count();
        return confirmes < nbPlacesMax;
    }

    public void ajouterInscription(Inscription inscription) {
        if (inscription == null) return;

        if (verifierPlaces()) {
            inscription.confirmer();
        } else {
            // liste d'attente
            // on laisse statut ATTENTE
        }
        inscriptions.add(inscription);
    }

    // Observer

    @Override
    public void ajouterObservateur(Observateur o) {
        if (o != null && !observateurs.contains(o)) {
            observateurs.add(o);
        }
    }

    @Override
    public void retirerObservateur(Observateur o) {
        observateurs.remove(o);
    }

    @Override
    public void notifierObservateurs(String message) {
        for (Observateur o : observateurs) {
            o.update(message);
        }
    }
}
