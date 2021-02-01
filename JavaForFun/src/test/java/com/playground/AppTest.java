package com.playground;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.Random;

public class AppTest {

    @Test
    public void testRandomValuesGenerator() {
        for (int i = 0; i < 10; i++) {
            System.out.println(new Random().nextInt(5) + 1);
        }
    }

    @Test
    public void testArithmeticOperations() {
        assertEquals(1, 4 /3);
    }
}
