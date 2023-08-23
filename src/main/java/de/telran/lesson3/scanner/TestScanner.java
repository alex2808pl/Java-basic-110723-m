package de.telran.lesson3.scanner;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int myInt = myScanner.nextInt();
        System.out.println("MyInt = "+myInt);

        System.out.println("Введите длинное целое число: ");
        long myLong = myScanner.nextLong();
        System.out.println("myLong = "+myLong);

        System.out.println("Введите дробное число: ");
        double myDouble = myScanner.nextDouble();
        System.out.println("myDouble = "+myDouble);

        System.out.println("Введите логический вариант: ");
        boolean myBoolean = myScanner.nextBoolean();
        System.out.println("myBoolean = "+myBoolean);

        System.out.println("Введите символ: ");
        char myChar = myScanner.next().charAt(0); //для получения символа
        System.out.println("myChar = "+myChar);

        Scanner myStringScanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String myString = myStringScanner.nextLine();
        System.out.println("myString = "+myString);
    }
}
