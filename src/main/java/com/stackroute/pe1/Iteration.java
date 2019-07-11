package com.stackroute.pe1;
import java.util.Scanner;

public class Iteration {

    public static void main(String[] args ) {
        int noOfIteration;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many times you want to iterate? ");
        noOfIteration = scan.nextInt();

        for(int i= 1; i <= noOfIteration; i++) {
            for( int j = 1; j<= i; j++) {
                System.out.print(i+" ");
            }
        }
    }
}
