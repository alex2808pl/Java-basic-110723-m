package de.telran.lesson19.practice;

public class TaskReverse {
    public static void main(String[] args) {
        String str1 = "Мама мыла";
        String str2 = " раму";
        System.out.println(concatReversStr(str1, str2));
        System.out.println(concatReversStrSb(str1, str2));

        // 2-е задание
        char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
        String str = new String(arr);
        System.out.println(str);
        String strResult = str.replace('?', 'e');
        System.out.println(strResult);

        StringBuilder sb = new StringBuilder();
        sb.append(arr);
        System.out.println(sb);
        int ind = sb.indexOf("?");
        sb.replace(ind,ind+1,"e");
        System.out.println(sb);
    }

    static String concatReversStr(String str1, String str2) {
        String tmp = str1 + str2;
        String result = "";
        for(int i = tmp.length()-1; i >= 0; i--)
            result += tmp.charAt(i);

        return result;
    }

    static String concatReversStrSb(String str1, String str2) {
        StringBuilder sb1 = new StringBuilder(str1);
        sb1.append(str2);
        sb1.reverse();
        return sb1.toString();
    }
}

//    Напишите метод, который принимает две строки в аргументах, соединяет их и определяет реверсивный порядок,
//    выведите результат на консоль.
//        concatReversStr(String str1, String str2)
//
//        Дан массив символов, объедините его и замените символ '?' на правильный символ, выведите результат на консоль.
//        char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
