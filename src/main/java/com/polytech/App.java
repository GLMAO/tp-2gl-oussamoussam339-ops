package com.polytech;

import com.polytech.tp.*;

public class App {
    public static void main(String[] args) {
        GestionnaireEmploiDuTemps gestionnaire = new GestionnaireEmploiDuTemps();

        // Observers
        Observer alice = new Etudiant("Alice");
        Observer bob = new Etudiant("Bob");
        Observer charlie = new Etudiant("Charlie");
        Observer resp = new Responsable("Mme. Dupont");

        gestionnaire.attach(alice);
        gestionnaire.attach(bob);
        gestionnaire.attach(charlie);
        gestionnaire.attach(resp);

        // Cours de base avec Builder
        ICours gl = new CoursBuilder()
                .setMatiere("Génie Logiciel")
                .setEnseignant("Mr Oussama")
                .setSalle("Amphi 1")
                .setDate("25/11/2025")
                .setHeureDebut("10h00")
                .build();

        // Application de plusieurs décorateurs (on peut empiler !)
        ICours coursDecore = new CoursEnLigne(gl);
        coursDecore = new CoursEnAnglais(coursDecore);
        coursDecore = new CoursMagistral(coursDecore);

        System.out.println("\n=== Ajout du cours ===");
        gestionnaire.ajouterCours(coursDecore);
        // → affiche description + notifications automatiques

        System.out.println("\n=== Modification du cours ===");
        gestionnaire.modifierCours(coursDecore, "Reporté à 14h00 pour cause technique");

        // Bonus : détacher un étudiant
        gestionnaire.detach(bob);

        System.out.println("\n=== Deuxième modification (Bob ne reçoit plus) ===");
        gestionnaire.modifierCours(coursDecore, "Salle changée → Amphi 2");


    }
}