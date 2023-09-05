package de.telran.lesson12;

public class TestIfElseIf {
    public static void main(String[] args) {
        int myInt = 30;
        System.out.println("Основной поток выполнения программы");
        if(myInt==10) System.out.println("MyInt == 10");
        else if(myInt==15) System.out.println("MyInt == 15");
        else if (myInt==20) System.out.println("MyInt == 20");
        else if(myInt==25) System.out.println("MyInt == 25");
        else if (myInt==30) System.out.println("MyInt == 30");
        else if(myInt==35) System.out.println("MyInt == 35");
        else if (myInt==40) System.out.println("MyInt == 40");
        else System.out.println("MyInt другое число!");
        System.out.println("Основной поток выполнения программы");
    }
}
