package de.telran.lesson2;

public class Task1 {
    public static void main(String[] args) {
        int myInt;
        myInt = 5;

        int myInt2 = 10;

        int result = 5 + 10;

        System.out.println(result);
        System.out.println(5 - 10); //литералы
        System.out.println(myInt - myInt2);
        System.out.println(myInt * myInt2);
        System.out.println(myInt / myInt2);
        System.out.println(myInt % myInt2);
        System.out.println(myInt2 / myInt);

//        System.out.println(myInt2 / 0);

        System.out.println(2.5 / 0.0);


        String myStr;
        myStr = "Мама мыла раму" + myInt;
        String strInt = "5";
        System.out.println(strInt+5);

        System.out.println("5 + 10 = "+result);
        System.out.println(myInt + " + " + myInt2 + " = " + result);
    }

}
