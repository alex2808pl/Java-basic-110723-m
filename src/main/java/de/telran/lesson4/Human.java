package de.telran.lesson4;

public class Human {

    static int countEyes = 2;

    int height;
    int weight;
    int colorEye;

    void run() {
        System.out.println("Human бежит и смотрит "+countEyes+"-мя глазами");
    }

    void jump() {
        int count = 5;
        System.out.println("Human прыгает " +count+" раз с весом "+weight);
    }
}
