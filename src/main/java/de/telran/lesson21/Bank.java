package de.telran.lesson21;

public class Bank {
    static boolean isValidAccountNumber(String accountNumber) {
        if(accountNumber == null || accountNumber.length()==0)
            return false;

        if(accountNumber.length() != 14) return false;

        boolean isAllZero = true;
        for (int i=0; i<accountNumber.length(); i++) {
            if(accountNumber.charAt(i)!='0') {
                isAllZero = false;
            }
        }
        if(isAllZero) return false;

        return true;
    }
}

//    Проверка номера банковского счета
//    Создайте метод isValidAccountNumber(String accountNumber),который возвращает true в случае успешной проверки.
//        БС может содержать только 14 цифр
//        Все 14 цифр не могут быть нулями
//        Номер счета не может быть null или пустым.
//        Проверьте с помощью метода main()
//        Напишите тесты используя библиотеку JUnit