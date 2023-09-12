package de.telran.lesson17;

public class Pen {
    String color;
    int lenght;

    public Pen() {
    }

    public Pen(String color, int lenght) {
        this.color = color;
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", lenght=" + lenght +
                '}';
    }
}
