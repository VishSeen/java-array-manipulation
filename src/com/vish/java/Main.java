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
    private static String[] arrayWords;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println(" ");

        System.out.println("-----------------------------------------------------");
        System.out.println(" Program to get inputs depending on how many you need ");
        System.out.println("-----------------------------------------------------");
        System.out.println("");

        System.out.print("Enter number of inputs you want : ");
        int numOfInputs = scanner.nextInt();

        System.out.println(" ");

        System.out.println("Adding words... ");
        addInputs(numOfInputs);

        System.out.println(" ");


        System.out.print("Displaying added items : ");

        for (String names : getInputs()){
            System.out.print(names + " ");
        }

        System.out.println(" ");
        System.out.println(" ");

        System.out.print("Enter number to get specific element :");
        int index = scanner.nextInt();

        System.out.print("Item at " + index + " is : " + getNthInput(index));
        System.out.println(" ");
    }




    /* Manipulate the input */

    /**
     * Adds words to the array depending on the numOfInputs available
     * @param numOfInputs desired by the user / need to fetch the words
     */
    public static void addInputs(int numOfInputs){
        String word;
        arrayWords = new String[numOfInputs];

        for (int i = 0; i < numOfInputs; i++){
            System.out.print("Enter name : ");
            word = scanner.next();

            arrayWords[i] = word;
        }
    }

    /**
     * Retrieve all words from array.
     * @return Words from array if array != 0 (empty)
     */
    public static String[] getInputs(){
        if (arrayWords.length != 0){
            return arrayWords;
        }

        return null;
    }


    /**
     * Gets the element at the Nth value.
     * @param index specifies position to retrieve element
     * @return element from array if array >= numOfInputs
     */
    public static String getNthInput(int index){
        if (arrayWords.length >= index){
            return arrayWords[index];
        }

        return "No such index..";
    }
}
