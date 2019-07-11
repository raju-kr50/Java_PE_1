package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class TomJerryTest {

    @Test
    public void givenAnIntegerShouldReturnNumberGreater() {
        TomJerry tomJerry = new TomJerry();
        String actualResult = tomJerry.tomAndJerry(34);
        assertEquals("Please enter a number between 20 and 30", actualResult);
    }

    @Test
    public void givenAnIntegerShouldReturnNumberSmaller() {
        TomJerry tomJerry = new TomJerry();
        String actualResult = tomJerry.tomAndJerry(15);
        assertEquals("Please enter a number between 20 and 30", actualResult);
    }

    @Test
    public void givenAnIntegerShouldReturnTom() {
        TomJerry tomJerry = new TomJerry();
        String actualResult = tomJerry.tomAndJerry(26);
        assertEquals("Tom", actualResult);
    }

    @Test
    public void givenAnIntegerShouldReturnJerry() {
        TomJerry tomJerry = new TomJerry();
        String actualResult = tomJerry.tomAndJerry(23);
        assertEquals("Jerry", actualResult);
      }

    @Test
    public void givenAnIntegerShouldReturnNegative() {
        TomJerry tomJerry = new TomJerry();
        String actualResult = tomJerry.tomAndJerry(-23);
        assertEquals("No negative numbers are allowed", actualResult);
    }
}