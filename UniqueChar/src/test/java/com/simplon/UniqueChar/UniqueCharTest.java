package com.simplon.UniqueChar;

import com.simplo.UniqueChar.UniqueChar;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueCharTest {

    @Test
    public void Test(){
        // set
        UniqueChar testchar = new UniqueChar();

        // test
        String result = testchar.is_unique("abcdefg");

        // assert
        assertEquals("OK",result);

        // test
        result = testchar.is_unique("abcdafg");

        // assert
        assertEquals("OK",result);
    }
}
