package com.thoughtworks.tw101.introductory_programming_exercises;


public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {

        for(int i=1; i<n+1; i++){
            String output = "";
            int asterisks = (i-1)*2 +1;
            int spaces = n-i;

            for(int j=0; j<spaces; j++){
                output+=" ";
            }
            for (int k=0;k<asterisks; k++){
                output+="*";
            }
            for(int l=0; l<spaces; l++ ){
                output+=" ";
            }
            System.out.println(output);
        }

    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);

        for(int i=n-1; i>0; i--){
            String output = "";
            int asterisks = (i-1)*2 +1;
            int spaces = n-i;

            for(int j=0; j<spaces; j++){
                output+=" ";
            }
            for (int k=0;k<asterisks; k++){
                output+="*";
            }
            for(int l=0; l<spaces; l++ ){
                output+=" ";
            }
            System.out.println(output);
        }


    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        //Top of diamond
        for(int i=1; i<n; i++){
            String output = "";
            int asterisks = (i-1)*2 +1;
            int spaces = n-i;

            for(int j=0; j<spaces; j++){
                output+=" ";
            }
            for (int k=0;k<asterisks; k++){
                output+="*";
            }
            for(int l=0; l<spaces; l++ ){
                output+=" ";
            }
            System.out.println(output);
        }

        //Printing out my name with appropriate spaces
        int lengthOfString = (n-1)*2 +1;
        String name = "PERLA";
        String nameOut= "";

        if(lengthOfString <= name.length()){
            System.out.println(name);
        }

        else{
            int spaces = (lengthOfString - name.length())/2;
            for(int i=0; i<spaces; i++){
                nameOut += " ";
            }
            nameOut+= name;
            for(int i=0; i<spaces; i++){
                nameOut += " ";
            }
            System.out.println(nameOut);

        }

        //Bottom of Diamond
        for(int i=n-1; i>0; i--){
            String output = "";
            int asterisks = (i-1)*2 +1;
            int spaces = n-i;

            for(int j=0; j<spaces; j++){
                output+=" ";
            }
            for (int k=0;k<asterisks; k++){
                output+="*";
            }
            for(int l=0; l<spaces; l++ ){
                output+=" ";
            }
            System.out.println(output);
        }

    }
}
