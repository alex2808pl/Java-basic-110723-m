package de.telran.lesson18.practice;

public class Car {
    private double price;
    private String model;

    public Car(double price, String model) {
        this.price = price;
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {    // Car@5464576
        return "Car|"+ model +
                ", price = " + price+"|";
    }
}
