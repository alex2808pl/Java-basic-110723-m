package de.telran.lesson13;

import java.util.Scanner;

public class testForBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число = ");
        int count = scanner.nextInt();
        System.out.println("Сумма (простой For) = "+sum(count));
        System.out.println("Сумма (вечный For) = "+sumWithBreak(count));
        System.out.println("Сумма (тоже вечный For) = "+sumWithBreak2(count));

    }
    static int sum(int count) {
        int sum = 0;
        for(int i=0; i<=count; i++) sum+=i;
        return sum;
    }

    //c вечным циклом
    static int sumWithBreak(int count) {
        int sum = 0;
        int i = 0;
        for (;;) {    // for(int i = 0; ; i++)
            sum += i;
            i++;
            if(i > count) break; // !(i<=count)
        }
        return sum;
    }

    static int sumWithBreak2(int count) {
        int sum = 0;
        //тоже вечный цикл
        for(int i = 0; ; i++) {   //for(int i = 0; i >= 0 ; i++)
            if(i > count) break; //
            sum += i;
            System.out.println(i);
        }
        return sum;
    }
}
