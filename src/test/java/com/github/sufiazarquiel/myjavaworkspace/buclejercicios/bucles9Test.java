package com.github.sufiazarquiel.myjavaworkspace.buclejercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit-level testing for {@link bucles9} object.
 */
public class bucles9Test {
    @Test
    void testDecToBin() {
        assertEquals("10010", bucles9.decToBin("18\n"));
        assertEquals("101100101", bucles9.decToBin("357\n"));
    }
}
