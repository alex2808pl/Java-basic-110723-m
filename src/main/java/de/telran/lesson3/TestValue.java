package de.telran.lesson3;

public class TestValue {
    static int varIntClass;
    static String varStringClass;
    static Integer varIntegerClass;
    static boolean varBoolClass = true;
    public static void main(String[] args) {
        int myInt = 5;
        System.out.println(myInt);

        double myDouble;
        myDouble = 2.1;
        System.out.println(myDouble);

        myMethod();

        System.out.println("varIntClass = "+varIntClass);
        System.out.println("varStringClass = "+varStringClass);
        System.out.println("varIntegerClass = "+varIntegerClass);
        System.out.println("varBoolClass = "+varBoolClass);

        // Объекты пользовательские
        System.out.println("Вася");
        Human myVasya = new Human();
        myVasya.weight = 50;
        myVasya.jump();
        myVasya.run();

        System.out.println("Соня");
        Human mySonya = new Human();
        mySonya.weight = 40;
        mySonya.jump();
        mySonya.run();


        System.out.println("Меняем static переменную");
        Human.countEyes = 3;

        System.out.println("Вася");
        myVasya.weight = 80;
        myVasya.jump();
        myVasya.run();

        System.out.println("Соня");
        mySonya.weight = 35;
        mySonya.jump();
        mySonya.run();

    }
    static void myMethod() {
        String myStr = "Моя переменная в методе myMethod()";
        System.out.println(myStr);
//        varIntClass = 8;
    }
}
