package de.telran.lesson23.practice2;

import java.util.Locale;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        System.out.println("Введите значение первого аргумента (разделитель целой и дробной части - точка):");
        double argumentOne = scanner.nextDouble();
        System.out.println("Введите знак математической операции (+, -, *, /, %):");
        String signString = scanner.next();
        char sign = signString.charAt(0);
        if(sign != '+' && sign != '-' && sign != '*' && sign != '/' && sign != '%') {
            System.out.println("Указанная операция не поддерживается программой");
            System.exit(-1);
        }
        System.out.println("Введите значение второго аргумента (разделитель целой и дробной части - точка):");
        double argumentTwo = scanner.nextDouble();
        if ((sign == '/' || sign == '%') && argumentTwo == 0) { // Если пользователь ввёл знак деления или деления по модулю, то выполняется проверка деления на 0
            System.out.println("Делитель не должен быть равен 0");
            System.exit(-2); // Завершение работы программы
        }

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
    }
}

//    Используйте оператор switch-case вместо оператора if-else при обработке введенной математической операции.
//        К списку арифметических операций, выполняемых калькулятором, добавьте поддержку операции деления по модулю (%),
//        возвращающую остаток от делени

