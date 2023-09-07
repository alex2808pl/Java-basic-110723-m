package de.telran.lesson14.practice;

import java.util.Scanner;

public class TaskGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choise;

        do {
            System.out.println("Сделайте выбор игрока:");
            System.out.println("1. Elf");
            System.out.println("2. Orc");
            System.out.println("Q. Exit");

            choise = scanner.next().charAt(0);
        } while (choise != '1' && choise != '2' && choise != 'Q' && choise != 'q');

        System.out.println("Вы сделали выбор : " + choise);
    }

}

//    Вы реализуете игру, в которой вы показываете пользователю некоторые параметры,
//        нажмите 1, чтобы сделать это...,
//        нажмите 2, чтобы сделать это... и т. д.,
//        и нажмите "Q", чтобы выйти из игры.
//
//        Реализуйте меню выбора игрока (Elf or Orc and Exit)
//        Отобразите меню
//        1. Elf
//        2. Orc
//        Q. Exit
//        Проверьте ввод на соответствие, в случае неверного ввода распечатайте "Choose any one : "
//        и покажите меню выбора

//        Сохраните выбор
//        Распечатайте выбор в консоль
