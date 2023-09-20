package de.telran.lesson23.practice4;

import java.util.Locale;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        String nextCalc;
        do {
            System.out.println("Введите количество аргументов (2 и более):");
            int countArguments = scanner.nextInt();

            double[] arguments = new double[countArguments];
            for (int i = 0; i<arguments.length; i++) {
                System.out.println("Введите значение "+(i+1)+"-го аргумента (разделитель целой и дробной части - точка):");
                arguments[i] = scanner.nextDouble();
            }

            char sign;
            do {
                System.out.println("Введите знак математической операции (+, -, *, /, %):");
                String signString = scanner.next();
                sign = signString.charAt(0);
            }
            while (sign != '+' && sign != '-' && sign != '*' && sign != '/' && sign != '%');

            double result = arguments[0];
            for (int i = 1; i<arguments.length; i++) {
                switch (sign) { // Выполнение математической операции в зависимости от введенного знака
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
                if(i < arguments.length-1) resultMes.append(sign);
            }
            resultMes.append(" = ").append(result);
            System.out.println(resultMes);

            do {
                System.out.println("Выполнить еще вычисление? (Y/N)");
                nextCalc = scanner.next();
            }
            while (!nextCalc.equalsIgnoreCase("Y") && !nextCalc.equalsIgnoreCase("N"));
        }
        while (!nextCalc.equalsIgnoreCase("N"));

    }
}


//    Продолжаем работу над калькулятором.
//        Обновите "Калькулятор" до версии 2,
//        Обновите функционал до производящего вычисления (+, -, *, /) с произвольным количеством чисел c дробной частью.
//        Количество аргументов пользователь вводит с клавиатуры. Оно должно быть от 2 и более.
//        Тип данных вводимых аргументов должен быть Double.
//        Далее пользователь последовательно вводит значение каждого из аргументов, а затем - знак математической операции, которую необходимо выполнить со значениями введенных аргументов.
//        Результат работы программы необходимо вывести в виде вычисляемого выражения и полученного результата с точностью до двух чисел после запятой.
