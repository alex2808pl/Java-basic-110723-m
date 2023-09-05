package de.telran.lesson12;

public class TestTernary {
    public static void main(String[] args) {
        int myInt = 15;

        int result;

        if(myInt > 0 && myInt < 10) result = myInt + myInt;
        else result = myInt * myInt;

        System.out.println(" result IF = "+result);

        //тернарный оператор
        result = (myInt > 0 && myInt < 10) ? myInt + myInt : myInt * myInt;

        System.out.println(" result тернарной операции = "+result);


    }
}
