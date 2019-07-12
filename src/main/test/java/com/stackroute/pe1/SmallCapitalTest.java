package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SmallCapitalTest {
    SmallCapital smallCapital;
    @Before
    public void setUp()
    {
        this.smallCapital = new SmallCapital();
    }


    @Test
    public void givenSmallCaseCharacterShouldReturnSmallLetter() {
      //  SmallCapital character = new SmallCapital();
        String actualResult = smallCapital.checkSmallCapital('h');
        assertEquals("Small Letter", actualResult);
    }

    @Test
    public void givenCapitalCharacterShouldReturnCapitalLetter() {
      //  SmallCapital character = new SmallCapital();
        String actualResult = smallCapital.checkSmallCapital('J');
        assertEquals("Capital Letter", actualResult);
    }

    @Test
    public void givenADigitShouldReturnDigit() {
      //  SmallCapital character = new SmallCapital();
        String actualResult = smallCapital.checkSmallCapital('8');
        assertEquals("Digit", actualResult);
    }

    @Test
    public void givenSpecialCharacterShouldReturnEnterAgain() {
     //   SmallCapital character = new SmallCapital();
        String actualResult = smallCapital.checkSmallCapital('%');
        assertEquals("Please enter letter or digit", actualResult);
    }
}