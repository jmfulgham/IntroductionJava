package CaseStudies;

/**
 Case Study 5.11.3: Converting Decimals to Hexadecimals
 Hexadecimals are often used in computer systems programming. How do you convert a decimal number to a hexadecimal number?
 To convert a decimal number d to a hexadecimal number is to find the hexadecimal digits h(n), h(n-1), h(n-2),..., h2, h1
 and h0 such that
 d = hn * 16^n + h(n-1) * 16^(n-1) + ... + h1 * 16^1 + h0 * 16^0
 These hexadecimal digits can be found by successively dividing d by 16 until the quotient is 0. The remainders are h0, h1,
 h2,..., h(n-2), h(n-1), hn. The hexadecimal digits include the decimal digits 0,1,2,3,4,5,6,7,8, and 9, plus A, which is
 the decimal value 10; B, which is the decimal value 11; C, which is 12; D which is 13; E, which is 14; and F, which is
 15.For example, the decimal number 123 is 7B in hexadecimal. The conversion is done as follows. Divide 123 by 16. The
 remainder is 11 (B in hexadecimal) and the quotient is 7. Continue to divide 7 by 16.  The remainder is 7 and the
 quotient is 0. Therefore, 7B is the hexadecimal number for 123.
 Listing 5.11 gives a program that prompts the user to enter a decimal number and convert it into a hex number as a string.
 The program prompts the user to enter a decimal integer, converts it to a hex number as a string, and displays the result.
 To convert a decimal to a hex number, the program uses a loop to successively divide the decimal number by 16 and obtain
 its remainder. The remainder is converted into a hex character. The character is then appended to the hex string. the hex
 string is initially empty. Divide the decimal number by 16 to remove a hex digit from the number. The loop ends when the
 remaining decimal becomes 0.The program converts a hexValue between 0 and 15 into a hex character. If the hexValue is
 between 0 and 9, it is converted to (char)(hexValue + '0'). Recall that when adding a character with an integer, the
 character's unicode is used in the evaluation.
 */
import java.util.Scanner;

public class CaseStudy5_11_3 {
    /** Main Method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a decimal integer
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();

        //Convert decimal to hex
        String hex = "";

        while (decimal != 0) {
            int hexValue = decimal % 16;

            //Convert a decimal value to a hex digit
            char hexDigit = (0 <= hexValue && hexValue <= 9) ? (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');

            hex = hexDigit + hex;
            decimal = decimal / 16;
        }
        System.out.println("The hex number is " + hex);
    }
}
