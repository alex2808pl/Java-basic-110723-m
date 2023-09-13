package de.telran.lesson18.practice;

public class Utils {
    static void sortBubblePrice(Car[] arr) {
        boolean sorted = false;
        Car temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].getPrice() > arr[i + 1].getPrice()) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    static void sortBubbleModel(Car[] arr) {
        boolean sorted = false;
        Car temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].getModel().charAt(0) > arr[i + 1].getModel().charAt(0)) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

}
