package de.telran.lesson22.practice3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static de.telran.lesson22.practice3.Constants.COUNT_SET_SIZE;
import static de.telran.lesson22.practice3.Constants.RANGE_NUMBER_LOTTARY;

public class StartLottery {
    public static void main(String[] args) {

        int[] userNumbers = Utils.getUserLotteryNumber();

        LotteryEngine le = new LotteryEngine();
        le.runLottery();
        int[] luckyNumbers = le.getLuckyNumbers();

        int countWin = Utils.compareWinnerNumbers(luckyNumbers, userNumbers);

        System.out.println("Пользовательские номера : "+ Arrays.toString(userNumbers));
        System.out.println("Счастливые номера лотереи  : "+ Arrays.toString(luckyNumbers));
        System.out.println("Совпало : "+countWin);
     }

}

//    Изменить написанный код
//        Распределите ответственность написанного кода в соответствующие классы и методы
//        Сохраните номера лотереи в массиве
//        Введите контроль за количеством номеров в лотереи и от пользователя
//        Создайте класс Константы, определите COUNT_SET_SIZE = 5
//        Добавьте проверку пользовательских номеров с номерами лотереи
//        Реализуйте метод в классе Utils
//        Метод должен принимать два массива (lotteryNumber, userNumber)
//        Возвращать количество совпадений
//        Получите от пользователя 5 номеров, сохраните их в массив
//        Протестируйте работу лотереи в классе StartLottery
//        Выведите результаты на консоль

