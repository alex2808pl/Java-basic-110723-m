package de.telran.lesson7.practice;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите курс евро в доллар = ");
        double kurs = scanner.nextDouble();
        System.out.print("Введите сумму для конвертации = ");
        double sum = scanner.nextDouble();
        System.out.println("Вы получите долларов = "+convertEuroToDollar(sum, kurs));

    }
    static double convertEuroToDollar(double sum, double kurs) {
        return sum * kurs;
    }
}
