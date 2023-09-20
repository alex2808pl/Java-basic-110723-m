package de.telran.lesson23.practice3;

import java.util.Locale;
import java.util.Scanner;

public class Caculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        String nextCalc;
        do {
            System.out.println("Введите значение первого аргумента (разделитель целой и дробной части - точка):");
            double argumentOne = scanner.nextDouble();

            char sign;
            do {
                System.out.println("Введите знак математической операции (+, -, *, /, %):");
                String signString = scanner.next();
                sign = signString.charAt(0);
            }
            while (sign != '+' && sign != '-' && sign != '*' && sign != '/' && sign != '%');

            double argumentTwo;
            do {
                System.out.println("Введите значение второго аргумента (разделитель целой и дробной части - точка):");
                argumentTwo = scanner.nextDouble();
            }
            while ((sign == '/' || sign == '%') && argumentTwo == 0);

            double result = 0;

            switch (sign) { // Выполнение математической операции в зависимости от введенного знака
                case '+': // Если пользователь ввёл знак + ...
                    result = argumentOne + argumentTwo; // ... выполняется операция сложения
                    break;
                case '-': // Если пользователь ввёл знак - ...
                    result = argumentOne - argumentTwo; // ... выполняется операция вычитания
                    break;
                case '*': // Если пользователь ввёл знак * ...
                    result = argumentOne * argumentTwo; // ... выполняется операция умножения
                    break;
                case '/': // Если пользователь ввёл знак / ...
                    result = argumentOne / argumentTwo; // ... выполняется операция деления
                    break;
                case '%': // Если пользователь ввёл знак % ...
                    result = argumentOne % argumentTwo; // ... выполняется операция деления по модулю (получение остатка от деления)
            }

            System.out.println(String.format("%.2f %s %.2f = %.2f", argumentOne, sign, argumentTwo, result));

            do {
                System.out.println("Выполнить еще вычисление? (Y/N)");
                nextCalc = scanner.next();
            }
            while (!nextCalc.equalsIgnoreCase("Y") && !nextCalc.equalsIgnoreCase("N"));
        }
        while (!nextCalc.equalsIgnoreCase("N"));

    }
}


/*    Используйте операторы цикла для:
        Реализации интерактивного меню. После завершения вычислений калькулятор должен спрашивать
           желает ли пользователь выполнить еще вычисление. Если пользователь вводит "Y", то калькулятор выполняет новый цикл работы - запрашивает значения аргументов и знак математической операции, выполняет вычисления и выводит на экран ответ. После этого снова спрашивает желает ли пользователь выполнить еще вычисление. Если пользователь вводит "N", то работа программы завершается.
        Ввода корректного значения выбора пользователя в интерактивном меню - "Y" или "N".
          сли пользователь ввёл иной символ - программа должна попросить ввести ответ снова, до тех под,
          пока пользователь не введет символ "Y" или "N".
        Ввода корректного значения второго аргумента (знаменателя), если пользователь выбрал знак деления.
          Если пользователь выбрал операцию деления и ввёл значение второго аргумента = 0, то программа
          должна запрашивать ввод нового значения аргумента до тех пор, пока оно не будет не равно нулю.
        Аналогично программа должна повторно запрашивать ввод знака математической операции до тех пор,
          пока он не будет введён корректно.*/
