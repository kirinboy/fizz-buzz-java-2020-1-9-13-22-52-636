package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    public void should_return_fizz_for_3() {
        assertEquals("fizz", new Game().fizzBuzz(3));
    }

    @Test
    public void should_return_fizz_for_6() {
        assertEquals("fizz", new Game().fizzBuzz(6));
    }

    @Test
    public void should_return_buzz_for_5() {
        assertEquals("buzz", new Game().fizzBuzz(5));
    }

    @Test
    public void should_return_buzz_for_10() {
        assertEquals("buzz", new Game().fizzBuzz(5));
    }

    @Test
    public void should_return_whizz_for_7() {
        assertEquals("whizz", new Game().fizzBuzz(7));
    }

    @Test
    public void should_return_whizz_for_14() {
        assertEquals("whizz", new Game().fizzBuzz(14));
    }
}
