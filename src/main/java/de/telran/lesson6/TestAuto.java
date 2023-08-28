package de.telran.lesson6;

public class TestAuto {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.name = "BMW";
        auto1.maxSpeed = 250;
        auto1.yearIssue = 2023;
        auto1.run();

        Auto auto2 = new Auto();
        auto2.name = "Audi";
        auto2.maxSpeed = 230;
        auto2.yearIssue = 2022;
        auto2.run();

        Auto auto3 = new Auto("VW");
        auto3.maxSpeed = 210;
        auto3.yearIssue = 2021;
        auto3.run();

        Auto auto4 = new Auto("Fiat", 180);
        auto4.yearIssue = 2020;
        auto4.run();

        Auto auto5 = new Auto("Porsche", 300, 2023);
        auto5.run();
    }
}
