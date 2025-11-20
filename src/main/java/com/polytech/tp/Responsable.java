package com.polytech.tp;

public class Responsable implements Observer {
    private final String nom;

    public Responsable(String nom) {
        this.nom = nom;
    }

    @Override
    public void update(String message) {
        System.out.println("ALERTE Responsable " + nom + " → " + message);
    }
}