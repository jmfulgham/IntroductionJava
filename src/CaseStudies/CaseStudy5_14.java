package CaseStudies;

/**
        Case Study 5.14: Displaying Prime Numbers
        this presents a program that displays the first 50 prime number in 5 lines, each containing 10 numbers.\
        An integer greater than 1 is prime if its only positive divisor is 1 or itself. For example, 2,3, 5, 7 are prime numbers,
        but 4,6,8, and 9 are not. the problem is to display the first 50 prime numbers in 5 lines, each of which contains 10 numbers.
        the problem is to display the first 50 prime numbers in 5 lines, each of which contains 10 numbers. The problem can be broken
        into the following tasks:
        1. Determine whether a given number is prime.
        2. For number = 2,3,4,5,6,..., test whether it is prime.
        3. Count the prime numbers.
        4. Display each prime number and display 10 numbers per line.
        Obviously, you need to write a loop and repeatedly test whether a new number is prime. If the number is prime, increase
        the count by 1. The count is 0 initially. When it reaches 50, the loop terminates.
        Here is the algorithm for the problem:
        Set the number of prime numbers to be printed as
        a constant NUMBER_OF_PRIMES;
        Use count to track the number of prime numbers and
        set and initial count to 0;
        Set an initial number of 2;

        while (count < NUMBER_OF_PRIMES) {
        Test whether number is prime;

        if number is prime {
        Display the prime number and increase the count;
        }
        Increment number by 1;
        }
        To test whether a number is prime, check whether it is divisible by 2,3,4 and so on up to number/2. If a divisor is found,
        the number is not a prime. the algorithm can be described as follows:
        Use a boolean variable isPrime to denote whether
        the number is prime; Set isPrime to true initially;

        for (int divisor = 2; divisor <= number / 2; divisor++) {
        if (number % divisor == 0) {
        Set isPrime to False
        Exit the loop;
        }
        )
        This is a complex program for novice programmers. the key to developing a programmatic solution for this problem, and for
        many other problems, is to break it into sub-problems and develop solutions for each of them in turn. Do not attempt to
        develop a complete solution in the first trial. Instead, begin by writing the code to determine whether a given number
        is prime, then expand the program to test whether other number are prime in a loop.
        */

public class CaseStudy5_14 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50; // Number of Primes to display
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness

        System.out.println("The first 50 prime numbers are \n");

        //Repeatedly find prime numbers
        while (count < NUMBER_OF_PRIMES) {
            //Assume the number is prime
            boolean isPrime = true; // Is the correct number prime?
            //Test whether number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { // if true, number is not prime
                    isPrime = false; // Set isPrime to false
                    break; //Exit the for loop
                }
            }
            //Display the prime number and increase the count
            if (isPrime) {
                count++; // Increase the count
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    //Display the number and advance to the new line
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }
            //Check if the next number is prime
            number++;
        }
    }
}