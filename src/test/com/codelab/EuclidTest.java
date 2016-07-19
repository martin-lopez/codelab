package com.codelab;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

/**
 * Created by Martin on 7/17/16.
 * Test class for Euclid.java
 */
public class EuclidTest {

    // check for infinite loop/taking too long
    @Rule

    public Timeout globalTimeout = Timeout.seconds(10);
    // test for normal case with a>0, b>0 (small numbers)
    @Test
    public void gcdValid1() throws Exception{
        Euclid euclid = new Euclid();
        assertEquals(2, euclid.gcd(2,4));
    }

    // test for normal case with a>0, b>0 (small numbers)
    @Test
    public void gcdValid2() throws Exception{
        Euclid euclid = new Euclid();
        assertEquals(2, euclid.gcd(4,2));
    }

    // test for normal case with a>0, b>0 (large numbers)
    @Test
    public void gcdValid3() throws Exception{
        Euclid euclid = new Euclid();
        assertEquals(24578, euclid.gcd(3514654,1376368));
    }

    // test for boundary cases with a=0, b=0
    @Test
    public void gcdValid4() throws Exception{
        Euclid euclid = new Euclid();
        assertEquals(0, euclid.gcd(0,0));
    }

    // test for boundary cases with a>0, b=0
    @Test
    public void gcdValid5() throws Exception{
        Euclid euclid = new Euclid();
        assertEquals(1, euclid.gcd(1,0));
    }

    // test for boundary cases with a=0, b>0
    @Test
    public void gcdValid6() throws Exception{
        Euclid euclid = new Euclid();
        assertEquals(1, euclid.gcd(0,1));
    }

    // test for boundary cases with a<0, b>0
    @Test
    public void gcdValid7() throws Exception{
        Euclid euclid = new Euclid();
        assertEquals(1, euclid.gcd(-2,3));
    }

    // test for boundary cases with a>0, b<0
    @Test
    public void gcdValid8() throws Exception{
        Euclid euclid = new Euclid();
        assertEquals(1, euclid.gcd(2,-3));
    }


}