package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;

    @Before
    public void setUp() {
        // arrange
        this.palindrome = new Palindrome();
    }

    @After
    public void tearDown() {
        this.palindrome = null;
    }

    @Test
    public void givenNonPositiveNumberShouldReturnErrorMessage() {
        // act
        String actualResult = palindrome.checkPalindrome(-45);
        // assert
        assertEquals("Enter number greater than 0", actualResult);
    }

    @Test
    public void givenNumberShouldReturnNonPalindromeNumber() {
        // act
        String actualResult = palindrome.checkPalindrome(674345);
        //assert
        assertEquals("Not Palindrome", actualResult);
    }

    @Test
    public void givenPalindromeNumberShouldReturnPalindromeNumberWithSumOfEvenNumberGreaterThan25() {
        // act
        String actualResult = palindrome.checkPalindrome(88688);
        //assert
        assertEquals("The number is palindrome and the sum of even numbers is greater than 25", actualResult);
    }

    @Test
    public void givenPalindromeNumberShouldReturnPalindromeNumberWithSumOfEvenNumberLessThan25() {
        // act
        String actualResult = palindrome.checkPalindrome(123454321);
        //assert
        assertEquals("The number is palindrome and the sum of even numbers is not greater than 25", actualResult);
    }
}