package Listings;

/**
 * Listing 6.4 Increment.java
 * The value of x(1) is passed to the parameter n to invoke the increment method. The paramter is incremented by 1 in the
 * method, but x is not changed no matter what the method does.
 */

public class Listing6_4 {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the call, x is " + x);
        increment(x);
        System.out.println("After the call, x is " + x);
    }
    public static void increment(int n) {
        n++;
        System.out.println("n inside the method is " + n);
    }
}
