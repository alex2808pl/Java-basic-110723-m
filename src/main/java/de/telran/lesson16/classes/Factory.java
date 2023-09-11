package de.telran.lesson16.classes;

public class Factory {
    public static void main(String[] args) {
        Auto auto1 = new Auto(); // конструктор по умолчанию
        auto1.run();

        Auto auto2 = new Auto("BMW"); // инициализирующий конструктор
        auto2.run();

        Auto auto3 = new Auto(3, 5, 2, "Wolkswagen"); // инициализирующий конструктор
        auto3.run();

    }
}
