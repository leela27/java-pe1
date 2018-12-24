package com.stackroute;

import org.junit.Test;
import static org.junit.Assert.*;

public class OddEvenTest {
    @Test
    public void OddEvenTest() {
        OddEven oddeven = new OddEven();
        String result = oddeven.checkOddEven(40);
        assertEquals("Invalid number",result);

    }

}
