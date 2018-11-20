package Listings;
/**
 Listing 5.12: Test Break
 This presents a program to demonstrate the effect ofn using break in a loop.
 The program adds integers from 1 to 20 in this order to sum until sum is greater than or equal to 100. Without the if
 statement, the program calculates the sum of the numbers 1 to 20. However, with the if statement, the loop terminates
 when sum becomes greater than or equal to 100. Without the if statement, the output would be as follows:
 The number is 20
 The sum is 210
 */

public class Listing5_12 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100) {
                break;
            }
        }
        System.out.println("The number is  " + number);
        System.out.println("The sum is " + sum);
    }
}
