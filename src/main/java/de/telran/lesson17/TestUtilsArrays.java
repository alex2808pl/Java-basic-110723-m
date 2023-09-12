package de.telran.lesson17;

import java.util.Arrays;

public class TestUtilsArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(Arrays.toString(arr));

        // copyOf
        int[] arrCopy5 = Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(arrCopy5));

        int[] arrCopyFull = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arrCopyFull));

        int[] arrCopyFullPlus4 = Arrays.copyOf(arr, arr.length+4);
        arrCopyFullPlus4[arrCopyFullPlus4.length - 1] = -8;
        System.out.println(Arrays.toString(arrCopyFullPlus4));

        // copyOfRange
        int[] arrRange2_8 = Arrays.copyOfRange(arr,2, 8);
        System.out.println(Arrays.toString(arrRange2_8));

        int[] arrRangeFull = Arrays.copyOfRange(arr,0, arr.length);
        System.out.println(Arrays.toString(arrRangeFull));

        int[] arrRangePlus7 = Arrays.copyOfRange(arr,5, arr.length+7);
        arrRangePlus7[10] = -33;
        System.out.println(Arrays.toString(arrRangePlus7));

        // move
        int[] arrMove = move(arr, 2);
        System.out.println(Arrays.toString(arrMove));

        // sort
        Arrays.sort(arrRangePlus7);
        System.out.println(Arrays.toString(arrRangePlus7));

    }

    static  int[] move (int [] arr, int count) {
        int[] result = new int[arr.length+count];
        for (int i=0; i<arr.length; i++){
            result[i+count] = arr[i];
        }
        return result;
    }
}
