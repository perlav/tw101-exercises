package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. **Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable. **This was done as part of Exercise 7 without realization of the
// requirement in Exercise 8 - will simply be transferred over.


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int randomNum = RandomNumGenerator.getRandomNum();
        ArrayList<Integer> guesses = new ArrayList<>();

        System.out.println("Please enter your guess.");
        int guess = UserInput.readInput();
        guesses.add(guess);

        while (guess != randomNum){
            if((guess > randomNum) && (guess > 0)){
                System.out.println("Please try again, you guessed too high.");
            }
            else if ((guess < randomNum) && (guess > 0)){
                System.out.println("Please try again, you guessed too low.");
            }
            guess = UserInput.readInput();
            if(guess != -1){
                guesses.add(guess);
            }

        }

        System.out.println("Congratulations, you guessed correctly!");
        System.out.println("These were your guesses:");
        for(int g: guesses){
            System.out.println("" + g);
        }
    }
}
