package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class when_number_contains_character_7 {
    @Test
    public void should_return_fizz_for_75() {
        assertEquals("Fizz", new Game().fizzBuzz(75));
    }
}
