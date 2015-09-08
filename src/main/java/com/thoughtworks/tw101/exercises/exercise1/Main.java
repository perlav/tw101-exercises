package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {

        // Variable for total sum of the odd numbers in the 1-100 range.
        int sum = 0;

        //Range being considered from 1 to 100.
        for(int i=1; i<101; i++){
            //Use of modular arithmetic to identify odd numbers.
            if (i%2 == 1){
                sum += i;
                System.out.println(i);
            }
        }

        System.out.println("Sum:"+sum);

    }
}
