package de.telran.lesson16.innerclass;

public class TestInner {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle();
        Bicycle.Seat seat1 = bicycle1.new Seat();
        bicycle1.color = "Красный";
        seat1.color = "Черный";
        System.out.println(bicycle1.color); //цвет велосипеда
        System.out.println(seat1.color); //цвет седла
        seat1.up();
        bicycle1.run();
     }
}


