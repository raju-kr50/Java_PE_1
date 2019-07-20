package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortDecreasingTest {

    SortDecreasing sortDecreasing;

    //Careating addIntegers object before running the test cases.
    @Before
    public void setUp() {
        this.sortDecreasing = new SortDecreasing();
    }

    //Destroying the created object after running the test cases.
    @After
    public void tearDown() {
        this.sortDecreasing = null;
    }

    @Test
    public void given5IntegersShoudReturnInDecreasingOrder() {
        int[] arrayInput = {6,7,1,9,3};
        int[] arrayOutput = {9,7,6,3,1};
        //act
        int[] actualResult = sortDecreasing.sort(arrayInput);
        assertArrayEquals(arrayOutput, actualResult);
    }

    @Test
    public void given9IntegersShoudReturnInDecreasingOrder() {
        int[] arrayInput = {0,-6,-0,367,6,7,1,9,3};
        int[] arrayOutput = {367,9,7,6,3,1,-0,0,-6};
        //act
        int[] actualResult = sortDecreasing.sort(arrayInput);
        assertArrayEquals(arrayOutput, actualResult);
    }


}