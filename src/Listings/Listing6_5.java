package Listings;

/**
 * Listing 6.5: TestPassByValue.java
 * Listing 6.5 gives another program that demonstrates the effect of passing by value. The program creates a method for
 * swapping two variables. The swap method is invoked by passing two arguments. Interestingly, the values of the arguments
 * are not changed after the method is invoked.
 */

public class Listing6_5 {
    /** Main method*/
    public static void main(String[] args) {
        //Declare and initialize variables
        int num1 = 1;
        int num2 = 2;

        System.out.println("before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);

        //Invoke the swap method to attempt to swap two variables
        swap(num1, num2);

        System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
    }

    /** Swap two variables */
    public static void swap(int n1, int n2) {
        System.out.println("\tInside the swap method");
        System.out.println("\t\tBefore swapping, n1 is " + n1 + " and n2 is " + n2);

        // Swap n1 with n2
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("\t\tAfter swapping, n1 is " + n1 + " and n2 is " + n2);
    }
}
