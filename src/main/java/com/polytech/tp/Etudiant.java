package com.polytech.tp;

public class Etudiant implements Observer {
    private final String nom;

    public Etudiant(String nom) {
        this.nom = nom;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification étudiant " + nom + " → " + message);
    }
}