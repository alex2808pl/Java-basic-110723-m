package de.telran.lesson18;

import java.util.Arrays;

public class TestBubbleSort {
    public static void main(String[] args) {
        int[] arrMain = {5, 1, -8, 33, 26, -2};
        System.out.println(Arrays.toString(arrMain));
        sortBubble(arrMain);
        System.out.println(Arrays.toString(arrMain));
    }

    static void sortBubble(int[] arr) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
