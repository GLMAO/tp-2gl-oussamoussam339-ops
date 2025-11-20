package com.polytech.tp;

public class CoursEnAnglais extends CoursDecorator {
    public CoursEnAnglais(ICours cours) {  // même nom que la classe !
        super(cours);
    }

    @Override
    public String getDescription() {
        return coursDecore.getDescription() + " (En anglais)";
    }
}