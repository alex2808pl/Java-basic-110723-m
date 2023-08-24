package de.telran.lesson4.practice;

public class TaskCast {
    public static void main(String[] args) {
        int myInt = 127;
        long myLong = myInt;
        byte myByte = (byte) myInt;
        System.out.println("myInt = "+myInt);
        System.out.println("myLong = "+myLong);
        System.out.println("myByte = "+myByte);

        double myDouble = 12.57;
        int myInt2 = (int) myDouble;
        double myDouble2 = myInt2;
        System.out.println("myDouble = "+myDouble);
        System.out.println("myInt2 = "+myInt2);
        System.out.println("myDouble2 = "+myDouble2);

    }
}
