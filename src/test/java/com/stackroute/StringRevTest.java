package com.stackroute;

import org.junit.Test;
import static org.junit.Assert.*;
public class StringRevTest {
        @Test
        public void StringRev() {
            StringRev stp = new StringRev();
            String result = stp.checkStringRev("anil");
            assertEquals("lina",result);
        }
    }

