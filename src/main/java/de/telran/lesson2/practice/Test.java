package de.telran.lesson2.practice;

public class Test {
    public static void main(String[] args) {
        // Целочисленные типы данных
        byte myByte = 120;
        short myShort = 125;
        int myInt  = - 756;
        long myLong = 25000234;

        // Дробные числа
        float myFloat = 2.7F;
        double myDouble = 145.8;

        char myChar = 'd';
        String myString = "Hello, Java!";

        boolean myBoolean = true;

        System.out.println("myByte = "+myByte);
        System.out.println("myShort = "+myShort);
        System.out.println("myInt = "+myInt);
        System.out.println("myByte = "+myByte);
        System.out.println("myLong = "+myLong);

        System.out.println("myFloat = "+myFloat);
        System.out.println("myDouble = "+myDouble);

        System.out.println("myChar = "+myChar);
        System.out.println("myString = "+myString);
        System.out.println("myBoolean = "+myBoolean);

        //Классы обвертки
        Integer objInt = 5;
        Byte objByte = 12;
        System.out.println("Integer:"+objInt);

    }
}
