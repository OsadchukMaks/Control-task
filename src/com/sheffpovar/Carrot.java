package com.sheffpovar;

public class Carrot extends Vegetable {
    private int countVitaminA;

    public Carrot(int calories, int size, Color color, int countVitaminA) {
        super(calories, size, color);
        this.countVitaminA = countVitaminA;
    }

    @Override
    public String toString() {
        return "Carrot" + super.toString().concat(
                "countVitaminA=" + countVitaminA +
                '}');
    }
}
