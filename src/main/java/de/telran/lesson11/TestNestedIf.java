package de.telran.lesson11;

public class TestNestedIf {
    public static void main(String[] args) {
        int myInt = 18;
        System.out.println("Основной поток программы");
        if(myInt > 0) {
            System.out.println("myInt больше 0");
            if(myInt < 15) {
                System.out.println("myInt меньше 15");
            }
        }
        System.out.println("Основной поток программы");

        //Входит ли значение переменной в интервал
        if(myInt>0 && myInt<15) System.out.println("myInt больше 0 и меньше 15");
    }
}
