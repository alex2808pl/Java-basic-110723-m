package de.telran.lesson6.practice;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerText = new Scanner(System.in);
        long number; // число
        int inNumberSystem; //текущая система счисления
        int outNumberSystem; // система счисления для перевода

        System.out.print("В какой системе счисления текущее число? ");
        inNumberSystem = scanner.nextInt();
        System.out.print("Введите число: ");
        number = Long.parseLong(scannerText.nextLine(), inNumberSystem);
        System.out.print("В какую систему счисления преобразовать? ");
        outNumberSystem = scanner.nextInt();
        System.out.println("Полученное число = "+Long.toString(number, outNumberSystem));
    }
}
