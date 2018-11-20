package Listings;
/**
 * Listing 6.7: PrimeNumberMethod.java
 * This applies the concept of code modularization to improve Listing 5.15, PrimeNumber.java.
 */

public class Listing6_7 {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10; //Display 10 per line
        int count = 0;
        int number = 2; // A number to be tested for primeness

        //repeatedly find prime numbers
        while (count < numberOfPrimes) {
            //Print the prime number and increse the count
            if (isPrime(number)) {
                count++; //Increase the count
            }
            if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                //Print the number and advance to the new line
                System.out.printf("%-5d\n", number);
            } else {
                System.out.printf("%-5d", number);
            }
            /**Check whether number is prime */
            number++;
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { //if true, number is not a prime
                return false;
            }
        }
        return true; // Number is Prime
    }
}
