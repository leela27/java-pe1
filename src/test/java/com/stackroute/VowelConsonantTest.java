package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;


public class VowelConsonantTest {
    @Test
    public void  VowelConsonantCheck() {
        VowelConsonant vw = new VowelConsonant();
        String result = vw.Checkingcharacter("ap");
        assertEquals("Vowel",result);
    }
}
