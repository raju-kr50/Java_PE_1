package com.stackroute.pe1;

public class AddIntegers {

    public int integerSum(int number, int[] integers) {
        int sum = 0;
        for(int i = 0; i < integers.length; i++) {
            sum = sum + integers[i];
        }
       return sum;
    }
}
