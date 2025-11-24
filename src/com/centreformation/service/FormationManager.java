package com.centreformation.service;

import com.centreformation.model.Formation;

import java.util.ArrayList;
import java.util.List;

public class FormationManager {

    private static FormationManager instance;

    private List<Formation> formations = new ArrayList<>();

    private FormationManager() { }

    public static FormationManager getInstance() {
        if (instance == null) {
            instance = new FormationManager();
        }
        return instance;
    }

    public void ajouterFormation(Formation f) {
        if (f != null && !formations.contains(f)) {
            formations.add(f);
        }
    }

    public List<Formation> getFormations() {
        return formations;
    }
}
