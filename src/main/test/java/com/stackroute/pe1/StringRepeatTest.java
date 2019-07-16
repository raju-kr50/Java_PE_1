package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class StringRepeatTest {
    StringRepeat stringRepeat;

    @Before
    public void setUp() {
        this.stringRepeat = new StringRepeat();
    }

    @After
    public void tearDown() {
        this.stringRepeat = null;
    }

    @Test
    public void givenStringAndNumberShouldReturnTheStringWithRepeatedSubstring() {
        String actualResult = stringRepeat.substringRepeat("Stackroute",5);
        assertEquals("Stackrouterouterouterouterouteroute", actualResult);
    }

    @Test
    public void givenStringAndNumberShouldReturnTheStringWithRepeatedString() {
        String actualResult = stringRepeat.substringRepeat("Stack",5);
        assertEquals("StackStackStackStackStackStack", actualResult);
    }

    @Test
    public void givenNullShouldReturnErrorMessage() {
        String actualResult = stringRepeat.substringRepeat(null, 4);
        assertNotNull("Error: String cannot be null", actualResult);
    }
}