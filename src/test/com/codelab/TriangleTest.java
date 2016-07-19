package com.codelab;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

/**
 * Created by Martin on 7/17/16.
 * Test class for Triangle.java
 */
public class TriangleTest{

    // check for infinite loops/taking too long
    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);

    // test constructor does not raise an exception
    @Test
    public void testConstructor(){
        Triangle triangle = new Triangle(5,6,7);
    }

    // test normal case for a>0, b>0, c>0, a+b>c, a=b=c
    @Test
    public void classifyEquilateral(){
        Triangle triangle = new Triangle(3,3,3);
        assertEquals(1,triangle.classify());
    }

    // test normal case for a>0, b>0, c>0, a+b>c, a=b!=c
    @Test
    public void classifyIsosceles(){
        Triangle triangle = new Triangle(3,3,5);
        assertEquals(2,triangle.classify());
    }

    // test normal case for a>0, b>0, c>0, a+b>c, a!=b!=c and a!=c
    @Test
    public void classifyScalene(){
        Triangle triangle = new Triangle(3,4,5);
        assertEquals(3,triangle.classify());
    }

    // test boundary case for a=0
    @Test
    public void classifyBadTriangle1() {

        Triangle triangle = new Triangle(0,4,5);
        assertEquals(-1, triangle.classify());
    }

    // test boundary case for a>0, b=0
    @Test
    public void classifyBadTriangle2() {

        Triangle triangle = new Triangle(3,0,5);
        assertEquals(-1, triangle.classify());
    }

    // test boundary case for a>0, b>0, c=0
    @Test
    public void classifyBadTriangle3() {

        Triangle triangle = new Triangle(3, 4, 0);
        assertEquals(-1, triangle.classify());
    }

    // test boundary case for a=0, b=0, c>0
    @Test
    public void classifyBadTriangle4() {

        Triangle triangle = new Triangle(0, 0, 5);
        assertEquals(-1, triangle.classify());
    }

    // test boundary case for a=0, b>0, c=0
    @Test
    public void classifyBadTriangle5() {

        Triangle triangle = new Triangle(0, 4, 0);
        assertEquals(-1, triangle.classify());
    }

    // test boundary case for a>0, b=0, c=0
    @Test
    public void classifyBadTriangle6() {

        Triangle triangle = new Triangle(3, 0, 0);
        assertEquals(-1, triangle.classify());
    }

    // test boundary case for a=0, b=0, c=0
    @Test
    public void classifyBadTriangle7() {

        Triangle triangle = new Triangle(0, 0, 0);
        assertEquals(-1, triangle.classify());
    }

    // test boundary case for a<0
    @Test
    public void classifyBadTriangle8() {

        Triangle triangle = new Triangle(-1,4,5);
        assertEquals(-1, triangle.classify());
    }

    // test boundary case for a>0, b<0
    @Test
    public void classifyBadTriangle9() {

        Triangle triangle = new Triangle(3,-1,5);
        assertEquals(-1, triangle.classify());
    }

    // test boundary case for a>0, b>0, c<0
    @Test
    public void classifyBadTriangle10() {

        Triangle triangle = new Triangle(3, 4, -1);
        assertEquals(-1, triangle.classify());
    }

    // test boundary case for a<0, b<0, c>0
    @Test
    public void classifyBadTriangle11() {

        Triangle triangle = new Triangle(-1, -1, 5);
        assertEquals(-1, triangle.classify());
    }

    // test boundary case for a<0, b>0, c<0
    @Test
    public void classifyBadTriangle12() {

        Triangle triangle = new Triangle(-1, 4, -1);
        assertEquals(-1, triangle.classify());
    }

    // test boundary case for a>0, b<0, c<0
    @Test
    public void classifyBadTriangle13() {

        Triangle triangle = new Triangle(3, -1, -1);
        assertEquals(-1, triangle.classify());
    }

    // test boundary case for a<0, b<0, c<0
    @Test
    public void classifyBadTriangle14() {

        Triangle triangle = new Triangle(-1, -1, -1);
        assertEquals(-1, triangle.classify());
    }

    // test boundary case for a>0, b>0, c>0, a+b=c
    @Test
    public void classifyBadTriangle15() {

        Triangle triangle = new Triangle(1, 4, 5);
        assertEquals(4, triangle.classify());
    }

    // test boundary case for a>0, b>0, c>0, a+b<c
    @Test
    public void classifyBadTriangle16() {

        Triangle triangle = new Triangle(5, 6, 12);
        assertEquals(-1, triangle.classify());
    }

}