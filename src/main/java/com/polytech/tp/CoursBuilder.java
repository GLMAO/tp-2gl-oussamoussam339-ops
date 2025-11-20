package com.polytech.tp;

public class CoursBuilder {
    private String matiere;
    private String enseignant;
    private String salle = "Non définie";
    private String date = "Non définie";
    private String heureDebut = "Non définie";
    private boolean estOptionnel = false;
    private String niveau = "L3";
    private boolean necessiteProjecteur = false;

    public CoursBuilder() {}

    public CoursBuilder setMatiere(String matiere) {
        this.matiere = matiere;
        return this;
    }

    public CoursBuilder setEnseignant(String enseignant) {
        this.enseignant = enseignant;
        return this;
    }

    public CoursBuilder setSalle(String salle) { this.salle = salle; return this; }
    public CoursBuilder setDate(String date) { this.date = date; return this; }
    public CoursBuilder setHeureDebut(String heureDebut) { this.heureDebut = heureDebut; return this; }
    public CoursBuilder setOptionnel(boolean estOptionnel) { this.estOptionnel = estOptionnel; return this; }
    public CoursBuilder setNiveau(String niveau) { this.niveau = niveau; return this; }
    public CoursBuilder setNecessiteProjecteur(boolean necessiteProjecteur) { this.necessiteProjecteur = necessiteProjecteur; return this; }

    public Cours build() {
        if (matiere == null || enseignant == null) {
            throw new IllegalStateException("Matière et enseignant obligatoires");
        }
        return new Cours(this);
    }

    // Getters pour le constructeur de Cours
    protected String getMatiere() { return matiere; }
    protected String getEnseignant() { return enseignant; }
    protected String getSalle() { return salle; }
    protected String getDate() { return date; }
    protected String getHeureDebut() { return heureDebut; }
    protected boolean isEstOptionnel() { return estOptionnel; }
    protected String getNiveau() { return niveau; }
    protected boolean isNecessiteProjecteur() { return necessiteProjecteur; }
}