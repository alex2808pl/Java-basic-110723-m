package de.telran.lesson16.access;

public class SamePackage {
    private int privateInt = 10;
    public int publicInt = 20;
    protected int protectedInt = 30;

    int defaultInt = 40;

    void print() {
        System.out.println("SamePackage :: privateInt = "+privateInt);
        System.out.println("SamePackage :: publicInt = "+publicInt);
        System.out.println("SamePackage :: protectedInt = "+protectedInt);
        System.out.println("SamePackage :: defaultInt = "+defaultInt);
    }

}
