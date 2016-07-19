package com.codelab;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Martin on 7/17/16.
 * Test class for Lotto.java
 */
public class LottoTest {

    // test constructor does not throw an exception
    @Test
    public void testConstructor() {
        long[] numbers = {23L, 47L, 9L, 14L, 30L, 55L};
        Lotto lotto = new Lotto(15L,5L,2015L,numbers);
    }

    // test normal case for getDate
    @Test
    public void getDateValid1() {
        long[] numbers = {23L, 47L, 9L, 14L, 30L, 55L};
        Lotto lotto = new Lotto(15L,5L,2015L,numbers);
        assertEquals("5/15/2015",lotto.getDate());
    }

    // test boundary case (max value for all inputs assuming only certain allowed values for variables)
    @Test
    public void getDateValid2() {
        long[] numbers = {63L, 63L, 63L, 63L, 63L, 63L};
        Lotto lotto = new Lotto(31L,12L,4095L,numbers);
        assertEquals("12/31/4095",lotto.getDate());
    }

    // test boundary case (min value for all inputs assuming only certain allowed values for variables)
    @Test
    public void getDateValid3() {
        long[] numbers = {0L, 0L, 0L, 0L, 0L, 0L};
        Lotto lotto = new Lotto(1L,1L,0L,numbers);
        assertEquals("1/1/0",lotto.getDate());
    }

    // test normal case for getNumber at 1
    @Test
    public void getNumberValid1() {
        long[] numbers = {23L, 47L, 9L, 14L, 30L, 55L};
        Lotto lotto = new Lotto(15L,5L,2015L,numbers);
        assertEquals(23L,lotto.getNumber(1));
    }

    // test normal case for getNumber at 2
    @Test
    public void getNumberValid2() {
        long[] numbers = {23L, 47L, 9L, 14L, 30L, 55L};
        Lotto lotto = new Lotto(15L,5L,2015L,numbers);
        assertEquals(47L,lotto.getNumber(2));
    }

    // test normal case for getNumber at 3
    @Test
    public void getNumberValid3() {
        long[] numbers = {23L, 47L, 9L, 14L, 30L, 55L};
        Lotto lotto = new Lotto(15L,5L,2015L,numbers);
        assertEquals(9L,lotto.getNumber(3));
    }

    // test normal case for getNumber at 4
    @Test
    public void getNumberValid4() {
        long[] numbers = {23L, 47L, 9L, 14L, 30L, 55L};
        Lotto lotto = new Lotto(15L,5L,2015L,numbers);
        assertEquals(14L,lotto.getNumber(4));
    }

    // test normal case for getNumber at 5
    @Test
    public void getNumberValid5() {
        long[] numbers = {23L, 47L, 9L, 14L, 30L, 55L};
        Lotto lotto = new Lotto(15L,5L,2015L,numbers);
        assertEquals(30L,lotto.getNumber(5));
    }

    // test normal case for getNumber at 6
    @Test
    public void getNumberValid6() {
        long[] numbers = {23L, 47L, 9L, 14L, 30L, 55L};
        Lotto lotto = new Lotto(15L,5L,2015L,numbers);
        assertEquals(55L,lotto.getNumber(6));
    }

    // test max boundary case for getNumber at 1
    @Test
    public void getNumberValid7() {
        long[] numbers = {63L, 63L, 63L, 63L, 63L, 63L};
        Lotto lotto = new Lotto(31L,12L,4095L,numbers);
        assertEquals(63L,lotto.getNumber(1));
    }

    // test max boundary case for getNumber at 3
    @Test
    public void getNumberValid8() {
        long[] numbers = {63L, 63L, 63L, 63L, 63L, 63L};
        Lotto lotto = new Lotto(31L,12L,4095L,numbers);
        assertEquals(63L,lotto.getNumber(3));
    }

    // test max boundary case for getNumber at 6
    @Test
    public void getNumberValid9() {
        long[] numbers = {63L, 63L, 63L, 63L, 63L, 63L};
        Lotto lotto = new Lotto(31L,12L,4095L,numbers);
        assertEquals(63L,lotto.getNumber(6));
    }

    // test min boundary case for getNumber at 1
    @Test
    public void getNumberValid10() {
        long[] numbers = {0L, 0L, 0L, 0L, 0L, 0L};
        Lotto lotto = new Lotto(1L,1L,0L,numbers);
        assertEquals(0L,lotto.getNumber(1));
    }

    // test min boundary case for getNumber at 3
    @Test
    public void getNumberValid11() {
        long[] numbers = {0L, 0L, 0L, 0L, 0L, 0L};
        Lotto lotto = new Lotto(1L,1L,0L,numbers);
        assertEquals(0L,lotto.getNumber(3));
    }

    // test min boundary case for getNumber at 6
    @Test
    public void getNumberValid12() {
        long[] numbers = {0L, 0L, 0L, 0L, 0L, 0L};
        Lotto lotto = new Lotto(1L,1L,0L,numbers);
        assertEquals(0L,lotto.getNumber(6));
    }

    // test case for getNumber > 6
    @Test
    public void getNumberNotValid1() {
        long[] numbers = {23L, 47L, 9L, 14L, 30L, 55L};
        Lotto lotto = new Lotto(15L,5L,2015L,numbers);
        assertEquals(0L,lotto.getNumber(7));
    }

    // test case for getNumber < 1
    @Test
    public void getNumberNotValid2() {
        long[] numbers = {23L, 47L, 9L, 14L, 30L, 55L};
        Lotto lotto = new Lotto(15L,5L,2015L,numbers);
        assertEquals(0L,lotto.getNumber(0));
    }

    // test case for getNumber < 0
    @Test
    public void getNumberNotValid3() {
        long[] numbers = {23L, 47L, 9L, 14L, 30L, 55L};
        Lotto lotto = new Lotto(15L,5L,2015L,numbers);
        assertEquals(0L,lotto.getNumber(-1));
    }

    // test case for length(numbers) < 6
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void getNumberException1() {
        long[] numbers = {23L, 47L, 9L, 14L, 30L};
        Lotto lotto = new Lotto(15L,5L,2015L,numbers);
    }

    // test case for numbers = {}
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void getNumberException2() {
        long[] numbers = {};
        Lotto lotto = new Lotto(15L,5L,2015L,numbers);
    }

}