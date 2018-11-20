package CaseStudies;

/**
 Case Study 5.11.1: Finding the Greatest Common Divisor
 The greatest common divisor (gcd) of the two integers 4 and 2 is 2. The greatest common divisor of the two integers 16
 and 24 is 8. How would you write this program to find the greatest common divisor? Would you immediately begin to write
 code? No. It is important to think before you code. Thinking enables you to generate a logical solution for the problem
 without concern about how to write the code.
 Let the two input integers be n1 and n2. You know that number 1 is a common divisor, but it may not be the greatest
 common divisor. Therefore, you can check whether k (for k = 2,3,4, and so on) is a common divisor for n1 and n2, until k
 is greater than n1 or n2. Store the common divisor in a variable named gcd. Initially gcd is 1. Whenever a new common
 divisor is found, it becomes the new gcd. When you have checked all the possible common divisors from 2 up to n1 or n2,
 the value in variable gcd is the greatest common divisor.
 Once you have a logical solution, ype the code to translate the solution into a Java program as follows:
 int gcd = 1; // initial gcd is 1
 int k = 2; // Possible gcd

 while (k <= n1 && k <= n2) {
 if (n1 % k == 0 && n2 % k == 0) {
 gcd = k; //update gcd
 }
 k++; //Next possible gcd
 }
 // After the loop, gcd is the greatest common divisor for n1 and n2

 Listing 5.9 presents the program that prompts the user to enter two positive integers and finds their greatest common
 divisor.
 */
import java.util.Scanner;

public class CaseStudy5_11_1 {
    /** Main Method*/
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        int gcd = 1; // Initial gcd is 1
        int k = 2; //Possible gcd
        while (k <= n1 && k <= n2) {
            if (n1 % k ==0 && n2 % k ==0) {
                gcd = k; //Update gcd
            }
            k++;
        }
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
}
