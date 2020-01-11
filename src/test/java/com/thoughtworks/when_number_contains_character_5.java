package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class when_number_contains_character_5 {
    @Test
    public void should_return_buzz_for_15() {
        assertEquals("Buzz", new Game().fizzBuzz(15));
    }
}
