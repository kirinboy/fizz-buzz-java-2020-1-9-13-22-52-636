package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    public void should_return_fizz_for_3() {
        assertEquals("Fizz", new Game().fizzBuzz(3));
    }

    @Test
    public void should_return_fizz_for_6() {
        assertEquals("Fizz", new Game().fizzBuzz(6));
    }

    @Test
    public void should_return_buzz_for_5() {
        assertEquals("Buzz", new Game().fizzBuzz(5));
    }

    @Test
    public void should_return_buzz_for_10() {
        assertEquals("Buzz", new Game().fizzBuzz(5));
    }

    @Test
    public void should_return_whizz_for_7() {
        assertEquals("Whizz", new Game().fizzBuzz(7));
    }

    @Test
    public void should_return_whizz_for_14() {
        assertEquals("Whizz", new Game().fizzBuzz(14));
    }
}
