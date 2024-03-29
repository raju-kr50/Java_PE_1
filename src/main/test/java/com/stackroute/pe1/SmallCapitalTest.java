package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class SmallCapitalTest {
    SmallCapital smallCapital;

    @Before
    public void setUp() {
        this.smallCapital = new SmallCapital();
    }

    @After
    public void tearDown() {
        this.smallCapital = null;
    }

    @Test
    public void givenSmallCaseCharacterShouldReturnSmallLetter() {
        String actualResult = smallCapital.checkSmallCapital('h');
        assertEquals("Small Letter", actualResult);
    }

    @Test
    public void givenCapitalCharacterShouldReturnCapitalLetter() {
        String actualResult = smallCapital.checkSmallCapital('J');
        assertEquals("Capital Letter", actualResult);
    }

    @Test
    public void givenADigitShouldReturnDigit() {
        String actualResult = smallCapital.checkSmallCapital('8');
        assertEquals("Digit", actualResult);
    }

    @Test
    public void givenSpecialCharacterShouldReturnEnterAgain() {
        String actualResult = smallCapital.checkSmallCapital('%');
        assertEquals("Please enter letter or digit", actualResult);
    }
}