package Listings;

/**
 * Listing 2.1: ComputeArea.java
 */

public class Listing2_1 {
    public static void main(String[] args){
        double radius;
        double area;

        radius = 20;
        area = radius * radius * 3.14159;
        System.out.println("The area for a circle of radius " +
                radius + " is " + area);
    }
}
