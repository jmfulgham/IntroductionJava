package Listings;

/**
 * Listing 2.3: ComputeAverage
 * Listing 2.3 gives an example of reading multiple inputs from the keyboard. The program reads three numbers and displays
 * their average.
 */

import java.util.Scanner;

public class Listing2_3 {
    public static void main(String[] args) {
        //Create Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter three numbers
        System.out.println("Enter three numbers: ");
        System.out.print("Enter in the first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter in the second number: ");
        double number2 = input.nextDouble();
        System.out.print("Enter in the third number: ");
        double number3 = input.nextDouble();
        String string = input.next();
        //Compute average
        double average = (number1 + number2 + number3)/ 3;

        double x = 34.782;
        int xInt = (int) x;
        System.out.println(xInt);
        //Display results
        System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);

    }
}
