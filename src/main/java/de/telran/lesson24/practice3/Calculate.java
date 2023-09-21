package de.telran.lesson24.practice3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Calculate {

    private static String[] resultHistory = new String[3];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            String expression = inputExpression();
            System.out.println(expression);
            double[] arguments = parseArguments(expression);
            char[] signs = parseSigns(expression);

            double result = arguments[0];
            for (int i = 1; i < arguments.length; i++) {
                double argument = arguments[i];
                result = calculate(result, signs[i - 1], argument);
            }
            printResult(expression, result);
            addResultToHistory(expression, result);
            printHistory();
            askUserForNextCalculation();
        }
        while (true);
    }

    static String inputExpression() {
        scanner.useLocale(Locale.ENGLISH);
        System.out.println("Введите математическое выражение. Например, 10.5*5+1-7.1 :");
        String input = scanner.next();
        return input;
    }

    static double[] parseArguments(String expression) {
        int argumentsNumber = countArgumentsNumber(expression);
        double arguments[] = new double[argumentsNumber];
        StringBuilder argumentAsString = new StringBuilder();
        int currentArgumentNumber = 0;
        for(int i=0; i<expression.length(); i++) {
            char symbol = expression.charAt(i);
            if(!isSign(symbol)) argumentAsString.append(symbol);

            if(isSign(symbol) || i==expression.length()-1) {
                double argument = Double.parseDouble(argumentAsString.toString());
                arguments[currentArgumentNumber] = argument;
                currentArgumentNumber++;
                argumentAsString.delete(0, argumentAsString.length());
            }
        }
        return arguments;
    }

    static int countArgumentsNumber(String expression) {
        int countArguments = 1;
        for (int i=0; i< expression.length(); i++) {
            char symbol = expression.charAt(i);
            if(isSign(symbol)) {
                    countArguments ++;
            }
        }
        return countArguments;
    }

    static boolean isSign(char symbol) {
        return  symbol == '+' || symbol == '-' || symbol == '*'
                || symbol ==  '/' || symbol =='%';
    }

    static char[] parseSigns(String expression) {
        int argumentsNumber = countArgumentsNumber(expression);
        char[] signs = new char[argumentsNumber-1];

        int currentSignNumber = 0;
        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);
            if(isSign(symbol)) {
                signs[currentSignNumber] = symbol;
                currentSignNumber++;
            }
        }
        return signs;
    }

    static double calculate(double argumentOne, char sign, double argumentTwo) {
        double result;
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
                break;
            default:
                result = 0;
        }
        return result;
    }

    static void printResult(String expression, double result) {
        System.out.println(String.format("%s = %.2f", expression, result));
    }

    static void addResultToHistory(String expression, double result) {
        // сдвигаем содержимое массива вправо
        for (int i = resultHistory.length - 1; i > 0; i--)
            resultHistory[i] = resultHistory[i-1];

        resultHistory[0] = String.format("%s = %.2f", expression, result);
    }

    static void printHistory() {
        System.out.println("История выполненных вычислений:");
        System.out.println(Arrays.toString(resultHistory));
    }

    private static void askUserForNextCalculation() {
        System.out.println("Выполнить еще одно вычисление? (Y/N):");
        String needNextCalculation = scanner.next(); // Получение введенного значения - требуется ли калькулятору выполнить еще одно вычисление
        if (!"Y".equalsIgnoreCase(needNextCalculation)) System.exit(0); // Завершение работы программы
    }
}

//    Доработайте программу "Калькулятор" (версии 2) таким образом, чтобы она позволяла пользователю вводить вычисляемое математическое выражение в виде одной строки. Например, так 10.5*5+1-7.1 и последовательно выполняла бы указанные арифметические операции над аргументами.
//        выполнить рефакторинг программного кода "Калькулятора" таким образом, чтобы каждый логический шаг алгоритма был бы реализован в отдельном методе.
//        создать отдельные методы для выполнения следующих шагов:
//        1) String inputExpression() - для ввода строки (вычисляемого математического выражения) с клавиатуры
//        2) double[] parseArguments(String expression) - для получения из строки математического выражения значений аргументов
//        3) char[] parseSigns(String expression) - для получения из строки математического выражения знаков математических операций
//        4) double calculate(double argumentOne, char sign, double argumentTwo) - для выполнения математической операции над парой аргументов
//        5) void printResult(String expression, double result) - для вывода результата вычисления на экран
//        Убедитесь, что приложение работает корректно.

//    Введите математическое выражение. Например, 10.5*5+1-7.1 :
//        2*2
//        2*2=4,00
//        История выполненных вычислений:
//        [2*2=4,00, null, null, null, null]
//        Выполнить еще одно вычисление? (Y/N):
