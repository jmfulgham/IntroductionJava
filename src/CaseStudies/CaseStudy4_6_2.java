package CaseStudies;

/**
 Case Study 4.2.6 : Computing Angles of a Triangle
 You can use the math methods to solve many computational problems. Given three side of a triangle, for example,
 you can compute the angles by using the following formulas:
 A = acos((a*a-b*b-c*c) / (-2*b*c)
 B = acos((b*b-a*a-c*c) / (-2*a*c)
 C = acos((c*c-b*b-a*a) / (-2*a*b)
 Here in this example, given the length of three sides, you can use this formula to write a program to compute the angles
 without having to know how the formula is derived. In order to compute the lengths of the sides, we need to know the
 coordinates of three corner points and compute the distances between the points. Listing 4.1 is an example of a program
 that prompts the user to enter the x- and y-coordinates of the three corner points in a triangle then displays the three
 angles.
 Listing 4.1 ComputeAngles.java
 */
import java.util.Scanner;

public class CaseStudy4_6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter three points:
        System.out.println("Enter three points: ");
        System.out.print("Enter in the x-coordinate for the first point: ");
        double x1 = input.nextDouble();
        System.out.print("Enter in the y-coordinate for the first point: ");
        double y1 = input.nextDouble();
        System.out.print("Enter in the x-coordinate for the second point: ");
        double x2 = input.nextDouble();
        System.out.print("Enter in the y-coordinate for the second point: ");
        double y2 = input.nextDouble();
        System.out.print("Enter in the x-coordinate for the third point: ");
        double x3 = input.nextDouble();
        System.out.print("Enter in the y-coordinate for the third point: ");
        double y3 = input.nextDouble();

        //Compute three sides
        double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y1 - y3));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        //Compute three angles
        double A = Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
        double B = Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*a*c)));
        double C = Math.toDegrees(Math.acos((c*c-b*b-a*a)/(-2*a*b)));

        //Display results
        System.out.println("The three angles are " + Math.round(A*100)/100.0 + " " + Math.round(B*100)/100.0 + " " + Math.round(C*100)/100.0);
    }
}
