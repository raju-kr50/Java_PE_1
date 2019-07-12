package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringRepeatTest {
    StringRepeat stringRepeat;

    @Before
    public void setUp() {
        this.stringRepeat = new StringRepeat();
    }

    @Test
    public void givenStringAndNumberShouldReturnTheStringWithRepeatedSubstring() {
        String actualResult = stringRepeat.substringRepeat("Stackroute",5);
        assertEquals("Stackrouterouterouterouterouteroute", actualResult);
    }

    @Test
    public void givenNullShouldReturnErrorMessage() {
        String actualResult = stringRepeat.substringRepeat(null, 4);
        assertNotNull("Error: String cannot be null", actualResult);
    }
}