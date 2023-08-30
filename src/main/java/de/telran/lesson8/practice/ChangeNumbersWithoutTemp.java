package de.telran.lesson8.practice;

import java.util.Scanner;

public class ChangeNumbersWithoutTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число ");
        int num2 = scanner.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Первое число = "+num1);
        System.out.println("Второе число = "+num2);
    }
}
