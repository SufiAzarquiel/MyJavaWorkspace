package com.github.sufiazarquiel.myjavaworkspace.buclejercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit-level testing for {@link bucles8} object.
 */
public class bucles8Test {
    @Test
    void testEsPrimo() {
        assertEquals(false, bucles8.esPrimo(1));
        assertEquals(true, bucles8.esPrimo(5));
        assertEquals(false, bucles8.esPrimo(4));
        assertEquals(true, bucles8.esPrimo(41));
        assertEquals(false, bucles8.esPrimo(75));
    }

    @Test
    void testFactores() {
        List<Integer> tstList = new ArrayList<Integer>();

        tstList.add(2);
        tstList.add(5);
        assertEquals(tstList, bucles8.factores("10\n"));
        
        tstList.removeAll(tstList);
        tstList.add(2);
        tstList.add(3);
        tstList.add(3);
        assertEquals(tstList, bucles8.factores("18\n"));
    }
}
