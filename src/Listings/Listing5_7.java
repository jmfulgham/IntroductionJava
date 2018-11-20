package Listings;

/**
 Listing 5.7: Presents a program that uses nested for loops to display a multiplication table.
 The program displays a title on the first line in the output. The firs for loop displays the number 1-9 on the second
 line. A dashed(-) line is displayed on the third line.
 The next loop is a nested for loop with the control variable i in the outer loop and k in the inner loop. for each i,
 the product i * k is displayed on a line in the inner loop, with k being 1,2,3,...,9.
 */

public class Listing5_7 {
    /** Main Method*/
    public static void main(String[] args) {
        System.out.println("         Multiplication Table");

        // Display the number title
        System.out.print("    ");
        for (int j = 1; j <= 9; j++) {
            System.out.print("   " + j);
        }
        System.out.println("\n-----------------------------------------");

        // Display table body
        for (int i = 1; i <= 9; i++) {

            System.out.print(i + " | ");
            for (int k = 1; k <=9; k++) {
                //display the product and align properly
                System.out.printf("%4d", i*k);
            }
            System.out.println();
        }
    }
}
