package de.telran.lesson21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    int expCount;
    int[] expArr;

    @BeforeEach
    void init() {
        expCount = 5;
        expArr = new int[expCount];
        for (int i = 0; i<expCount; i++) expArr[i]=i+1;
    }
    @Test
    void getArrayNumbers() {
//        int expCount = 5;
//        int[] expArr = {0,1,2,3,4};
//        int[] expArr = {1,2,3,4,5};
        int[] realArr = Utils.getArrayNumbers(expCount);
        Assertions.assertArrayEquals(expArr,realArr);
        Assertions.assertEquals(expCount, realArr.length);
    }

    @Test
    void testGetArrayNumbersExpLength(){
//        int expCount = 5;
        int[] realArr = Utils.getArrayNumbers(expCount);
        Assertions.assertEquals(expCount, realArr.length);
    }

    @Test
    void testGetArrayNumbersExpArray(){
//        int[] expArr = {1,2,3,4,5};
        int[] realArr = Utils.getArrayNumbers(5);
        Assertions.assertArrayEquals(expArr,realArr);
    }

    @Test
    void testFindMaxIsEmptyArray() {
        int expMax = Integer.MIN_VALUE;
        int[] emptyArr = new int[0];
        int actMax = Utils.findMax(emptyArr);
        assertEquals(expMax, actMax);
    }

    @Test
    void testFindMaxMaxValue() {
        int[] expArr = {1, -5, -33, 23, 0};
        int expMax = 23;
        int actMax = Utils.findMax(expArr);
        assertEquals(expMax, actMax);
    }
}