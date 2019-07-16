package com.stackroute.pe1;

public class VowelConsonant {

    public String vowelOrConsonant(String word) {
        if(word == null) {
            return "Enter non-empty String";
        }
        String result = "";
        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                result = result + "Vowel";
            } else {
                result = result + "Consonant";
            }
        }
        return result;
    }
}
