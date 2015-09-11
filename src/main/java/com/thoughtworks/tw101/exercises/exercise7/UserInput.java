package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Scanner;

/**
 * Created by PerlaIvetteVillarreal on 9/11/15.
 */
public class UserInput {

    private static Scanner in = new Scanner(System.in);

    public static int readInput(){
        String input = in.next();
        try{
            int out = Integer.parseInt(input);
            return out;
        }
        catch (NumberFormatException e){
            System.out.println("Please enter an integer between 1 and 100.");
            return -1;
        }

    }

}
