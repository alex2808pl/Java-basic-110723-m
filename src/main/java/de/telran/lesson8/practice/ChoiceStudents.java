package de.telran.lesson8.practice;

import java.util.Scanner;

public class ChoiceStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество студентов: ");
        int count = scanner.nextInt();
        System.out.println("Выбран студент номер = "+ randomIntervalMath(2, count));
    }
    static int randomIntervalMath(int min, int max) {
        return min + (int)(Math.random()*(max - min));
    }
}
