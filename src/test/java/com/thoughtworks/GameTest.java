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
}
