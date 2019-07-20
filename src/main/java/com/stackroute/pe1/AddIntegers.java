package com.stackroute.pe1;
import java.util.Scanner;

public class AddIntegers {

    public int integerSum(int number, int[] integers) {
        int sum = 0;
        for(int i = 0; i < integers.length; i++) {
//            numbers[i] = scan.nextInt();
            sum = sum + integers[i];
        }
       return sum;
    }
}
