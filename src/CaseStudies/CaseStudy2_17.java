package CaseStudies; /**
 Case Study 2.17: Counting Monetary Units
 This section presents a program that breaks a large amount of money into smaller units.
 Suppose you want to develop a program that changes a given amount of money into smaller monetary units.
 The program lets the user enter an amount as a double value representing a total in dollars and cents, and outputs a
 report listing the monetary equivalent in the maximum number of dollars, quarters, dimes, nickels, and pennies in this
 order, to the result in the minimum number of coins.
 Here are the steps in developing the program:
 1. Prompt the user to enter the amount as a decimal number, such as 11.56.
 2. Convert the amount (e.g. 11.56) into cents (1156).
 3. Divide the cents by 100 to find the number of dollars. Obtain the remaining cents using the cents remainder 100.
 4. Divide the remaining cents by 25 to find the number of quarters. Obtain the remaining cents using the remainder 25.
 5. Divide the remaining cents by 10 to find the number of dimes. Obtain the remaining cents using the remainder 10.
 6. Divide the remaining cents by 5 to find the number of nickels. Obtain the remaining cents using the remainder 5.
 7. the remaining cents are the pennies.
 8. Display the result.
 */
import java.util.Scanner;

public class CaseStudy2_17 {
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Receive the dollar amount
        System.out.print("Please enter in the dollar amount with the cents: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);
        //Find the number of one dollars
        int numberOfDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        //Find the number of quarters in the remaining amount.
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        //Find the number of dimes in the remaining amount.
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        //Find the number of nickels in the remaining amount.
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        //Find the number of pennies in the remaining amount.
        int numberOfPennies = remainingAmount;

        //Display the Results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}
