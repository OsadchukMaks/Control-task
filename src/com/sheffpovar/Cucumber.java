package com.sheffpovar;

public class Cucumber extends Vegetable {
    private boolean frostResistance;

    public Cucumber(int calories, int size, Color color, boolean frostResistance) {
        super(calories, size, color);
        this.frostResistance = frostResistance;
    }

    @Override
    public String toString() {
        return "Cucumber " + super.toString().concat(
                "frostResistance=" + frostResistance +
                        '}');
    }
}
