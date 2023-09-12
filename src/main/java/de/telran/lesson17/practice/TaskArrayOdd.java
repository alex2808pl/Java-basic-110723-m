package de.telran.lesson17.practice;

import java.util.Arrays;

public class TaskArrayOdd {
    public static void main(String[] args) {
        byte[] arrOdd = new byte[50];
        byte i = 0;
        for (byte number = 1; number < 100; number++) {
            if(number % 2 != 0) {
                arrOdd[i] = number;
                i++;
            }
        }
        System.out.println(Arrays.toString(arrOdd));
        System.out.println(arrOdd.length);

        for (int j = arrOdd.length-1; j >= 0; j--) {
            System.out.print(arrOdd[j]+", ");
        }
    }
}

//    Создайте массив из всех нечётных чисел от 1 до 99.
//        Выведите его на экран в строку в обратном порядке
