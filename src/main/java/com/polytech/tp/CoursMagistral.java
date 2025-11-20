// CoursMagistral.java (exemple supplémentaire)
package com.polytech.tp;

public class CoursMagistral extends CoursDecorator {
    public CoursMagistral(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        return coursDecore.getDescription() + " (Magistral)";
    }
    @Override
    public double getDuree() {
        return coursDecore.getDuree() + 1.5; // un magistral dure plus longtemps
    }
}