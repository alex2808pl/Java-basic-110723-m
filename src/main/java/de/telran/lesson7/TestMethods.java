package de.telran.lesson7;

import java.util.Scanner;

public class TestMethods {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите первое число = ");
//        int num1 = scanner.nextInt();
//        System.out.print("Введите второе число = ");
//        int num2 = scanner.nextInt();
//        int sum = num1 + num2;
//        System.out.println("Сумма чисел = "+sum);
//
//        System.out.print("Введите первое число = ");
//        num1 = scanner.nextInt();
//        System.out.print("Введите второе число = ");
//        num2 = scanner.nextInt();
//        sum = num1 + num2;
//        System.out.println("Сумма чисел = "+sum);

//        sum();
//        sum();
//        System.out.println("Сумма чисел 5 и 25 = "+sumCalc(5, 25));
//        System.out.println("Сумма каких то чисел = "+sumCalcWithoutParam());
//        System.out.println("Сумма 4х чисел = "+(sumCalc(2,5) + sumCalc(7,8)));

        System.out.println("Результат = "+div(10,2));
    }

    static void sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число = ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число = ");
        int num2 = scanner.nextInt();
        int sum = sumCalc(num1, num2); //num1 + num2;
        System.out.println("Сумма чисел = "+sum);
    }

    // перегрузка метода
    static int sumCalc(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
//        return num1 + num2;
    }

    static int sumCalc(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
//        return num1 + num2;
    }
    private static int sumCalcWithoutParam() {
        int sum = 25 + 33;
        return sum;
    }

    static int div(int num1, int num2) throws IllegalArgumentException {
//        if(num2==0) throw new IllegalArgumentException("by zero");
        return num1 / num2;
    }
}
