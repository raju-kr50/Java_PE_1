package com.stackroute.pe1;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringRepeatTest {
    StringRepeat stringRepeat;

    @Before
    public void setUp() {
        this.stringRepeat = new StringRepeat();
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
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