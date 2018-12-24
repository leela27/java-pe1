package com.stackroute;
import org.junit.Test;
import static org.junit.Assert.*;

    public class StringRepeatTest {
        @Test
        public void rep()
        {
            StringRepeat repeat = new StringRepeat();
            String result = repeat.Repeat("leela",2);
            assertEquals("leelalalala",result);

        }
        @Test
        public void repFailure()
        {
            StringRepeat repeat = new StringRepeat();
            String result = repeat.Repeat("leela",2);
            assertEquals("leelalala",result);

        }
}

