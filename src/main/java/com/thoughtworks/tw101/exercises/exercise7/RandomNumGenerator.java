package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by PerlaIvetteVillarreal on 9/11/15.
 */
public abstract class RandomNumGenerator {

    public static int getRandomNum(){
        System.out.println("System has generated a random number between 1 and 100.");
        return (int) ((Math.random() * 100) + 1);
    }
}
