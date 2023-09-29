package de.telran.lesson22.practice3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void getUserLotteryNumberTest() {
        int[] luckyNumbers = {1,2,3,4,5};
        int[] userNumbers = {6,5,8,7,1};

        int realLuckyCount = Utils.compareWinnerNumbers(luckyNumbers, userNumbers);
        int expLuckyCount = 2;
        assertEquals(expLuckyCount, realLuckyCount);
    }
}