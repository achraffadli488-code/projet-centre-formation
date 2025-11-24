package com.centreformation.controller;

import java.util.Scanner;

import com.centreformation.service.FormationManager;
import com.centreformation.view.ConsoleView;

public class MenuController {

    private final ConsoleView view;
    private final FormationManager formationManager;
    private final Scanner scanner;

    public MenuController() {
        this.view = new ConsoleView();
        this.formationManager = FormationManager.getInstance();
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean quitter = false;
        while (!quitter) {
            view.afficherMenuPrincipal();
            int choix = view.lireChoix(scanner);
            switch (choix) {
                case 1 -> gererFormations();
                case 2 -> gererSessions();
                case 3 -> gererApprenants();
                case 4 -> gererFormateurs();
                case 5 -> quitter = true;
                default -> view.afficherMessage("Choix invalide.");
            }
        }
        view.afficherMessage("Au revoir.");
    }

    private void gererFormations() {
        view.afficherMessage("[TODO] Gestion des formations (à compléter)");
    }

    private void gererSessions() {
        view.afficherMessage("[TODO] Gestion des sessions (à compléter)");
    }

    private void gererApprenants() {
        view.afficherMessage("[TODO] Gestion des apprenants (à compléter)");
    }

    private void gererFormateurs() {
        view.afficherMessage("[TODO] Gestion des formateurs (à compléter)");
    }
}
