package CaseStudies; /**
 4.5.2 Case Study: Converting a Hexadeciml Digit to a Decimal Value
 The hexadecimal number system has 16 digits: 0-9, A-F. The letters A, B, C. D, E, and F correspond to the decimal
 numbers 10, 11, 12, 13, 14, and 15. We now write a program that prompts the user to enter a nex digit and display its
 corresponding decimal decimal value.
 */
import java.util.Scanner;

public class CaseStudy4_5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();

        //Check if the hex string has exactly one character
        if (hexString.length() !=1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }

        //Display decimal value for the hex digit
        char ch = Character.toUpperCase(hexString.charAt(0));
        if ('A' <= ch && ch <= 'F') {
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit " + ch + " is " + value);
        } else if (Character.isDigit(ch)){
            System.out.println("The decimal value for hex digit" + ch + " is " + ch);
        } else {
            System.out.println((ch + " is an invalid input"));
        }
    }
}