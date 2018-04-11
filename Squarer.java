// =============================================================================
/**
 * Square a number.  Subtext: Parse an input number so arithmetic can be
 * performed on it.
 *
 * @author Jawaun Brown
 */

import java.util.*;
import java.io.*;

public class Squarer {
    // =============================================================================
    
    
    
    // =========================================================================
    /**
     * The program's entry point.
     *
     * @param args The command-line arguments provided by the user.
     */
    public static void main (String[] args) {
        
        // If an incorrect number of arguments was provided on the command-line,
        // then print the correct usage and exit.
        if (args.length != 1) {
            showUsageAndExit();
        }
        
        // Grab the argument.
        int value = stringToInt(args[0]);
        
        // Calculate and show the result.
        int square = value * value;
        System.out.printf("%d^2 = %d\n", value, square);
        
    } // main()
    // =========================================================================
    
    
    
    // =========================================================================
    /**
     * Print the correct form for running this program and exit with an error
     * code.
     */
    public static void showUsageAndExit () {
        
        System.err.println("USAGE: java Squarer <value>");
        System.exit(1);
        
    } // showUsageAndExit()
    // =========================================================================
    
    
    
    // =========================================================================
    /**
     * Given a string, convert it into an integer.  If the text provided does
     * not represent an integer, then call <code>showUsageAndExit()</code> to
     * abort.
     *
     * @param text The textual representation of the value to be converted.
     * @returns The converted integer value.
     */
    public static int convert (String text) {
        if((text.length())<1){
            showUsageAndExit();
        }
        
        int x = 0;
        int goOn = 0;
        if (text.charAt(0)==('-')){
            boolean isNegative = true;
            goOn = 1;
        }
        while(goOn < 1){
            for(int j=0; j<text.length(); j+=1){
                x *= 10;
                x += (int)(text.charAt(j) - '0');
                if(text.charAt(j)==('-')){
                    x*=(-1);
                    goOn-=1;
                }
            }
        }
        return x;
        
        
        
        
    } // convert()
    // =========================================================================
    public static int stringToInt(String s){
        
        int total = convert(s);
        return total;
    }
    
    // =============================================================================
} // class Squarer
// =============================================================================
