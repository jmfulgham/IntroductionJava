package CaseStudies;

/**
 2.12 Case Study: Displaying the Current Time
 The problem is to develop a program that displays the current time in GMT (Greenwich Mean Time) in the
 format hour:minute:second, such as 13:19:8.
 The currentTimeMillis method in the System class returns the current time in milliseconds since the time midnight,
 January 1, 19070 GMT. This is known as the UNIX epoch. The epoch is the point where time starts, and 1970 was the
 year when the Unix operating system was formally introduced.
 The System.currentTimeMillis() returns the number of milliseconds since the UNIX epoch. You can use this method to
 obtain current time, then compute the current second, minute, and hour as follows:
 1. Obtain the total milliseconds since midnight, January 1, 1970, in totalMilliseconds by invoking
 System.currentTimeMillis().
 2. Obtain the total seconds totalSeconds by dividing totalMilliSeconds by 1000.
 3. Compute the current second from totalSeconds % 60.
 4. Obtain the totalMinutes by dividing totalSeconds by 60.
 5. Compute the current minute from totalMinutes % 60.
 6. Obtain the total hours totalHours by dividing totalMinutes by 60.
 7. Compute the current hour from totalHours % 24.
 */

public class CaseStudy2_12 {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds/1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds /60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes/60;
        long currentHour = totalHours%24;
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
