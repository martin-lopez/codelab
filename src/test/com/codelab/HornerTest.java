package com.codelab;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

/**
 * Created by Martin on 7/17/16.
 * Test class for Horner.java
 */
public class HornerTest {

    // check for infinite loops/taking too long
    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);

    // test normal case of type p(x) = a_0 + a_1x + a_2x^2 + a_3x^3 and x>0 and i>0
    @Test
    public void solveValid1() throws Exception {
        String[] args = {"3", "2", "4", "7", "11", "1"};
        assertEquals(70,Horner.solve(args));
    }

    // test normal case of type p(x) = a_0 + a_1x + a_2x^2 + a_3x^3 and x>0 and i>0 for large x
    @Test
    public void solveValid1Large() throws Exception {
        String[] args = {"3", "1056", "4", "7", "11", "1"};
        assertEquals(1189857508,Horner.solve(args));
    }

    // test boundary case of type i=0, x=0, args=0, p(x) = 0
    @Test
    public void solveValid2() throws Exception {
        String[] args = {"0", "0", "0"};
        assertEquals(0,Horner.solve(args));
    }

    // test boundary case of type i=0, x=0, args>0, p(x) =  a_0
    @Test
    public void solveValid3() throws Exception {
        String[] args = {"0", "0", "9"};
        assertEquals(9,Horner.solve(args));
    }

    // test boundary case of type i=0, x=0, args<0, p(x) =  -a_0
    @Test
    public void solveValid4() throws Exception {
        String[] args = {"0", "0", "-9"};
        assertEquals(-9,Horner.solve(args));
    }

    // test boundary case of type i=0, x>0, args=0, p(x) = 0
    @Test
    public void solveValid5() throws Exception {
        String[] args = {"0", "6", "0"};
        assertEquals(0,Horner.solve(args));
    }

    // test boundary case of type i=0, x>0, args>0, p(x) = a_0
    @Test
    public void solveValid6() throws Exception {
        String[] args = {"0", "6", "9"};
        assertEquals(9,Horner.solve(args));
    }

    // test boundary case of type i=0, x>0, args<0, p(x) = -a_0
    @Test
    public void solveValid7() throws Exception {
        String[] args = {"0", "6", "-9"};
        assertEquals(-9,Horner.solve(args));
    }

    // test boundary case of type i=0, x<0, args=0, p(x) = 0
    @Test
    public void solveValid8() throws Exception {
        String[] args = {"0", "-6", "0"};
        assertEquals(0,Horner.solve(args));
    }

    // test boundary case of type i=0, x<0, args>0, p(x) = a_0
    @Test
    public void solveValid9() throws Exception {
        String[] args = {"0", "-6", "9"};
        assertEquals(9,Horner.solve(args));
    }

    // test boundary case of type i=0, x<0, args<0, p(x) = -a_0
    @Test
    public void solveValid10() throws Exception {
        String[] args = {"0", "-6", "-9"};
        assertEquals(-9,Horner.solve(args));
    }


    // test boundary case of type i>0, x=0, args=0, p(x) = 0
    @Test
    public void solveValid11() throws Exception {
        String[] args = {"1", "0", "0", "0"};
        assertEquals(0,Horner.solve(args));
    }

    // test boundary case of type i>0, x=0, args>0, p(x) = a_0
    @Test
    public void solveValid12() throws Exception {
        String[] args = {"1", "0", "6", "10"};
        assertEquals(6,Horner.solve(args));
    }


    // test boundary case of type i>0, x=0, args<0, p(x) = -a_0
    @Test
    public void solveValid13() throws Exception {
        String[] args = {"1", "0", "-6", "-10"};
        assertEquals(-6,Horner.solve(args));
    }

    // test boundary case of type i>0, x>0, args=0, p(x) = 0
    @Test
    public void solveValid14() throws Exception {
        String[] args = {"1", "8", "0", "0"};
        assertEquals(0,Horner.solve(args));
    }

    // test boundary case of type i>0, x>0, args>0, p(x) = a_0 + a_1x + ...
    @Test
    public void solveValid15() throws Exception {
        String[] args = {"1", "8", "6", "10"};
        assertEquals(86,Horner.solve(args));
    }

    // test boundary case of type i>0, x>0, args<0, p(x) = -a_0 + -a_1x + ...
    @Test
    public void solveValid16() throws Exception {
        String[] args = {"1", "8", "-6", "-10"};
        assertEquals(-86,Horner.solve(args));
    }

    // test boundary case of type i>0, x<0, args=0, p(x) = 0
    @Test
    public void solveValid17() throws Exception {
        String[] args = {"1", "-8", "0", "0"};
        assertEquals(0,Horner.solve(args));
    }

    // test boundary case of type i>0, x<0, args>0, p(x) = a_0 - a_1x + . - . + ...
    @Test
    public void solveValid18() throws Exception {
        String[] args = {"1", "-8", "6", "10"};
        assertEquals(-74,Horner.solve(args));
    }

    // test boundary case of type i>0, x<0, args<0, p(x) = -a_0 + a_1x - . + . - ...
    @Test
    public void solveValid19() throws Exception {
        String[] args = {"1", "-8", "-6", "-10"};
        assertEquals(74,Horner.solve(args));
    }


    // test case for i<-1
    @Test(expected = NegativeArraySizeException.class)
    public void solveException1() throws Exception {
        String[] args = {"-2","0"};
        Horner.solve(args);
    }

    // test case for length(args)<i+2
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void solveException2() throws Exception {
        String[] args = {"0"};
        Horner.solve(args);
    }

    //test case for args with i not an integer string
    @Test(expected = NumberFormatException.class)
    public void solveException3() throws Exception {
        String[] args = {"s"};
        Horner.solve(args);
    }

    //test case for args with x not an integer string
    @Test(expected = NumberFormatException.class)
    public void solveException4() throws Exception {
        String[] args = {"0","t"};
        Horner.solve(args);
    }

    //test case for args with args[2] not an integer string
    @Test(expected = NumberFormatException.class)
    public void solveException5() throws Exception {
        String[] args = {"0","0","u"};
        Horner.solve(args);
    }

    //test case for args with args={}
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void solveException6() throws Exception {
        String[] args = {};
        Horner.solve(args);
    }

}