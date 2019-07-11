package com.stackroute.pe1;

public class JunitDemo {

    public String concatAndUpperCase(String str1, String str2) {
        if(str1==null || str2==null)
        {
            return "string should be non empty";
        }
        String concatedString = str1.concat(str2);
        return concatedString.toUpperCase();
    }

    public String reversedString(String str) {
        if (str == null)
        {
           return "string should be not null";
        }

        int length=str.length();
        String result="";
        for(int i=length-1;i>=0;i--)
        {
            result=result+str.charAt(i);
        }
        System.out.println("output is"+ result);
        return result;
    }
    }

