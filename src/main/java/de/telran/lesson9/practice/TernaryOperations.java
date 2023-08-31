package de.telran.lesson9.practice;

public class TernaryOperations {
    public static void main(String[] args) {
        int val1 = 5;
        int val2 = 2;
        int val3 = -1;
        int val4 = 2;

        System.out.println("val1 > val2  "+ (val1 > val2));
        System.out.println("val1 <= val3  "+ (val1 <= val3));
        System.out.println("val2 != val3  "+ (val2 != val3));

        System.out.println("val2 != val2  "+ (val2 != val2)); //2 != 2
        System.out.println("val2 == val2  "+ (val2 == val2)); // 2 == 2

        System.out.println("val2 != val4  "+ (val2 != val4)); // 2 != 2
        System.out.println("val2 == val4 "+ (val2 == val4));  // 2 == 2
    }
}
//    Создайте три переменные
//        Сравните поочередно каждые из созданных переменных используя реляционные операторы
//        Результат распечатайте в консоль
