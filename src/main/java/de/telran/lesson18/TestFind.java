package de.telran.lesson18;

import java.util.Arrays;

public class TestFind {
    public static void main(String[] args) {
        int arrMain[] = {1,6,3,10,-2, 10, 18,2,10};
        int indSearch1 = searchLine(arrMain, 10);
        System.out.println("searchLine -> "+indSearch1);

        int indSearch2 = searchLineAnother(arrMain, 10);
        System.out.println("searchLineAnother -> "+indSearch2);

        int[] indSearches = searchLineAll(arrMain, 10, 8);
        System.out.println("searchLineAll -> "+Arrays.toString(indSearches));

    }

    static int searchLine(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) return i;
        }
        return -1;
    }

    static int searchLineAnother(int[] arr, int key) {
        int resultIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                resultIndex = i;
//                break;
            }
        }
        return resultIndex;
    }

    static int[] searchLineAll(int[] arr, int key, int count) {
        int[] arrResult = new int[count];
        int indResult = 0;
        Arrays.fill(arrResult, -1);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                arrResult[indResult] = i;
                indResult++;
            }
        }
        return arrResult;
    }



}
