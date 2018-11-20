package Listings;

/**
 * Listing 6.1 TestMax.java
 * Listing 6.1 presents a complete program that is used to test the max method.
 */

public class Listing6_1 {
    /**Main Method*/
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i,j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }
    /**Return the max of two numbers*/
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }
}
