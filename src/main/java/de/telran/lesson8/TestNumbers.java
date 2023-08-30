package de.telran.lesson8;

import java.util.Scanner;

public class TestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int myInt = scanner.nextInt();
        findEvenOdd(myInt);

        System.out.print("Введите дробное число ");
        double myDouble = scanner.nextDouble();
        if(findEvenOdd(myDouble)) {
            System.out.println("Число "+myDouble+" парное");
        }
    }

    static void findEvenOdd(int num) {
        if(num % 2 == 0) {
            System.out.println("Число "+num+" парное");
        }
        else {
            System.out.println("Число "+num+" не парное");
        }
    }

    static boolean findEvenOdd(double num) {
        return num % 2 == 0;
    }
}
