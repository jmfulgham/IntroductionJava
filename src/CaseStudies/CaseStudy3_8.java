package CaseStudies; /**
 3.8 Case Study: Computing Body Mass Index
 You can use nested if statements to write a program that interprets body mass index.
 Body Mass index (BMI) is a measure of health based on height  and  weight. It can be calculated by taking your weight in
 kilograms and dividing it by the square of your height in meters. The interpretation of BMI for people 20 years or older
 is as follows:
 BMI                 Interpretation
 ______________________________________
 BMI < 18.5             Underweight
 18.5 <_ BMI <  25.0        Normal
 25.0 <_ BMI < 30.0      Overweight
 30 <_ BMI               Obese

 Write a program that prompts the user to enter a weight in pounds and hieght in inches and displays BMI. Note that one
 pound is 0.45359237 kilograms, and one inch is 0.0254 meters. Listing 3.4 gives the program

 Listing 3.4 ComputeAndInterpretBMI.java
 */
import java.util.Scanner;

public class CaseStudy3_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        //Prompt the user to enter height in inches
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237; //Constant
        final double METERS_PER_INCH = 0.0254; //Constant

        //Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        //Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
