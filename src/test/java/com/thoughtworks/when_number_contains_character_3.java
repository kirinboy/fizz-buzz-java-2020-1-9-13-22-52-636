package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class when_number_contains_character_3 {
    @Test
    public void should_fizz_for_13() {
        assertEquals("Fizz", new Game().fizzBuzz(13));
    }

    @Test
    public void should_fizz_for_30() {
        assertEquals("Fizz", new Game().fizzBuzz(13));
    }
}
