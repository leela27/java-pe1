package com.stackroute;
import java.lang.String;

public class VowelConsonant {
    public String Checkingcharacter(String s) {
        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            if (s1 == 'a' || s1 == 'e' || s1 == 'i' || s1 == 'o' || s1 == 'u') {
                return "Vowel";
            } else {
                return "consonant";
            }
        }
        return "success";
    }

}
