package com.vish.java;

import java.util.Scanner;

/**
 * A simple logic to get input from [numOfInputs] text areas.
 *
 * The programs loop through and add the words in a single array.
 * With that array we can slice different names and query their details from a database or so.
 *
 */

public class Main {
    private static Scanner scanner;
    private static int numOfInputs;
    private static String[] arrayWords;
    private static String allWords;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Enter number of inputs you want : ");
        numOfInputs = scanner.nextInt();

        System.out.println("Displaying all names:");
        for (String names : getInputs()){
            System.out.println(names);
        }

        System.out.println("Displaying names from back:");
        System.out.println(getWordsFromLast());

    }



    public static String[] getInputs(){
        arrayWords = new String[numOfInputs];
        String word;

        for(int i = 0; i < numOfInputs; i++){
            System.out.print("Enter name to add : ");
            word = scanner.next();

            arrayWords[i] = word;

            System.out.println("Added : " + arrayWords[i]);
            System.out.println(" ");
        }

        return arrayWords;
    }



    public static String[] getWordsFromLast(){
        if (arrayWords.length != 0){
            String[] singleString = new String[numOfInputs];

            for (int i = arrayWords.length - 1; i >= 0; i--){
                singleString[0] = arrayWords[i];
                return singleString;
            }
        }

        return null;
    }

}
