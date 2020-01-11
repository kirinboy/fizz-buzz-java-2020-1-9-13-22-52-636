package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class when_number_is_not_related_with_3_5_7 {
    @Test
    public void should_return_number() {
        assertEquals("1", new Game().fizzBuzz(1));
    }
}
