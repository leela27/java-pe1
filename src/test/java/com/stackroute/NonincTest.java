package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

    public class NonincTest {

        @Test

        public void NonIncr()
        {
            Noninc obj = new Noninc();
            int result = obj.order(234534);
            assertEquals(544332,result);
        }
    }

