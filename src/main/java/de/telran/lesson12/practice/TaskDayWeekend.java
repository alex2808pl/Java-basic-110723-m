package de.telran.lesson12.practice;

import java.util.Scanner;

public class TaskDayWeekend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер дня недели -> ");
        byte day = scanner.nextByte();
        System.out.println("Этот день недели (IF) -> "+isWeekendIf(day));
        System.out.println("Этот день недели (CASE) -> "+isWeekendCase(day));
        System.out.println("Этот день недели (Ternary) -> "+isWeekendTernary(day));
    }

    static String isWeekendIf(byte day) {
        String result;
        if(day>=1 && day<=5) result = "Work day";
        else if(day>=6 && day<=7) result = "Weekend"; // day==6 || day==7
        else result = "No name";
        return result;
    }

    static String isWeekendCase(byte day) {
        String result;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                result = "Work day";
                break;
            case 6:
            case 7:
                result = "Weekend";
                break;
            default:
                result = "No name";
        }
        return result;
    }

    static String isWeekendTernary(byte day) {
        String result;
        result = (day>=1 && day<=5) ? "Work day" : ((day>=6 && day<=7) ? "Weekend" : "No name") ;
        return result;
    }
}

//Создайте switch-блок, который мог бы определить, является ли переданный день выходным или рабочим днем.
//        Создайте переменные int day; String dayString;
//        Используйте объединение для несколько случаев без операторов break
//        Реализуйте тот же процесс используя if-else блоки
//        Реализуйте тот же процесс используя тернарное выражение
//        Сравните решения
