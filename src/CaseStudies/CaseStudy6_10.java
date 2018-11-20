package CaseStudies;

/**
 * Case Study 6.10: Generating Random Characters
 * A character is coded using an integer. Generating a random character is to generate an integer.
 * Computer programs process numerical data and characters. You have seen many examples that involve numerical data. It
 * is also important to understand characters and how to process them. This section presents an example of generating
 * random characters. As introduced in Section 4.3, every character has a unique Unicode between 0 and FFFF in hexdecimal
 *  (65535in decimal). To generate a random character is to generate a random integer between 0 and 65535 using the
 *  following expression (note since 0 <= Math.random() < 1.0, you have to add 1 to 65535):
 *      (int)(Math.random() * (65535 + 1))
 * Now let's consider how to generate a random lowercase letter. The Unicodes for lowercase letters are consecutive integers
 * starting from the Unicode for a, then for b, c, ..., and z. The Unicode for a is (int) 'a'. Thus, a random integer
 * between (int) 'a' and (int)'z' is (int)((int)'a' + Math.random()*((int)'z'-(int)'a' +1))
 * As discussed in Section4.4.3, all numeric operators can be applied to the char operands. The  char operand is cast into
 * a number if the other operand is a number or a character. Therefore, the preceding expression can be simplified as follows:
 *      'a' + Math.random()*('z'-'a'+1)
 * and a random lowercase letter is
 *      (char)('a' + Math.random()*('z'-'a'+1)
 * Hence, a random character between any two characters ch1 and ch2 with ch1 < ch2 can be generated as follows:
 *      (char)(ch1 + Math.random()*(ch2-ch1+1)
 * This is a simple but useful discovery. Listing 6.10 defines a class named RandomCharacter with overloaded methods to
 * get a certain type of random character.
 */

public class CaseStudy6_10 {
    /** Generate a random character between ch1 and ch2 */
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    /** Generate a random lowercase letter */
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a','z');
    }
    /** Generate a random uppercase letter */
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A','Z');
    }
    /** Generate a random digit character */
    public static char getRandomDigitCharacter() {
        return  getRandomCharacter('0','9');
    }
    /** Generate a random character */
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
/** Please Refer to Listing 6.11 to see this in use */
