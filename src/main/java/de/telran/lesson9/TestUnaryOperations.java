package de.telran.lesson9;

public class TestUnaryOperations {
    public static void main(String[] args) {
        int myInt = 0;
        myInt++; //myInt = myInt + 1;
        System.out.println(myInt);
        myInt++;
        System.out.println(myInt);
        myInt--; //myInt = myInt - 1;
        System.out.println(myInt);

        System.out.println(++myInt); // префикс
        System.out.println(myInt++); // постфикс
        System.out.println(myInt);

        System.out.println(--myInt); // префикс
        System.out.println(myInt--); // постфикс
        System.out.println(myInt);

        printValue(++myInt); //=1
        printValue(myInt++); //=2
        System.out.println(myInt);

        //Операции присваивания =
        myInt += 2; // myInt = myInt + 2;
        myInt -= 3; // myInt = myInt - 3;
        myInt *= 5; // myInt = myInt * 5;
        myInt /= 5; // myInt = myInt / 5;
        myInt %= 2; // myInt = myInt % 2;
        myInt++; //myInt += 1
    }

    static void printValue(int val) {
        System.out.println(val);
    }
}
