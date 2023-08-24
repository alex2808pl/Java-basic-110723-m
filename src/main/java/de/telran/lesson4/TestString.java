package de.telran.lesson4;

public class TestString {
    public static void main(String[] args) {
        String myStr = "Моя строка";
        System.out.println(myStr);
        myStr = myStr+" уже побольше";
        System.out.println(myStr);

        System.out.println(myStr.length());
        System.out.println(myStr.charAt(2));
        System.out.println(myStr.substring(4));
        System.out.println(myStr.substring(4,10));

        System.out.println(myStr.contains("уже"));
        System.out.println(myStr.contains("слон"));

        //Замена символа
        myStr = myStr.replace('о','а');
        System.out.println(myStr);

        System.out.println(myStr.toUpperCase());
        System.out.println(myStr.toLowerCase());
    }
}
