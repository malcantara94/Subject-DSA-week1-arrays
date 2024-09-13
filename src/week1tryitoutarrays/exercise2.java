/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1tryitoutarrays;

import java.util.Scanner;

/**
 *
 * @author Mark
 */
public class exercise2 {

    public static void main(String[] args) {
        // Exercise 2: Write a Java program to test if an array contains a specific value.
        // Create an array with five elements.
        
        int[] array = {1, 2, 3, 4, 5};
        boolean valueMatches = false;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer to check: ");
        String userInput = scanner.nextLine();
        
        int valueToCheck;
        try {
            valueToCheck = Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.close();
            return; // Exit the program if input is invalid
        }
        
        // Check if the value exists in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToCheck) {
                valueMatches = true;
                break;
            }
        }
        
        // Output the result
        if (valueMatches) {
            System.out.println("The value " + valueToCheck + " is in the array.");
        } else {
            System.out.println("The value " + valueToCheck + " is not in the array.");
        }
        
        // Close the scanner
        scanner.close();
    }
}


