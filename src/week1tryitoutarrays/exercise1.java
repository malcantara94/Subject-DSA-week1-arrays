/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week1tryitoutarrays;

/**
 *
 * @author Mark
 */
public class exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Exercise 1: Write a Java program that sums the array's values with the following 
        //elements: 25, 4, 16, 9, 10.
        
        int[] elements = {25,4,16,9,10};
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum += elements[i];
        }
        System.out.println(sum);
        
    }
    
}
