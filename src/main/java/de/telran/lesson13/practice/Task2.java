package de.telran.lesson13.practice;

public class Task2 {
    public static void main(String[] args) {
        printHello();
        printEvenNumber(15);
    }

    static void printHello() {
        for (int i=0; i<5; i++) System.out.println("Hello my friend !");
    }

    static void printEvenNumber(int count) {
        for (int i=1; i<=count; i++) {
            if (i % 2 == 0) System.out.println("i = "+i+" из -> "+count);
        }
    }
}


//    Создайте метод, при вызове которого печатается 5 раз “Hello my friend !”
//
//        Создайте метод, который принимает число и выводит в консоль только четные вхождения в это число
//        Например:
//        Вход = 5, выход = 2, 4
