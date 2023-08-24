package de.telran.lesson4;

public class CastTypes {
    public static void main(String[] args) {
        int myInt = 56;
        long myLong = myInt;
        System.out.println("myInt = "+myInt);
        System.out.println("myLong = "+myLong);

        int copyInt = (int) myLong;
        System.out.println("copyInt = "+copyInt);

        int myInt2 = -201;
        byte myByte = (byte) myInt2; //ошибочное действие
        System.out.println("myByte = "+myByte);

    }
}
