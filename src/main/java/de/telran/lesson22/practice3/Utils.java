package de.telran.lesson22.practice3;

import java.util.Scanner;

import static de.telran.lesson22.practice3.Constants.COUNT_SET_SIZE;
import static de.telran.lesson22.practice3.Constants.RANGE_NUMBER_LOTTARY;

public class Utils {

    public int count;

    public static int[] getUserLotteryNumber() {
        // номера, которые ввел пользователь
        int[] userNumbers = new int[COUNT_SET_SIZE];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<userNumbers.length; i++) {
            do { // проверка, чтобы пользователь вводил корректное число из интервала
                System.out.print("Введите " + (i + 1) + " число (1.." + RANGE_NUMBER_LOTTARY + "):");
                userNumbers[i] = scanner.nextInt();
            } while(userNumbers[i] <= 0 || userNumbers[i] > RANGE_NUMBER_LOTTARY);
        }
        return userNumbers;
    }

    public static int compareWinnerNumbers(int[] lotterNumber, int[] userNumber) {
        int countWin = 0;
        for(int numUser : userNumber) {
            for(int numLottary : lotterNumber) {
                if(numUser == numLottary) {
                    countWin++;
                    break;
                }
            }
        }
        return countWin;
    }
}
