package de.telran.lesson11.practice;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сегодня выходной? isWeekend = ");
        boolean isWeekend = scanner.nextBoolean();
        System.out.print("Идет дождь? isRain = ");
        boolean isRain = scanner.nextBoolean();
        boolean canWalk = isCanWalk(isWeekend, isRain);
        if(canWalk) System.out.println("Мы можем идти гулять!");

        if(isCanWalkIfNested(isWeekend, isRain)) System.out.println("Мы можем идти гулять!");

        if(isCanWalkIfElse(isWeekend, isRain)) System.out.println("Мы можем идти гулять!");

    }

    static boolean isCanWalk(boolean isWeekend, boolean isRain) {
        boolean result = isWeekend == true && isRain == false; // isWeekend && isRain
        return result;
    }

    static boolean isCanWalkIfNested(boolean isWeekend, boolean isRain) {
        if(isWeekend) {   //isWeekend && !isRain
            if(!isRain) {
                return true;
            }
        }
        return false;
    }

    static boolean isCanWalkIfElse(boolean isWeekend, boolean isRain) {
        if(isWeekend && !isRain)  return true;
        else return false;
    }
}

//        Создайте две переменные *isWeekend* и *isRain*.
//        Создайте переменную *canWalk*, значение которой должно быть истинным,
//           если это выходной день (isWeekend = true) и не идет дождь (isRain = false).
//        Создайте метод, который принимает два параметра и возвращает значение true/false
//        Результат сохраните в canWalk
//        Распечатайте в консоль.

