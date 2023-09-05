package de.telran.lesson12;

public class TestCase {
    public static void main(String[] args) {
        int myInt = 30;

        System.out.println("Основной поток выполнения программы");
        switch (myInt) {
            case 10: //"Слон", 2.3
                System.out.println("MyInt == 10");
                break;
            case 15:
                System.out.println("MyInt == 15");
                break;
            case 20:
                System.out.println("MyInt == 20");
                break;
            case 25:
                System.out.println("MyInt == 25");
                break;
            case 30:
                System.out.println("MyInt == 30");
                break;
            case 35:
                System.out.println("MyInt == 35");
                break;
            case 40:
                System.out.println("MyInt == 40");
                break;
            default:
                System.out.println("MyInt другое число!");
        }
        System.out.println("Основной поток выполнения программы");
    }
}
