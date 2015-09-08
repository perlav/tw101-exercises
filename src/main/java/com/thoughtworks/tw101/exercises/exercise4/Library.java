package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public String printBooksContaining(String partialBookTitle) {
        //Print statement added to create clarity in output stream
        printStream.append("Books Containing: "  + partialBookTitle + "\n");

        for (String bookTitle : books){
            if (bookTitle.contains(partialBookTitle)){
                printStream.append(bookTitle + "\n");
            }
        }
        printStream.append("\n");
        return printStream.toString();
    }
}
