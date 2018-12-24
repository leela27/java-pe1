package com.stackroute;
import java.lang.String.*;

public class StringRev {
    public String checkStringRev(String s) {
        String rev = "";

        int length = s.length();
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }
}
