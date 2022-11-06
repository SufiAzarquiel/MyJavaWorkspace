package com.github.sufiazarquiel.myjavaworkspace.buclejercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit-level testing for {@link bucles5} object.
 */
public class bucles6Test {
    @Test
    void testPower() {
        bucles6.input = "2\n" + "4\n";
        assertEquals(16, bucles6.power());
        bucles6.input = "2\n" + "0\n";
        assertEquals(1, bucles6.power());
        bucles6.input = "3\n" + "-1\n";
        assertEquals(0.33, bucles6.power());
    }
}
