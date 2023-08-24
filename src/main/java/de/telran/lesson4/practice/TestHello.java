package de.telran.lesson4.practice;

import java.util.Scanner;

public class TestHello {
    public static void main(String[] args) {
        System.out.print("Как Вас зовут: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Добрый день, "+name+"!");

        char beginChar = name.charAt(0);
        char endChar = name.charAt(name.length()-1);
        System.out.println("Ваше имя начинается с символа "+beginChar+" и заканчивается на символ "+endChar);

        System.out.print("Сколько тебе лет: ");
        int age = scanner.nextInt();
        System.out.println("О, тебе уже "+age+" лет?!");

    }
}
