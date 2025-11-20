package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    // Méthode exigée par le test JUnit
    public void setChangement(String message) {
        notifyObservers(message);
    }

    // Méthode utilisée dans App.java (et attendue par ton prof)
    public void ajouterCours(ICours cours) {
        String msg = "Nouveau cours ajouté : " + cours.getDescription();
        System.out.println(msg);
        notifyObservers(msg);
    }

    // Méthode utilisée dans App.java → OBLIGATOIRE pour compiler !
    public void modifierCours(ICours cours, String details) {
        String msg = "Cours modifié : " + cours.getDescription() + " → " + details;
        System.out.println(msg);
        notifyObservers(msg);
    }
}