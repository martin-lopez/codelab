package com.codelab;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

/**
 * Created by Martin on 7/17/16.
 * Test class for Eratosthenes.java
 */
public class EratosthenesTest {

    // since we have loops and a nested loop we may want to check for infinite loops/taking too long
    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);

    // test for normal case
    @Test
    public void primesValid1() throws Exception {
        Eratosthenes era = new Eratosthenes();
        int[] expected = {2,3,0,5,0,7,0,0,0,11,0,13,0,0,0,17,0,19,0};
        assertArrayEquals(expected,era.primes(20));
    }

    // test for boundary case max=2 (two outer loops only executed once, inner loop not executed)
    @Test
    public void primesValid2() throws Exception {
        Eratosthenes era = new Eratosthenes();
        int[] expected = {2};
        assertArrayEquals(expected,era.primes(2));
    }

    // test for boundary case max=3 (inner loop only executed once)
    @Test
    public void primesValid3() throws Exception {
        Eratosthenes era = new Eratosthenes();
        int[] expected = {2,3};
        assertArrayEquals(expected,era.primes(3));
    }

    // test for boundary case with no loops executed
    @Test
    public void primesValid4() throws Exception {
        Eratosthenes era = new Eratosthenes();
        int[] expected = {};
        assertArrayEquals(expected,era.primes(1));
    }

    // test for negative array size exception (max<1): invalid input
    @Test(expected = NegativeArraySizeException.class)
    public void primesInvalid1() throws Exception{
        Eratosthenes era = new Eratosthenes();
        era.primes(0);
    }

    // test for invalid input
    @Test(expected = IllegalArgumentException.class)
    public void primesInvalid2() throws Exception{
        Eratosthenes era = new Eratosthenes();
        era.primes('s');
    }


}