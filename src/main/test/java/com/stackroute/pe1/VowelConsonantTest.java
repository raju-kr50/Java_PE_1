package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class VowelConsonantTest {
    VowelConsonant vowelConsonant;

    @Before
    public void setUp() {
        this.vowelConsonant = new VowelConsonant();
    }

    @After
    public void tearDown() {
        vowelConsonant = null;
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
    public void givenStringShouldReturnAlphabetType() {
        String actualResult = vowelConsonant.vowelOrConsonant("Hello");
        assertEquals("ConsonantVowelConsonantConsonantVowel", actualResult);
    }

    @Test
    public void givenNullShouldReturnNull() {
        String actualResult = vowelConsonant.vowelOrConsonant(null);
        assertNotNull("Enter non-empty String", actualResult);
    }
//    @Test
//    public void givenASringShouldReturnTheResult() {
//    VowelConsonent string = new VowelConsonent();
//    String actualResult = string.vowelOrConsonant("Hello");
//    assertEquals("consonent vowel consonent consonent vowel", actualResult );
//    }
}