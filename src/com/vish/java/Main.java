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
    private static int index;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println(" ");

        System.out.println("-----------------------------------------------------");
        System.out.println(" Program to get inputs depending on how many you need ");
        System.out.println("-----------------------------------------------------");
        System.out.println("");

        System.out.print("Enter number of inputs you want : ");
        numOfInputs = scanner.nextInt();

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
        index = scanner.nextInt();

        System.out.print("Item at " + index + " is : " + getNthInput(index));

    }




    /* Manipulate the input */
    public static void addInputs(int numOfInputs){
        String word;
        arrayWords = new String[numOfInputs];

        for (int i = 0; i < numOfInputs; i++){
            System.out.print("Enter name : ");
            word = scanner.next();

            arrayWords[i] = word;
        }
    }

    public static String[] getInputs(){
        if (arrayWords.length != 0){
            return arrayWords;
        }

        return null;
    }

    public static String getNthInput(int index){
        if (arrayWords.length >= index){
            return arrayWords[index];
        }

        return "No such index..";
    }

}
