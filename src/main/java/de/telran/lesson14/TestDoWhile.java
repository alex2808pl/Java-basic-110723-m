package de.telran.lesson14;

public class TestDoWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 0) {
            System.out.println("Я в теле While");
            i++;
        }
        System.out.println();

        i = 0;
        do {
            System.out.println("Я в теле DO");
            i++;
        } while (i < 0);
    }
}

//    Используйте цикл do-while
//        Инициализируйте переменную int i = 0;
//        Добавьте в тело инструкцию System.out.println("Я в теле DO");
//        Определите условие i < 3
//        Запустите код
//        Определите условие i < 0
//        Проанализируйте результат
