package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse stringReverse;

    @Before
    public void setUp() {
        this.stringReverse = new StringReverse();
    }

    @After
    public void tearDown() {
        this.stringReverse = null;
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
    public void givenStringShouldReturnTheReverse() {
        String actualResult = stringReverse.reverseString("Stackroute");
        assertEquals("etuorkcatS", actualResult);
    }

    @Test
    public void givenNullShouldReturnTheError() {
        String actualResult = stringReverse.reverseString(null);
        assertNotNull("Error: String cannot be null");
    }

    @Test
    public void givenSentenceShouldReturnTheReverse() {
        String actualResult = stringReverse.reverseString("This is a sentence.");
        assertEquals(".ecnetnes a si sihT", actualResult);
    }
}