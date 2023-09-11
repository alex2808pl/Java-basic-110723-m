package de.telran.lesson16.access.other;

public class OtherPackage {
    private int privateInt = 100;
    public int publicInt = 200;
    protected int protectedInt = 300;

    int defaultInt = 400;

    void print() {
        System.out.println("OtherPackage :: privateInt = "+privateInt);
        System.out.println("OtherPackage :: publicInt = "+publicInt);
        System.out.println("OtherPackage :: protectedInt = "+protectedInt);
        System.out.println("OtherPackage :: defaultInt = "+defaultInt);
    }

}
