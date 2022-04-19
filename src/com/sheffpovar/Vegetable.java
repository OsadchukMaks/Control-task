package com.sheffpovar;

public abstract class Vegetable implements Comparable<Vegetable> {
    private int calories;
    private int size;
    private Color color;

    public Vegetable(int calories, int size, Color color) {
        this.calories = calories;
        this.size = size;
        this.color = color;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public int compareTo(Vegetable v) {
        return Integer.compare(this.calories, v.calories);
    }

    @Override
    public String toString() {
        return
                "{calories=" + calories +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
