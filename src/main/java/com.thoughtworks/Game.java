package com.thoughtworks;

public class Game {
    public String fizzBuzz(int number) {
        String numberString = Integer.toString(number);
        if (numberString.contains("7") && number % 3 == 0)
            return "Fizz";
        if (numberString.contains("5")){
            if (number % 7 == 0)
                return "BuzzWhizz";
            return "Buzz";
        }
        if (numberString.contains("3"))
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
        if (number % 7 == 0)
            return "Whizz";
        return numberString;
    }

    public static void main(String[] args) {
        for( int i = 0; i < 120; i++) {
            String result = new Game().fizzBuzz(i+1);
            System.out.println(result);
        }
    }
}
