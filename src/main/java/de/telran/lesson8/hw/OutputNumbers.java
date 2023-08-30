package de.telran.lesson8.hw;

import java.util.Scanner;

public class OutputNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 100 до 999: ");
        int count = scanner.nextInt();
        System.out.println(count % 10);
        System.out.println(count % 100 / 10);
        System.out.println(count / 100);
    }
}
