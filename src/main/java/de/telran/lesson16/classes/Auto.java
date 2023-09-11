package de.telran.lesson16.classes;


class Auto {
    int mileAge; //пробег
    int width;
    int length;
    int high;
    String brand;

    Auto() {
    }

    Auto(String brand1) {
        brand = brand1;
    }

    Auto(int width, int length, int high, String brand) {
        this.width = width;
        this.length = length;
        this.high = high;
        this.brand = brand;
    }

    void run() {
        int speed = 20;
        System.out.println("Авто едет "+ speed+ "км/ч, пробег автомобиля - "+mileAge);
        System.out.println("Марка авто - "+brand + " ширина - "+width);
    }

    void stop() {
        System.out.println("Авто остановился");
    }
}
