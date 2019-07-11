package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;


public class JunitDemoTest {
    JunitDemo junitDemo;
    @Before
    public void setup() {
        System.out.println("Inside before");
         this.junitDemo = new JunitDemo();
    }
    @After
    public void tearDown()
    {
        System.out.println("inside after");
        junitDemo=null;
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
    public void givenTwoStringsShouldReturnConcatanatedUpperString() {
        //arrange =
       // JunitDemo junitDemo = new JunitDemo();

        //act
        String actualResult = junitDemo.concatAndUpperCase("Hello", "World");

        //assert
        assertNotNull(actualResult);
        assertEquals("HELLOWORLD", actualResult);


    }

    @Test
    public void givenAStringsAndNullShouldReturnErroeMessage() {
        //arrange =
        JunitDemo junitDemo = new JunitDemo();

        //act
        String actualResult = junitDemo.concatAndUpperCase("Hello", null);

        //assert
        assertNotNull(actualResult);
        assertEquals("HELLOWORLD", actualResult);


    }

   @Test
   public void givenNullShouldThrowNullPointerException() {
        String actualResult = junitDemo.reversedString(null);
    }
    @Test
    public void givenStringShouldReturnTheReverse() {
        String actualResult = junitDemo.reversedString("Hello");
        assertEquals("olleH", actualResult);
    }
    @Test
    public void givenStringShouldBeNotNull() {
        String actualResult = junitDemo.reversedString(null);
        assertEquals("string should be not nul",actualResult);
    }

}