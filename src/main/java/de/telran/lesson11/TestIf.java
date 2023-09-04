package de.telran.lesson11;

public class TestIf {
    public static void main(String[] args) {
        int myInt = 10;
        if(myInt==15) System.out.println("Я не попал в IF");

        if(myInt>=10) System.out.println("Ура! Я в IF");

        System.out.println("Я в основном потоке");
    }
}
