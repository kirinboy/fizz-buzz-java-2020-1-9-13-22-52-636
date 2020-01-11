package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class when_number_is_a_multiple_of_two_numbers_of_3_5_7 {
    @Test
    public void should_fizzbuzz_for_60() {
        assertEquals("FizzBuzz", new Game().fizzBuzz(60));
    }

    @Test
    public void should_buzzwhizz_for_140() {
        assertEquals("BuzzWhizz", new Game().fizzBuzz(140));
    }

    @Test
    public void should_fizzwhizz_for_21() {
        assertEquals("FizzWhizz", new Game().fizzBuzz(21));
    }
}
