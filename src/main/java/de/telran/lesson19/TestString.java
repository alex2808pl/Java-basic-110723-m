package de.telran.lesson19;

public class TestString {
    public static void main(String[] args) {
        String str1 = "Наша строка";
        String str2 = "Наша строка";
        String str3 = "Не наша строка";
        String str4 = new String("Наша строка");

        boolean b1 = (str1 == str2);
        System.out.println("str1 == str2 -> "+b1);

        System.out.println("str1 == str3 -> "+(str1 == str3));

        boolean b2 = (str1 == str4);
        System.out.println("str1 == str4 -> "+b2);

        b1 = (str1.equals(str2));
        System.out.println("str1 equals str2 -> "+b1);

        b2 = (str1.equals(str4));
        System.out.println("str1 equals str4 -> "+b2);

        System.out.println("str1 equals str3 -> "+(str1.equals(str3)));
    }
}
