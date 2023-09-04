package de.telran.lesson11;

import java.util.Scanner;

public class TestReturn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int val1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int val2 = scanner.nextInt();

        int result = divide(val1, val2);
        System.out.println("Результат выражения "+val1+" / "+val2+" = "+result);

        divideVoid(val1, val2);

        divideVoidAnother(val1, val2);

    }

    static int divide(int val1, int val2) { //мы не можем использовать null
        if (val2 == 0) return Integer.MIN_VALUE;
        int result = val1 / val2;
        return result;
    }

    static void divideVoid(int val1, int val2) {
        if(val2 == 0) {
            System.out.println("второй параметр не может быть равен 0");
            return;
        }
        int result = val1 / val2;
        System.out.println("Результат выражения в divideVoid "+val1+" / "+val2+" = "+result);
    }

    static void divideVoidAnother(int val1, int val2) {
        if(val2 != 0) {
            int result = val1 / val2;
            System.out.println("Результат выражения в divideVoid "+val1+" / "+val2+" = "+result);
        }
        else System.out.println("второй параметр не может быть равен 0");

    }
}
