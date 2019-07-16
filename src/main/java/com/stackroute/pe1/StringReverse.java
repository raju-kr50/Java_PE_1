package com.stackroute.pe1;

public class StringReverse {

    public String reverseString(String originalString) {
        String reversedString = "";
        if (originalString == null) {
            return "Error: String cannot be null";
        }
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + originalString.charAt(i);
        }
        return reversedString;
    }
}
