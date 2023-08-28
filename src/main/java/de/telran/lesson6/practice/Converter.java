package de.telran.lesson6.practice;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number; // число
        int numberSystem; //текущая система счисления
        int numberSystemNumber; // система счисления для перевода

        System.out.print("В какой системе счисления текущее число? ");
        numberSystem = scanner.nextInt();
        System.out.print("Введите число: ");
        number = scanner.nextLong();
        System.out.print("В какую систему счисления преобразовать? ");
        numberSystemNumber = scanner.nextInt();
        System.out.println("Полученное число = "+Long.toString(number, numberSystemNumber));
    }
}
