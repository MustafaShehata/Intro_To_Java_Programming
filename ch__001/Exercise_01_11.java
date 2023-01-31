
package Ch_01;

/**
 * (Population projection)
 * One birth every 7 seconds
 * One death every 13 seconds
 * One new immigrant every 45 seconds
 * Write a program to display the population for each of
 * the next five years.
 * Current population is 312,032,486 and a year is 365 days.
 */


public class Exercise_01_11 {
    public static void main(String[] args) {
        
        int currentPopulation = 312032486;
        int secondsPerYear = 365*24*60*60;
        double birthsPeryear = secondsPerYear/7.0;
        double deathPeryear = secondsPerYear/13.0;
        double immigrantPeryear = secondsPerYear/45.0;
        
        int firstYear = (int)(currentPopulation + birthsPeryear - (deathPeryear + immigrantPeryear));
        int secondYear = (int)(firstYear + birthsPeryear - (deathPeryear + immigrantPeryear));
        int thirdYear = (int)(secondYear + birthsPeryear - (deathPeryear + immigrantPeryear));
        int forthYear = (int)(thirdYear  + birthsPeryear - (deathPeryear + immigrantPeryear));      
        int fifthYear = (int)(forthYear  + birthsPeryear - (deathPeryear + immigrantPeryear));
        
        System.out.println("First Year will be " + firstYear);
        System.out.println("Second Year will be " + secondYear);
        System.out.println("Third Year will be " + thirdYear);
        System.out.println("Forth Year will be " + forthYear);
        System.out.println("Fifth Year will be " + fifthYear);
    }
}
