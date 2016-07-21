package com.codelab;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

/**
 * Created by Martin on 7/17/16.
 * Test class for Fibonacci.java
 */
public class FibonacciTest {

    // since this is a recursive method we may want to check for infinite loops/taking too long
    @Rule
    public Timeout globalTimeout = Timeout.seconds(100);

    // test case for n=0
    @Test
    public void fibValid0(){
        Fibonacci f = new Fibonacci();
        assertEquals(0,f.fib(0));
    }

    //test case for n=1
    @Test
    public void fibValid1(){
        Fibonacci f = new Fibonacci();
        assertEquals(1,f.fib(1));
    }

    //test case for n=2
    @Test
    public void fibValid2(){
        Fibonacci f = new Fibonacci();
        assertEquals(1,f.fib(2));
    }

    //test for normal case
    @Test
    public void fibValid3(){
        Fibonacci f = new Fibonacci();
        assertEquals(1134903170,f.fib(45));
    }

    //test for normal case with large n
    @Test
    public void fibValidLarge(){
        Fibonacci f = new Fibonacci();
        assertEquals(0x18b3c1d91e77decdL,f.fib(89));
    }

    // test case invalid input
    @Test(expected = IllegalArgumentException.class)
    public void InvalidInputException9() {
        Fibonacci f = new Fibonacci();
        f.fib('s');
    }


}