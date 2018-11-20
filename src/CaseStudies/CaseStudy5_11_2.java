package CaseStudies;

/**
 Case Study 5.11.2: Predicting the Future Tuition
 Suppose the tuition for a university is $10,000 this yesar and tuition increases 7% every year. In how many years will
 the tuition be doubled?
 before you can write a program to solve this problem, first consider how to solve it by hand. The tuition for the second
 year is the tuition for the first year*1.07. The tuition for a future year is the tuirtion of its preceding year*1.07.
 Thus, the tuition for each year can be computed as follows:
 double tuition = 10000; int year = 0; // Year 0
 tuition = tuition * 1.07; year++; // Year 1
 tuition = tuition * 1.07; year++; // Year 2
 ...
 keep computing the tuition for a new year until it is at least 20000. By then, you will know how many years it will take
 for the tuition to be doubled. You can now translate the logic into the following loop:
 double tuition = 10000; // Year 0
 int year = 0;
 while (tuition < 20000) {
 tuition = tuition * 1.07;
 year++;
 }
 */

public class CaseStudy5_11_2 {
    public static void main(String[] args) {
        double tuition = 10000; // Year 0
        int year = 0;
        while (tuition < 20000) {
            tuition = tuition * 1.07;
            year++;
        }

        System.out.println("Tuition will be double in " + year + " years");
        System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);
    }
}

