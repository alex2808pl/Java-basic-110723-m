package de.telran.lesson9.practice;

public class UnaryTest {
    public static void main(String[] args) {
        int myInt = 1;
        myInt++;
        myInt--;
        System.out.println("myInt = "+myInt);

        ++myInt;
        --myInt;
        System.out.println("myInt = "+myInt);

        System.out.println("myInt++ "+ myInt++);
        System.out.println("myInt-- "+ myInt--);
        System.out.println("myInt = "+myInt);

        System.out.println("++myInt "+ (++myInt));
        System.out.println("--myInt "+ (--myInt));
        System.out.println("myInt = "+myInt);

    }
}

//    Создайте класс UnaryTest
//    Создайте переменную с положительным знаком
//    Примените к переменной пост-инкремент и пост-декремент
//    Примените к переменной пре-инкремент и пре-декремент
//    Используя режим дебаггера проследите изменения
