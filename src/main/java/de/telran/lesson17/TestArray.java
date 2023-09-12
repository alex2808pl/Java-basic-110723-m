package de.telran.lesson17;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        //массив чисел
        int[] arr = new int[5];
        printArr(arr);

        arr[0] = 10;
        arr[4] = -5;
        arr[arr.length-1] = 3;
        printArr(arr);

        int[] arrL = {1,2,3,4};
        printArr(arrL);

        // массив строк
        String[] arrStr = new String[5];
        printArrString(arrStr);

        String[] arrStrL = {"мама","мыла", "раму"};
        printArrString(arrStrL);
        System.out.println(arrStrL.length);

        //массив объектов
        Pen[] pens = new Pen[3];
        printArrPen(pens);

        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.lenght = 10;
//        System.out.println(pen1);
        pens[1] = pen1;
        pens[2] = new Pen("красный",5);
        printArrPen(pens);

        Pen[] pensL = { new Pen("черная", 3),
                        new Pen("зеленая",8)
                      };
        printArrPen(pensL);

    }

    static void printArr(int[] arr)  {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    static void printArrString(String[] arr)  {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    static void printArrPen(Pen[] arr)  {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
