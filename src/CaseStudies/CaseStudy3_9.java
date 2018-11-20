package CaseStudies; /**
 3.9 Case Study: Computing Taxes
 You can use nested if statements to write a program for computing taxes.
 The U.S. federal personal income tax is calculated based on filing status and taxable income.There are four filling
 statuses: single filers, married filing jointly or qualified widow(er), married filing separately, and head of household.
 The tax rates vary every year. Table 3.2 shows the rates for 2009. If you are single with a taxable income of $10,000,
 for example, the first $8350 is taxed at 10% and the other $1,650 at 15%, so your total tax is 1,082.50.
 Table 3.2 2009 U.S. Federal Personal Tax Rates


 You are to write a program to compute personal income tax. Your program should prompt the user to enter the filing
 status and taxable income and compute tax. Enter 0 for single filers, 1 for married filling jointly or qualified widow(er),
 2 for married filing separately, and 3 for head of household.
 Your program computes the tax for the taxable income based onf filing status. The filing status can be determined using
 if statements.
 if (status == 0) {
 //Compute tax for single filers
 } else if (status == 1) {
 //Compute tax for married filing jointly or qualifying widow(er)
 } else if (status == 2) {
 //Compute tax for married filing separately
 } else if (status == 3) {
 //Compute tax for head of household
 } else {
 //Display wrong status
 }
 For each filing status there are six tax rates. Each rate is applied to a certain amount of taxable income. For example,
 of a taxable income of $400,000 for single filers, $8350 is taxed at 10%, (33,950 -8350) at 15%, (82,250-33950) at 25%,
 (171,550 - 82,250) at 28%, (372,950-171,500) at 33%, and (400,000-372,950) at 35%.
 Listing 3.5,m gives the solution for computing taxes for single filers. The complete solution is left as an exercise.
 */
import java.util.Scanner;

public class CaseStudy3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tax Calculator");
        System.out.print("Please enter in your filing status: ");
        int status = input.nextInt();
        System.out.print("Please enter in your taxable income: ");
        double income = input.nextDouble();
        double tax = 0;

        if (status == 0) {
            //Compute tax for single filers
            if (income <= 8350) {
                tax = income * 0.10;
            } else if (income <= 33950) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            } else if (income <= 82250) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15 + (income - 33950) * 0.25;
            } else if (income <= 171550) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15 + (income - 33950) * 0.25 + (income - 82250) * 0.28;
            } else if (income <= 372950) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15 + (income - 33950) * 0.25 + (income - 82250) * 0.28 + (income - 171550) * 0.33;
            } else if (income <= 372951) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15 + (income - 33950) * 0.25 + (income - 82250) * 0.28 + (income - 171550) * 0.33 + (income - 372950) * 0.35;
            }
        } else if (status == 1) {
            //Compute tax for married filing jointly or qualifying widow(er)
            if (income <= 16700) {
                tax = income * 0.10;
            } else if (income <= 67900) {
                tax = 16700 * 0.10 + (income - 16700) * 0.15;
            } else if (income <= 137050) {
                tax = (16700 * 0.10) + ((income - 16700) * 0.15) + ((income - 67900) * 0.25);
            } else if (income <= 208850) {
                tax = 16700 * 0.10 + (income - 16700) * 0.15 + (income - 67900) * 0.25 + (income - 137050) * 0.28;
            } else if (income <= 372950) {
                tax = 16700 * 0.10 + (income - 16700) * 0.15 + (income - 67900) * 0.25 + (income - 137050) * 0.28 + (income - 208850) * 0.33;
            } else if (income <= 372951) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15 + (income - 33950) * 0.25 + (income - 82250) * 0.28 + (income - 171550) * 0.33 + (income - 372950) * 0.35;
            }
        } else if (status == 2) {
            //Compute tax for married filing separately
            if (income <= 8350) {
                tax = income * 0.10;
            } else if (income <= 33950) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            } else if (income <= 68525) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15 + (income - 33950) * 0.25;
            } else if (income <= 104425) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15 + (income - 33950) * 0.25 + (income - 68525) * 0.28;
            } else if (income <= 186475) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15 + (income - 33950) * 0.25 + (income - 68525) * 0.28 + (income - 104425) * 0.33;
            } else if (income <= 186476) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15 + (income - 33950) * 0.25 + (income - 68525) * 0.28 + (income - 104425) * 0.33 + (income - 186475) * 0.35;
            }
        } else if (status == 3) {
            //Compute tax for head of household
            if (income <= 11950) {
                tax = income * 0.10;
            } else if (income <= 45500) {
                tax = 11950 * 0.10 + (income - 11950) * 0.15;
            } else if (income <= 117450) {
                tax = 11950 * 0.10 + (income - 11950) * 0.15 + (income - 45500) * 0.25;
            } else if (income <= 190200) {
                tax = 11950 * 0.10 + (income - 11950) * 0.15 + (income - 45500) * 0.25 + (income - 117450) * 0.28;
            } else if (income <= 372950) {
                tax = 11950 * 0.10 + (income - 11950) * 0.15 + (income - 45500) * 0.25 + (income - 117450) * 0.28 + (income - 190200) * 0.33;
            } else if (income <= 372951) {
                tax = 11950 * 0.10 + (income - 11950) * 0.15 + (income - 45500) * 0.25 + (income - 117450) * 0.28 + (income - 190200) * 0.33 + (income - 372950) * 0.35;
            }
        } else {
            //Display wrong status
            System.out.println("Error: Invalid Status");
            System.exit(1);
        }
        System.out.println("Your taxes will be: " + (int) (tax * 100) / 100.0);
    }
}