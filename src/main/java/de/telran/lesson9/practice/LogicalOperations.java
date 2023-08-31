package de.telran.lesson9.practice;

public class LogicalOperations {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = -1;
        int d = 2;

        System.out.println((a < b) && (b == c)); //ложь
        System.out.println((a < b) && (b == d)); //ложь
        System.out.println((a >= b) && (b == d)); //истина
        System.out.println((a >= b) && (b == d) && (c < d)); //истина
        System.out.println((a >= b) && (b == d) && (c > d)); //ложь

        System.out.println();
        System.out.println((a < b) || (b == c)); //ложь
        System.out.println((a < b) || (b == d)); //истина
        System.out.println((a >= b) || (b == d)); //истина
        System.out.println((a >= b) || (b == d) || (c < d)); //истина
        System.out.println((a >= b) || (b == d) || (c > d)); //истина

        System.out.println();
        System.out.println(!((a >= b) || (b == d) || (c > d))); //истина -> ложь
        System.out.println(!((a < b) && (b == d))); //ложь -> истина
        System.out.println(!(a < b)); //ложь -> истина

        System.out.println();
        System.out.println((a >= b) && (b == d) || (c > d)); //истина
        System.out.println(!(a >= b) && (b == d) || (c > d)); //ложь

        //Вычисление суммы
        if((a >= b) && (b == d) && (c < d)) {
            int sum = a + b + c +d;
            System.out.println("Сумма чисел = "+sum);
        }
        else {
            System.out.println("Условие ложно");
        }
    }

}

//    Создайте переменные int a, b, c, d;
//    Используя блок if (выражение) {}, составьте логические выражения
//        истина , если “а” меньше “b” И “b” равно “c”;
//        истина , если “а” больше “b” ИЛИ “c” равно “d”;
//        истина , если “а” НЕ равно “b”;
// посчитайте сумму, если условие истинно
