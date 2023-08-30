package de.telran.lesson7;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Random = "+(10+random.nextInt(10)));

        double randomNum = Math.random();
        System.out.println("Math Default = "+randomNum);

        int randomInt = 10 + (int)(Math.random()*10);
        System.out.println("Math Int = "+randomInt);

        System.out.println("randomInterval = "+randomInterval(-10,10));

        System.out.println("randomIntervalMath = "+randomIntervalMath(-10,10));

        System.out.println("double Random = "+random.nextDouble());

        System.out.println("double Random = "+random.nextDouble()*10);

        System.out.println("double Math = "+Math.random()*10);

    }

    static int randomInterval(int min, int max) {
        Random random = new Random();
        int newInt = min + random.nextInt(max - min);
        return newInt;
    }

    static int randomIntervalMath(int min, int max) {
        return min + (int)(Math.random()*(max - min));
    }
}
