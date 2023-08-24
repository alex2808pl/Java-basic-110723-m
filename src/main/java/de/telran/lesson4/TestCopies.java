package de.telran.lesson4;

public class TestCopies {
    public static void main(String[] args) {
        int myInt = 5;
        int myInt2 = myInt;
        System.out.println("myInt = "+myInt);
        System.out.println("myInt2 = "+myInt2);

        myInt = 10;
        myInt2 = 7;
        System.out.println("myInt = "+myInt);
        System.out.println("myInt2 = "+myInt2);

        //Ccылочный тип
        System.out.println("Ccылочный тип");
        Integer objInt = 5;
        Integer objInt2 = objInt;
        System.out.println("objInt = "+objInt);
        System.out.println("objInt2 = "+objInt2);

        objInt = 10;
        System.out.println("objInt = "+objInt);
        System.out.println("objInt2 = "+objInt2);

        String objStr = new String("My Str1");
        String objStr2 = objStr;
        System.out.println("objStr = "+objStr);
        System.out.println("objStr2 = "+objStr2);

        objStr = new String("Другая строка");
        System.out.println("objStr = "+objStr);
        System.out.println("objStr2 = "+objStr2);

        Human human1 = new Human();
        human1.weight=100;
        Human human2 = human1;
        System.out.println("human1 = "+human1.weight);
        System.out.println("human2 = "+human2.weight);

        human1.weight = 70;
        System.out.println("human1 = "+human1.weight);
        System.out.println("human2 = "+human2.weight);

        human2.weight = 120;
        System.out.println("human1 = "+human1.weight);
        System.out.println("human2 = "+human2.weight);

    }
}
