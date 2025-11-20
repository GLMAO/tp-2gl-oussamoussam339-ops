package com.polytech.tp;

public class Cours implements ICours {
    private final String matiere;
    private final String enseignant;
    private final String salle;
    private final String date;
    private final String heureDebut;
    private final boolean estOptionnel;
    private final String niveau;
    private final boolean necessiteProjecteur;

    // Constructeur complet (exigé par le test Decorator)
    public Cours(String matiere, String enseignant, String salle, String date,
                 String heureDebut, boolean estOptionnel, String niveau, boolean necessiteProjecteur) {
        this.matiere = matiere;
        this.enseignant = enseignant;
        this.salle = salle;
        this.date = date;
        this.heureDebut = heureDebut;
        this.estOptionnel = estOptionnel;
        this.niveau = niveau;
        this.necessiteProjecteur = necessiteProjecteur;
    }

    // Constructeur utilisé par le Builder
    public Cours(CoursBuilder builder) {
        this.matiere = builder.getMatiere();
        this.enseignant = builder.getEnseignant();
        this.salle = builder.getSalle();
        this.date = builder.getDate();
        this.heureDebut = builder.getHeureDebut();
        this.estOptionnel = builder.isEstOptionnel();
        this.niveau = builder.getNiveau();
        this.necessiteProjecteur = builder.isNecessiteProjecteur();
    }

    @Override
    public String getDescription() {
        return "Cours de " + matiere + " avec " + enseignant + " (" + salle + ")";
    }

    @Override
    public double getDuree() {
        return 1.5;
    }

    // Getters publics exigés par le test Builder
    public String getMatiere() { return matiere; }
    public String getEnseignant() { return enseignant; }
}