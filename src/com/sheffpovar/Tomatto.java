package com.sheffpovar;

public class Tomatto extends Vegetable {
    private boolean droughtResistant;

    public Tomatto(int calories, int size, Color color, boolean droughtResistant) {
        super(calories, size, color);
        this.droughtResistant = droughtResistant;
    }

    @Override
    public String toString() {
        return "Tomato" + super.toString().concat(
                "droughtResistant =" + droughtResistant +
                        '}');
    }
}
