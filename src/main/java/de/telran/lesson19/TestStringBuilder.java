package de.telran.lesson19;

public class TestStringBuilder {
    public static void main(String[] args) {
        String str1 = "Моя строка"+"!"+" Она такая хорошая "+"!";
        System.out.println(str1);

        StringBuilder sb1 = new StringBuilder("Моя строка");   //16 + 50%
        sb1.append("!");
        sb1.append(" Она такая хорошая ").append("!");
        System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        sb1.append("1111111111111111111111111");
        System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        StringBuffer sBuf = new StringBuffer(50);
        sBuf.append("Наща строка в String Buffer");
        sBuf.append(" - Наша строка в String Buffer");
        sBuf.insert(4, ",");
        System.out.println(sBuf);
        System.out.println(sBuf.length());
        System.out.println(sBuf.capacity());

    }
}
