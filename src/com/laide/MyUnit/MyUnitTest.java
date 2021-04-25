package com.laide.MyUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyUnitTest {
    MyUnit myUnit = new MyUnit();

    @Test
    public void testConcatenate() {

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }

    @Test
    public void testAdd() {
        int result = myUnit.add(1, 2);
        assertEquals(3, result);

    }
}
