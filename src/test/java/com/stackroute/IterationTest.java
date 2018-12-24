package com.stackroute;
import org.junit.Test;
import static org.junit.Assert.*;

public class IterationTest {

        Iteration lp = new Iteration();

        @Test

        public void loop() {
            int result = lp.PrintLoop(7);
            assertEquals(1, result);
        }
}



