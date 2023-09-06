package de.telran.lesson13;

public class testFor {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 0; i <= 10; i++) { // 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 =
            sum += i; // sum = sum + i;
            System.out.println("i = "+i+", sum = "+sum);
        }
        System.out.println("Общая Cумма = "+sum);
        System.out.println();

        sum = 0;
        int proizv = 1;  // 0*1*2... == 0
        for (int i = 0, y = 1; i <= 10 && y <= 10; i+=2, y++) { //i <= 10 || y <= 10
            sum += i;
            proizv *= y; // proizv = proizv * y;
            System.out.println("i = "+ i +", sum = " + sum); //  i = 1, sum = 12
            System.out.println("y = "+ y +", proizv = "+proizv);
         }
        System.out.println("Общая сумма = "+sum+", общее произведение = "+proizv);

        // этот пример правильный, но так делать не стоит
        for (int i = 0, y = 1, sum1 = 0, proizv1 = 1; i <= 10 && y <= 10; i+=2, y++) { //i <= 10 || y <= 10
            sum1 += i;
            proizv1 *= y;
            System.out.println("i = "+ i +", sum = " + sum1); //  i = 1, sum = 12
            System.out.println("y = "+ y +", proizv = "+proizv1);
        }
//        System.out.println("Общая сумма = "+sum1+", общее произведение = "+proizv1);
    }
}
