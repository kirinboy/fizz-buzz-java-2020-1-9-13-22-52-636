package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class when_number_is_a_multiple_of_two_numbers_of_3_5_7 {
    @Test
    public void should_fizzbuzz_for_60() {
        assertEquals("FizzBuzz", new Game().fizzBuzz(60));
    }
}
