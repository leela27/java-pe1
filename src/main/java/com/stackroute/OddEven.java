package com.stackroute;
import java.lang.String;

    public class OddEven {
        public  String checkOddEven(int num)
        {
            if(num >20 && num <30)
            {
                if(num%2==0)
                    return "Jerry";
                else
                    return "Tom";
            }
            else	{
                return "Invalid number";
            }
        }
    }



