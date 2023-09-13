package de.telran.lesson18.practice;

import java.util.Arrays;

public class TaskCar {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(10_000, "VW"),
                new Car(15_000, "BMW"),
                new Car(6_000, "Mini"),
                new Car(18_000, "Audi"),
                new Car(8_000, "Reno")
        };

        System.out.println(Arrays.toString(cars));

        Utils.sortBubblePrice(cars);
        System.out.println(Arrays.toString(cars));

        Utils.sortBubbleModel(cars);
        System.out.println(Arrays.toString(cars));
    }
}

//Создайте 5 объектов типа Car
//        Объект Car должен содержать поля
//private double price;
//private String model;
//        и конструктор с этими полями
//        Сохраните объекты в массив
//        Распечатайте результат
//        Результат печати одного авто должен выглядеть:
//        Car - BMW, price = 2.3
//        Применив метод “сортировка пузырьком” отсортируйте массив по стоимости
//        Распечатайте результат
//        Применив метод “сортировка пузырьком” отсортируйте n по модели (первая буква из модели)
//        Распечатайте результат

