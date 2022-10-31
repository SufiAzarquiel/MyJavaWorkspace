package com.github.sufiAzarquiel.myjavaworkspace;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit-level testing for {@link hello} object.
 */
public class helloTest {

    @Test
    public void shouldCreateMyWorkspaceMain() {
        hello main = new hello();
        Assertions.assertNotNull(main);
    }

}
