package com.stackroute.pe1;

public class ReversedString {
    public String reversedString(String str) {
        int length=str.length();
        String result="";
        for(int i=0;i<length;i++)
        {
            result=result+str.charAt(i);
        }
        return result;
    }
}
