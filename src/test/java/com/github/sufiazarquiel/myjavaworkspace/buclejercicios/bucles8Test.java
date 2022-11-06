package com.github.sufiazarquiel.myjavaworkspace.buclejercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * Unit-level testing for {@link bucles8} object.
 */
public class bucles8Test {
    @Test
    void testEsPrimo() {
        assertEquals(false, bucles8.esPrimo(1));
        assertEquals(true, bucles8.esPrimo(7));
        assertEquals(false, bucles8.esPrimo(4));
        assertEquals(true, bucles8.esPrimo(41));
        assertEquals(false, bucles8.esPrimo(75));
    }

    @Test
    void testFactores() {
        assertNotNull(bucles8.factor);
    }
}
