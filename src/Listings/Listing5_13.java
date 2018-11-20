package Listings;
/**
 Listing 5.13: test Continue
 This presents a program to demonstrate the effect of using continue in a loop.
 The program adds integers from 1 to 20 except 10 and 11 to sum. With the if statement in the program, the continue statement
 is executed when number becomes 10 or 11. the continue statement ends the current iteration so that the rest of the statement
 in the loop body is not executed; therefore, number is not added to sum when it is 10 or 11. Without the if statement in the
 program, the output would be as followsL
 The sum is 210
 In this case, all of the numbers are added to sum, even whn number is 10 or 11. Therefore, the result is 210, which is 21
 more than it was with the if statement.
 */

public class Listing5_13 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            if (number == 10 || number == 11) {
                continue;
            }
            sum += number;
        }
        System.out.println("The sum is " + sum);
    }
}