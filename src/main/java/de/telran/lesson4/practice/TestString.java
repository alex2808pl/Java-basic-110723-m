package de.telran.lesson4.practice;

public class TestString {
    public static void main(String[] args) {
        String testStr = "I study Java";
        System.out.println(testStr);
        System.out.println("Длина строки = "+testStr.length());

        String sybStr = testStr.substring(8);
        System.out.println(sybStr);

        System.out.println(testStr.substring(testStr.length()-4));
    }
}
