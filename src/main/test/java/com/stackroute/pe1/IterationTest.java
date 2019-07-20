package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class IterationTest {
    Iteration iteration;

    //Created object before running the test cases
    @Before
    public void setUp() {
        // arrange
        this.iteration = new Iteration();
    }

    //Destroyed test cases after running the test cases.
    @After
    public void tearDown() {
        this.iteration = null;
    }

    @Test
    public void givenNumberLessThanOneShouldReturnErrorMessage() {
        //act
        String actualResult = iteration.iterate(0);
        //assert
        assertEquals("Enter number greater than 0", actualResult);
    }

    @Test
    public void givenNumberOfIterationShouldReturnResult() {
        //act
        String actualResult = iteration.iterate(5);
        //assert
        assertEquals("1 2 2 3 3 3 4 4 4 4 5 5 5 5 5", actualResult);
    }
}