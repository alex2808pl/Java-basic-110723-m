package de.telran.lesson21;

import java.util.Arrays;

public class TestUnit {
    public static void main(String[] args) {
        int[] arrMain = Utils.getArrayNumbers(5);
        System.out.println(Arrays.toString(arrMain));
    }

//    static int[] getArrayNumbers(int count) {
//        int[] arr = new int[count];
//        for(int i=0; i<count; i++) {
//            arr[i] = i;
//        }
//        return arr;
//    }
}

