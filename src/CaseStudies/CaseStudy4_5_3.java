package CaseStudies;

/**
 4.5.3 Case Study: Revising the Lottery Program Using Strings
 The lottery program in Listing 3.8, generates a random two-digit number, prompts the user to enter a two-digit number,
 and determines whether the user wins according to the following rules:
 1. if the user input matches the lottery number in the exact order, the award is $10,000.00.
 2. If all the digits in the user input match all the digits in the lottery number, the award is $3,000.00.
 3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.00.
 The program in Listing 3.8 uses an integer to store the number. Listing 4.5 give a new program that generates a random
 two-digit string instead of a number, and receives the user input as a string instead of a number.
 */
import java.util.Scanner;

public class CaseStudy4_5_3 {
    public static void main(String[] args) {
        // Generate a lottery as a two-digit string
        String lottery = "" + (int)(Math.random()*10) + (int)(Math.random()*10);

        //Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        String guess = input.nextLine();

        // Get digits from lottery
        char lotteryDigit1 = guess.charAt(0);
        char lotteryDigit2 = guess.charAt(1);

        // Get digits from guess
        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        System.out.println("The lottery number is " + lottery);

        //Check the guess
        if (guess.equals(lottery)) {
            System.out.println("Exact match: you win $10,000");
        } else if (guessDigit2 == lotteryDigit1 && guessDigit2==lotteryDigit2) {
            System.out.println("Match all digits: you win $3,000");
        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) {
            System.out.println("match one digit: you win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
