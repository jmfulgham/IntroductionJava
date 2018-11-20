package Listings;

/**
 * Listing 6.9: TestMethodOverloading.java
 * Listing 6.9 is a program that creates three methods. The first finds the maximum integer, the second finds the maximum
 * double, and the third finds the maximum among three double values. All three methods are named max.
 */

public class Listing6_9 {
    /** Main method */
    public static void main(String[] args) {
        //Invoke the max method with int parameters
        System.out.println("The maximum of 3 and 4 is " + max(3,4));

        //Invoke the max method with te double parameters
        System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0,5.4));

        //Invoke the max method with three double parameters
        System.out.println("The maximum of 3.0, 5.4, and 10.14 is " + max(3.0, 5.4, 10.14));
    }
    /** Return the max of two int values */
    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    /** Find the max of two double values */
    public static double max(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    /** Return the max of three double value */
    public static double max(double num1, double num2, double num3) {
        return max(max(num1, num2) , num3);
    }
}
/**
 * When calling max(3,4), the max method for finding the maximum of two integers is invoked. When calling max(3.0, 5.4, 10.14),
 * the max method for finding the maximum of three double values is invoked. Can you invoke the max method with an int value
 * and a double value, such as max(2, 2.5)? If so, which of the max methods is invoked? The answer to the first question
 * is yes. The answer to the second question is that the max method for finding the maximum of two double values is invoked.
 * The argument value 2 is automatically converted into a double value and passed to this method. YOu may be wondering
 * why the method max(double, double) is not invoked for the call max(3,4). Both max(double, double) and max(int, int)
 * are possible matches for max(3,4). The Java compiler finds the method that best matches a method invocation.
 */