package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberGuessTest {

    NumberGuess numberGuess;

    //Created object before running the test cases
    @Before
    public void setUp() {
        // arrange
        this.numberGuess = new NumberGuess();
    }

    //Destroyed test cases after running the test cases.
    @After
    public void tearDown() {
        this.numberGuess = null;
    }

    @Test
    public void givenInputOutOfRangeShouldReturnTryAgain() {
        //act
        String actualResult = numberGuess.guessNumber(60, 41);
        //assert
        assertEquals("Try Again: Please enter the number between 1 to 50", actualResult);
    }

    @Test
    public void givenWrongGuessLessThanOriginalNumberShouldReturnLessThanOriginalNumberMessage() {
        //act
        String actualResult = numberGuess.guessNumber(34, 41);
        //assert
        assertEquals("Number guessed is less than original number", actualResult);
    }

    @Test
    public void givenWrongGuessMoreThanOriginalNumberShouldReturnMoreThanOriginalNumberMessage() {
        //act
        String actualResult = numberGuess.guessNumber(45, 41);
        //assert
        assertEquals("Number guessed is more than original number", actualResult);
    }

    @Test
    public void givenCorrectGuessShouldReturnCorrectGuessMessage() {
        //act
        String actualResult = numberGuess.guessNumber(41, 41);
        //assert
        assertEquals("Number guessed matches the original number", actualResult);
    }
}