package com.centreformation.view;

import java.util.Scanner;

public class ConsoleView {

    public void afficherMenuPrincipal() {
        System.out.println("===== CENTRE DE FORMATION =====");
        System.out.println("1. Gérer les formations");
        System.out.println("2. Gérer les sessions");
        System.out.println("3. Gérer les apprenants");
        System.out.println("4. Gérer les formateurs");
        System.out.println("5. Quitter");
        System.out.print("Votre choix : ");
    }

    public int lireChoix(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public void afficherMessage(String message) {
        System.out.println(message);
    }
}
