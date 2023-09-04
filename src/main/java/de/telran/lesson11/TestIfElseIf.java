package de.telran.lesson11;

public class TestIfElseIf {
    public static void main(String[] args) {
        int myInt = 30;
        System.out.println("Основной поток выполнения программы");
        if(myInt==10) System.out.println("MyInt == 10");
        else if(myInt==15) System.out.println("MyInt == 15");
        else if (myInt==20) System.out.println("MyInt == 20");
        else System.out.println("MyInt другое число!");
        System.out.println("Основной поток выполнения программы");
    }
}
