package de.telran.lesson21;

public class Utils {

    static int[] getArrayNumbers(int count) {
        int[] arr = new int[count];
        for(int i=0; i<count; i++) {
            arr[i] = i+1;
        }
        return arr;
    }

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
}
