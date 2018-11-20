package Listings;

/**
 * Listing2_6: FahrenheitToCelsius.java
 */

import java.util.Scanner;
public class Listing2_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        //Convert Fahrenheit to Celsius
        double celsius = (5.0/9) * (fahrenheit - 32);
        System.out.println("Fahrenheit "  + fahrenheit);
    }
}
