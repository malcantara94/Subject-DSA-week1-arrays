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
public class exercise3 {
        public static void main(String[] args) {

/** Write a Java program that creates an array of 5 integers and prompts the user to enter 
    5 integer values to fill the array. 
    The program should then find the sum of all the elements in the array and print the result.
*/
 
    int[] arr = new int[5]; // create an integer array with five elements
    Scanner input = new Scanner(System.in); // create a Scanner object to get user input
    System.out.println("Enter five integer values to fill the array:");
    
    // prompt the user to enter 5 integer values to fill the array
    for (int i = 0; i < arr.length; i++) {
        System.out.print("Enter value #" + (i+1) + ": ");
        arr[i] = input.nextInt();
    }
    
    int sum = 0; // initialize a variable to hold the sum of the array's values
    // use a for loop to iterate through each element of the array and add it to the sum
    for (int i = 0; i < arr.length; i++) {
    
    sum += arr[i];
    }
    
    System.out.println("The sum of the array's values is: " + sum); // print the sum of the array's values

    
    
}
    
}
