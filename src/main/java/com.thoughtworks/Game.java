package com.thoughtworks;

public class Game {
    public String fizzBuzz(int number) {
        if (Integer.toString(number).contains("3"))
            return "Fizz";
        if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0)
            return "FizzBuzzWhizz";
        if (number % 3 == 0 && number % 5 == 0)
            return "FizzBuzz";
        if (number % 5 == 0 && number % 7 == 0)
            return "BuzzWhizz";
        if (number % 3 == 0 && number % 7 == 0)
            return "FizzWhizz";
        if (number % 3 == 0)
            return "Fizz";
        if (number % 5 == 0)
            return "Buzz";
        return "Whizz";
    }
}
