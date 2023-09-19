package de.telran.lesson21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    @Test
    void testIsValidAccountNumberLength14(){
        String badAccountSizeMore14="123456789012345";
        String badAccountSizeLess14="1234567890123";
        Assertions.assertFalse(Bank.isValidAccountNumber(badAccountSizeMore14));
        Assertions.assertFalse(Bank.isValidAccountNumber(badAccountSizeLess14));
    }

    @Test
    void testIsValidAccountNumberAlleDigitalZero(){
        String badAccountZero="00000000000000";
        Assertions.assertFalse(Bank.isValidAccountNumber(badAccountZero));
    }

    @Test
    void testIsValidAccountNumberNullOrEmpty(){
        String badAccountNull=null;
        String badAccountEmpty="";
        Assertions.assertFalse(Bank.isValidAccountNumber(badAccountNull));
        Assertions.assertFalse(Bank.isValidAccountNumber(badAccountEmpty));
    }

    @Test
    void testIsValidAccountNumberOk(){
        String accountOk="12345678901234";
        Assertions.assertTrue(Bank.isValidAccountNumber(accountOk));
    }

}

//    Проверка номера банковского счета
//    Создайте метод isValidAccountNumber(String accountNumber),который возвращает true в случае успешной проверки.
//        БС может содержать только 14 цифр
//        Все 14 цифр не могут быть нулями
//        Номер счета не может быть null или пустым.
//        Проверьте с помощью метода main()
//        Напишите тесты используя библиотеку JUnit