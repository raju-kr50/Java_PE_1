
package com.stackroute.pe1;

import java.util.Arrays;
import java.util.Collections;

public class SortDecreasing {

    public int[] sort(int[] inputNumbers) {
        int temp;
        for (int i = 0; i < inputNumbers.length; i++) {
            for (int j = i + 1; j < inputNumbers.length; j++)
                if (inputNumbers[i] <= inputNumbers[j]) {
                    temp = inputNumbers[i];
                    inputNumbers[i] = inputNumbers[j];
                    inputNumbers[j] = temp;
                }
        }
        return inputNumbers;
    }
}
