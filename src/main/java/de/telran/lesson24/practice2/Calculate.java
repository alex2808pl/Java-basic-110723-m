package de.telran.lesson24.practice2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        String[] resultHistory = new String[3];

        String nextCalc;
        do {
            System.out.println("Введите количество аргументов (2 и более):");
            int countArguments = scanner.nextInt();

            double[] arguments = new double[countArguments];
            char[] signs = new char[countArguments-1];
            for (int i = 0; i<arguments.length; i++) {
                System.out.print("Введите значение "+(i+1)+"-го аргумента (разделитель целой и дробной части - точка): ");
                arguments[i] = scanner.nextDouble();

                if(i < arguments.length-1) {
                    do {
                        System.out.print("Введите знак математической операции (+, -, *, /, %): ");
                        String signString = scanner.next();
                        signs[i] = signString.charAt(0);
                    }
                    while (signs[i] != '+' && signs[i] != '-' && signs[i] != '*' && signs[i] != '/' && signs[i] != '%');
                }
            }

            double result = arguments[0];
            for (int i = 1; i<arguments.length; i++) {
                switch (signs[i-1]) { // Выполнение математической операции в зависимости от введенного знака
                    case '+': // Если пользователь ввёл знак + ...
                        result += arguments[i]; // ... выполняется операция сложения
                        break;
                    case '-': // Если пользователь ввёл знак - ...
                        result -= arguments[i]; // ... выполняется операция вычитания
                        break;
                    case '*': // Если пользователь ввёл знак * ...
                        result *= arguments[i]; // ... выполняется операция умножения
                        break;
                    case '/': // Если пользователь ввёл знак / ...
                        result /= arguments[i]; // ... выполняется операция деления
                        break;
                    case '%': // Если пользователь ввёл знак % ...
                        result %= arguments[i]; // ... выполняется операция деления по модулю (получение остатка от деления)
                }
            }

            StringBuilder resultMes = new StringBuilder();
            for (int i = 0; i<arguments.length; i++) {
                resultMes.append(String.format(" %.2f ", arguments[i]));
                if(i < arguments.length-1) resultMes.append(signs[i]);
            }
            resultMes.append(" = ").append(String.format(" %.2f", result));
            System.out.println(resultMes);

            for (int i = resultHistory.length - 1; i > 0; i--)
                resultHistory[i] = resultHistory[i-1];

            resultHistory[0] = resultMes.toString();

            System.out.println("История выполненных вычислений:");
            System.out.println(Arrays.toString(resultHistory));


            do {
                System.out.println("Выполнить еще вычисление? (Y/N)");
                nextCalc = scanner.next();
            }
            while (!nextCalc.equalsIgnoreCase("Y") && !nextCalc.equalsIgnoreCase("N"));
        }
        while (!nextCalc.equalsIgnoreCase("N"));
    }
}

//    Доработайте программу "Калькулятор" (версии 2) таким образом, чтобы она позволяла:
//        Вводить знак математической операции перед вводом каждого следующего аргумента.
//        Например, пользователь указывает, что хочет выполнить операцию над тремя аргументами.
//          Программа просит последовательно ввести первый аргумент, знак математической операции,
//          будет выполнен над значениями первого и второго аргумента, значение второго аргумента,
//          знак математической операции, который будет выполнен над результатом операции между первым и вторым аргументом
//          и третьим аргументом.
//        В результате, программа должна позволять вычислить следующее выражение: 3 * 4 - 10.5 + 2 = 3.5
//        Выводить на экран историю последних 5 вычислений.

//    Введите количество аргументов (2 и более): 3
//        Введите значение 1 аргумента: 3
//        Введите знак математической операции (+, -, *, /): *
//        Введите значение 2 аргумента: 3
//        Введите знак математической операции (+, -, *, /): -
//        Введите значение 3 аргумента: 9
//        3,00*3,00-9,00=0,00
//        История выполненных вычислений:
//        [3,00*3,00-9,00=0,00, 2,00+2,00=4,00, null]

