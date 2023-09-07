package de.telran.lesson14;

public class testWhile {
    public static void main(String[] args) {
        for (int i=0; i<10; i++)
            System.out.println("Привет 1-й программист");

        int j = 0;
        while (j < 10) {
            ++j;
            System.out.println("Привет 2-й программист");
//            j++;
        }

        int sum=0, proizv=1, i=0, k=0;
        while (i <= 10 && k <= 10) {
            k++;
            sum += i;
            proizv *= k;
            System.out.println(k+" proizv = "+proizv);
            System.out.println(i+" sum = "+sum);
            i+=2;
        }
        System.out.println("Sum = "+sum);
        System.out.println("Proizv = "+proizv);

    }
}
