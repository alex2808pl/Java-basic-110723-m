package de.telran.lesson13.practice;

import java.util.Scanner;

public class taskFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число = ");
        int count = scanner.nextInt();
        printNumbers(count);
    }

    static void printNumbers(int count) {
        for (int i = 1; i <= count; i++) System.out.println(" i = "+i+ " из числа -> "+count);
    }
}

//    Реализуйте метод, принимающий в параметре число.
//        Распечатайте все входящие значения числа
//
//        Например:
//        Вход = 8
//        Выход =
//        1
//        2
//        3
//        …
//        8

