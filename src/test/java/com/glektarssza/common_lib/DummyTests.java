package com.glektarssza.common_lib;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DummyTests {
    @Test
    public void testGetMessageReturnsRightValue() {
        // -- Given

        // -- When
        String result = Dummy.getMessage();

        // -- Then
        Assertions.assertThat(result).isEqualTo("Hello, world!");
    }
}
