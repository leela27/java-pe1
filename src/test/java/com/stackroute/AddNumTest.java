package com.stackroute;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
    public class AddNumTest {
        @Test
        public void Numberstest(){
            AddNum nb=new AddNum();
            int result=nb.Numbers(4, new int[]{28, 10, 1, 6});
            assertEquals(45,result);
        }
    }

