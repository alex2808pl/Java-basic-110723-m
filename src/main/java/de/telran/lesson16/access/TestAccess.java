package de.telran.lesson16.access;

import de.telran.lesson16.access.other.OtherPackage;

public class TestAccess {
    public static void main(String[] args) {
        SamePackage sp1 = new SamePackage();
        System.out.println("TestAccess :: SamePackage -> " + sp1.defaultInt);
        System.out.println("TestAccess :: SamePackage -> " + sp1.protectedInt);
        System.out.println("TestAccess :: SamePackage -> " + sp1.publicInt);
        // Нет доступа
//        System.out.println("TestAccess :: SamePackage -> " + sp1.privateInt);

        OtherPackage op1 = new OtherPackage();
        System.out.println("TestAccess :: OtherPackage -> " + op1.publicInt);
        // Нет доступа
        // op1.defaultInt
        // op1.protectedInt
        // op1.privateInt
    }
}
