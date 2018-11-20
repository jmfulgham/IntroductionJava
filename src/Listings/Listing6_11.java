package Listings;
/**
 * Listing 6.11: TestRandomCharacter.java
 * Listing 6.11 gives a test program that displays 175 random lowercase letters.
 */

public class Listing6_11 {
    /** Main Method */
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;

        //Print random character between 'a' and 'z', 25 chars per line
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = CaseStudies.CaseStudy6_10.getRandomLowerCaseLetter();
            if ((i +1) % CHARS_PER_LINE == 0) {
                System.out.println(ch);
            } else {
                System.out.print(ch);
            }
        }
    }
}
/** Line 14 invokes getRandomLowerCaseLetter() defined in the RandomCharacter class. Not getRandomLowerCaseLetter() does
 * not have any parameters, but you still have to use the parenthesis when defining and invoking the method.
 */
