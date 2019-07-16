//package com.stackroute.pe1;
//
//import org.junit.*;
//
//import static org.junit.Assert.*;
//
//public class IterationTest {
//    Iteration iteration;
//    @Before
//    public void setUp() {
//        // arrange
//        this.iteration = new Iteration();
//    }
//
//    @After
//    public void tearDown() {
//        this.iteration = null;
//    }
//
//    @BeforeClass
//    public static void beforeClass() {
//        System.out.println("Before Class");
//    }
//
//    @AfterClass
//    public static void afterClass() {
//        System.out.println("After Class");
//    }
//
//    @Test
//    public void givenNumberLessThanOneShouldReturnErrorMessage() {
//        //act
//        String actualResult = iteration.iteration(0);
//        //assert
//        assertEquals("Enter number greater than 1", actualResult);
//    }
//}