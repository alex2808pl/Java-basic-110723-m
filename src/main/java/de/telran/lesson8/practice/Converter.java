package de.telran.lesson8.practice;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах по Цельсию: ");
        double inValue = scanner.nextDouble();
        System.out.println("Температура в Кельвинах = "+runKelvinConverter(inValue));
        System.out.println("Температура в Фаренгейте = "+runFahrenheitConverter(inValue));
    }

    static double runKelvinConverter(double baseValue) {
        return baseValue + 273.15;
    }

    static double runFahrenheitConverter(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}
