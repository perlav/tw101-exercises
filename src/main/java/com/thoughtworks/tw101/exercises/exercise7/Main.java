package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Scanner;
// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.
// Integer.parseInt is a good way to convert user input into an Integer.

public class Main {

    public static void main(String[] args) {

        int randomNum = RandomNumGenerator.getRandomNum();

        System.out.println("Please enter your guess.");
        int guess = UserInput.readInput();

        while (guess != randomNum){
            if((guess > randomNum) && (guess > 0)){
                System.out.println("Please try again, you guessed too high.");
            }
            else if ((guess < randomNum) && (guess > 0)){
                System.out.println("Please try again, you guessed too low.");
            }
            guess = UserInput.readInput();
        }


        System.out.println("Congratulations, you guessed correctly!");

    }
}
