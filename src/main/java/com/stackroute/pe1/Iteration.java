package com.stackroute.pe1;
import java.util.Scanner;

public class Iteration {

 //   public static void main(String[] args ) {
    public String iterate(int numberOfIteration) {
        String result = "";
        String newResult = "";
        if(numberOfIteration < 1) {
            return "Enter number greater than 0";
        }

        for(int i= 1; i <= numberOfIteration; i++) {
            for( int j = 1; j<= i; j++) {
               result += i+" ";
            }
        }
        newResult = result.trim();
        return newResult;
    }
}
