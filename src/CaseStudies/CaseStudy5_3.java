package CaseStudies;

/**
 5.3 Case Study: Guessing Number
 This case study generates a random number and lets the user repeatedly guess a number until it is correct.
 The problem is to guess what number a computer has in mind. You will write a program that randomly generates an integer
 between 0 and woo, inclusive. The program prompts the user to enter a number continuously until the number matches the
 randomly generated number. For each user input, the program tells the user whether the input is too low or too high, so
 the user can make the user whether the input is too low or too high, so the user can make the next guess intelligently.
 The magic number is between 0 and 100. To minimize the number of guesses, enter 50 first, if your guess is too high,
 the magic number is between 0 and 49. If your guess is too low, the magi number si between 51 and 100. Thus, you can
 eliminate half of the numbers from further consideration.
 How do you write this program? Do you immediately begin coding? No. It is important to think before coding. Think how
 you would solve the problem without writing a program. You need to first generate a random number 0 and 100, inclusive,
 then to prompt the user to enter a guess, then to compare the guess with the random number.It is a good practice to code
 incrementally one step at a time. For programs involving loops, if you don't know how to write a loop right away, you may
 first write the code in a loop.
 */

import java.util.Scanner;

public class CaseStudy5_3 {
    public static void main(String[] args) {
        //Generate a random number to be guessed
        int number = (int)(Math.random() *101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");
        int guess = -1;
        while(guess != number) {
            //Prompt the user to guess the number
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();

            if (guess == number) {
                System.out.println("Yes, the number is " + number);
            } else if (guess > number) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Your guess is too low");
            }
        } //End of loop
    }
}