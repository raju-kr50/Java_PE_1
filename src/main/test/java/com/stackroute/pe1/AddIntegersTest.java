package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddIntegersTest {

    AddIntegers addIntegers;
    //Careating addIntegers object before running the test cases.
    @Before
    public void setUp() {
        this.addIntegers = new AddIntegers();
    }
    //Destroying the created object after running the test cases.
    @After
    public void tearDown() {
        this.addIntegers = null;
    }

    @Test
    public void given5IntegersShouldReturnThSum() {
        int[] integers = {10,20,30,40,50};              //Array of integers as input
        //act
        int actualResult = addIntegers.integerSum(5,integers);
        //assert
        assertEquals(150, actualResult);

    }

    @Test
    public void given7IntegersShouldReturnThSum() {
        int[] integers = {10,20,-30,40,50,60,-70};              //Array of integers as input
        //act
        int actualResult = addIntegers.integerSum(7,integers);
        //assert
        assertEquals(80, actualResult);

    }

    @Test
    public void givenCharacterValueShouldReturnThSum() {
        int[] integers = {'A',20,30,40,50};              //Array of integers as input
        //act
        int actualResult = addIntegers.integerSum(5,integers);
        //assert
        assertEquals(205, actualResult);

    }


}