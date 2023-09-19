package de.telran.lesson22.practice3;

import java.util.Random;

import static de.telran.lesson22.practice3.Constants.COUNT_SET_SIZE;
import static de.telran.lesson22.practice3.Constants.RANGE_NUMBER_LOTTARY;

public class LotteryEngine {
    private int[] luckyNumbers = new int[COUNT_SET_SIZE];

    public int[] getLuckyNumbers() {
        return luckyNumbers;
    }

    public void runLottery() {
        int luckyRandom;

        Random random = new Random();
        for (int genericCount=1; genericCount<= COUNT_SET_SIZE; ) {
            luckyRandom = random.nextInt(RANGE_NUMBER_LOTTARY-1)+1;
            switch (genericCount) {
                case 1: {
                    luckyNumbers[0] = luckyRandom;
                    genericCount++;
                    break;
                }
                case 2: {
                    if (luckyNumbers[0] != luckyRandom) {
                        luckyNumbers[1] = luckyRandom;
                        genericCount++;
                    }
                    break;
                }
                case 3: {
                    if (luckyNumbers[0]!=luckyRandom && luckyNumbers[1]!=luckyRandom) {
                        luckyNumbers[2] = luckyRandom;
                        genericCount++;
                    }
                    break;
                }
                case 4: {
                    if (luckyNumbers[0]!=luckyRandom && luckyNumbers[1]!=luckyRandom && luckyNumbers[2]!=luckyRandom) {
                        luckyNumbers[3] = luckyRandom;
                        genericCount++;
                    }
                    break;
                }
                case 5: {
                    if (luckyNumbers[0]!=luckyRandom && luckyNumbers[1]!=luckyRandom && luckyNumbers[2]!=luckyRandom && luckyNumbers[3]!=luckyRandom) {
                        luckyNumbers[4] = luckyRandom;
                        genericCount++;
                    }
                }
            }
        }

    }
}
