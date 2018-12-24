package com.stackroute;
import org.junit.Test;
import static org.junit.Assert.*;

public class LetterDetermineTest {
    @Test
    public void checkspecial()
    {
        LetterDetermine obj = new LetterDetermine();
        String result = obj.checkspecial('a');
        assertEquals("Lower case letter",result);

    }
}