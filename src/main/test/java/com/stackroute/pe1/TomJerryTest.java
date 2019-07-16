package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class TomJerryTest {
    TomJerry tomJerry;

    @Before
    public void setUp() {
        this.tomJerry = new TomJerry();
    }

    @After
    public void tearDown() {
        this.tomJerry = null;
    }

    @Test
    public void givenAnIntegerShouldReturnNumberGreater() {
        String actualResult = tomJerry.tomAndJerry(34);
        assertEquals("Please enter a number between 20 and 30", actualResult);
    }

    @Test
    public void givenAnIntegerShouldReturnNumberSmaller() {
        String actualResult = tomJerry.tomAndJerry(15);
        assertEquals("Please enter a number between 20 and 30", actualResult);
    }

    @Test
    public void givenAnIntegerShouldReturnTom() {
        String actualResult = tomJerry.tomAndJerry(26);
        assertEquals("Tom", actualResult);
    }

    @Test
    public void givenAnIntegerShouldReturnJerry() {
        String actualResult = tomJerry.tomAndJerry(23);
        assertEquals("Jerry", actualResult);
      }

    @Test
    public void givenAnIntegerShouldReturnNegative() {
        String actualResult = tomJerry.tomAndJerry(-23);
        assertEquals("No negative numbers are allowed", actualResult);
    }
}