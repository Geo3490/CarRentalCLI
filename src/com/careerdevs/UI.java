package com.careerdevs;


import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {

    public static Scanner scanner = new Scanner(System.in);

    public static int readInt(String question, int min, int max) {

//        try{
//
//        } catch (InputMismatchException exception){
//
//        }


        System.out.println(question);
        System.out.print("Number(" + min + " - " + max + "): ");
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        }
        System.out.println("Number outside valid range, try again");
        return readInt(question, min, max);
    }
}
