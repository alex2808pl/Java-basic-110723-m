package de.telran.lesson14.practice;

import java.util.Scanner;

public class TaskLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество этажей в здании H = ");
        int h = scanner.nextInt();
        System.out.print("Введите количество этажей на подъем N = ");
        int n = scanner.nextInt();
        System.out.print("Введите количество этажей на спуск M = ");
        int m = scanner.nextInt();

        System.out.println("Нам нужно нажать кнопку (While) -> "+ upWhile(h,n,m));
        System.out.println("Нам нужно нажать кнопку (For) -> "+ upFor(h,n,m));

     }

    static int numberOfLifts(int floor, int stepUp, int stepDown) {
        return  floor + stepUp - stepDown;
    }

    static int upWhile(int hight, int stepUp, int stepDown) {
        int countPressButton = 0, currentFloor = 1;

        while (currentFloor < hight) {
            currentFloor = numberOfLifts(currentFloor, stepUp, stepDown);
            countPressButton++ ;
        }
        return countPressButton;
    }

    static int upFor(int hight, int stepUp, int stepDown) {
        int countPressButton = 0;

        for(int currentFloor = 1; currentFloor < hight; countPressButton++) {
            currentFloor = numberOfLifts(currentFloor, stepUp, stepDown);
        }
        return countPressButton;
    }

}


//Лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж.
//        Лифт сломан.
//        Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подъеме лифт превысил количество этажей, то считается что лифт поднялся на самый верх.
//        Найдите количество подъемов, которые понадобятся лифту.
//        Ввод:
//        H = 200, N = 50, M = 1
//        Ответ: 5
//        Объяснение:
//        Первый подъем: 50 - 1 = 49
//        Второй подъем: 49 + 50 - 1 = 98
//        Третий подъем: 98 + 50 - 1 = 147
//        Четвертый подъем: 147 + 50 - 1 = 196
//        Пятый подъем: выйти за пределы H.
//
//        Реализовать метод numberOfLifts(int floor, int stepUp, int stepDown)
