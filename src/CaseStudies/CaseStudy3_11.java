package CaseStudies; /**
 3.11 Case Study: Determining Leap Year
 A year is a leap year if it is divisible by 4 but not by 100, or if it is divisible by 400.
 A leap year has 366 days. The February of a leap year has 29 days. You can use the following Boolean expressions to check whether a year is a leap year:
 //A leap year is divisible by 4
 boolean isLeapYear = (year % 4 == 0);

 //A leap year is divisible by 4 but not by 100
 isLeapYear = isLeapYear && (year % 100 != 0);

 //A leap Year is divisible by 4 but not by 100 or divisible by 400
 isLeapYear = isLeapYear || (year % 400 == 0);

 Or you can combine all these expressions into one as follows:
 isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
 Listing 3.7 gives the program that lets the user enter a year and checks whether it is a leap year.

 */
import java.util.Scanner;

public class CaseStudy3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter in a year: ");
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println(year + " is a leap year? " + isLeapYear);
    }
}
