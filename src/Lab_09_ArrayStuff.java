import java.util.Random; // import Random class
import java.util.Scanner; // import Scanner class

/**
 *
 * @author Daniel Sandy sandyds@mail.uc.edu
 */

public class Lab_09_ArrayStuff // class Lab_09_ArrayStuff
{
    public static void main(String[] args) // main()
    {
        // declare & initialize global variables
        Random rnd = new Random(); // declare & initialize Random rnd
        Scanner in = new Scanner(System.in); // declare & initialize Scanner in

        // Task 1 - create dataPoints[] & set size
        final int ARRAY_LENGTH = 100; // make ARRAY_LENGTH a constant
        int[] dataPoints = new int[ARRAY_LENGTH]; // specify 100 values in dataPoints[]
        int loopCount = 0; // loopCount to help with printf

        // Task 2 - loop that iterates through dataPoints[] & gives random values
        System.out.println(); // output blank line for visual affect
        System.out.println("Loop that iterates through dataPoints[] & initializes with random values between 1 & 100:"); // header
        for (int i = 0; i < ARRAY_LENGTH; i++) // iterate through dataPoints[]
        {
            dataPoints[i] = rnd.nextInt(100) + 1; // random value for dataPoints[]
            System.out.print(dataPoints[i] + " "); // output values in dataPoints[]
        } // end for

        // Task 3 - displays formatted Array values
        System.out.println("\n"); // Add blank line for visual affect
        System.out.println("Loop that iterates through dataPoints[] & displays values in a neat format: "); // header
        for (int i = 0; i < ARRAY_LENGTH; i++) // iterate through indexes
        {
            System.out.printf("%3d | ", dataPoints[i]); // print values in a neat table
            loopCount++; // increase loopCount
            if (loopCount % 20 == 0) // if loopCount index divisible by 20
            {
                System.out.println(); // add new line for visual affect
            } // end if
        } // end for (iterating indices)

        // Task 4 - Loop that calculates the sum & average for values in dataPoints
        System.out.println(); // Insert blank line for visual affect
        System.out.println("Loop that calculates sum & average for random values in dataPoints[]: "); // output header
        int totalVal = 0; // declare & initialize totalVal
        double avgVal = 0.0; // declare & initialize avgVal
        for (int i = 0; i < ARRAY_LENGTH; i++) // iterate through dataPoints[]
        {
            totalVal += dataPoints[i]; // sum of all values in dataPoints[]
        } // end for
        System.out.println("The sum of all values in dataPoints[] is: " + totalVal); // output overall sum of values
        avgVal = (double) totalVal / 100; // calculate average of values in dataPoints[]
        System.out.printf("The average of values in dataPoints[] is: %5.2f\n", avgVal); // output average value of dataPoints[]

        // Task 5 - Prompt & input value between 1 & 100
        int userNum = SafeInput.getRangedInt(in, "Enter a number between 1 & 100", 1, 100); // output prompt
        System.out.println("You chose: " + userNum); // reflect input to user

        // Task 6 - Iterate through dataPoints[] & count how many times user value is present
        int numCount = 0; // declare & initialize variable to store # of times user's number appears in dataPoints[]
        for (int i = 0; i < ARRAY_LENGTH; i++) // iterate through dataPoints[]
        {
            if (userNum == dataPoints[i]) // if user's number is in loop
            {
                numCount++; // add 1 to numCount
            } // end if
        } // end for
        System.out.println(userNum + " was found " + numCount + " times in dataPoints[].");

        // Task 7 - Find first location of user value in dataPoints[] if it exists
        int newUserNum = SafeInput.getRangedInt(in, "Enter a number between 1 & 100 to find its location in dataPoints[]", 1, 100); // output prompt
        System.out.println("You chose: " + newUserNum); // output user input
        numCount = 0; // rest numCount variable to store index based on number of loops
        boolean foundTarget = false; // declare new variable to track if user num was found in dataPoints[]
        for (int i = 0; i < ARRAY_LENGTH; i++) // iterate through dataPoints[]
        {
            if (newUserNum == dataPoints[i]) // if newUserNum  is in dataPoints[]
            {
                foundTarget = true; // go to else statement in outer if loop
                break; // end if loop upon first discovery
            } // end if
            numCount++; // add one to index count
        } // end iterations through dataPoints[]

        if (!foundTarget) // if newUserNum is not in dataPoints[]
        {
            System.out.println("Target " + newUserNum + " not found!"); // output to user the num not found
        }
        else // if newUserNum is in dataPoints[]
        {
            System.out.println("Found " + newUserNum + " at index " + numCount); // output index location of newUserNum
        } // end if / else

        //Task 8 - Find the min & max in dataPoints[]
        int minNum = dataPoints[0]; // declare & initialize variable to store minimum
        int maxNum = dataPoints[0]; // declare & initialize variable to store maximum
        for (int i = 0; i < ARRAY_LENGTH; i++) // iterate through dataPoints[]
        {
           if (minNum > dataPoints[i]) // if num is less than the current min
           {
               minNum = dataPoints[i]; // save num as new min
           } // end if
           if (maxNum < dataPoints[i]) // if num is greater than current max
           {
               maxNum = dataPoints[i]; // save num as new max
           } // end if
        } // end for loop iterations through the array
        System.out.println("\nThe minimum value in dataPoints[] is: " + minNum); // output the minimum value in dataPoints[]
        System.out.println("The maximum value in dataPoints[] is: " + maxNum); // output the maximum value in dataPoints[]

        //Task 9 - Write a method below to calculate average of double values in an array
        System.out.println("\nAverage of dataPoints is: " + getAverage(dataPoints));

    } // return main()

    /**
     *
     * @param values to store an array
     * @return a double value
     */
    public static double getAverage(int values[]) // method outside of main()
    {
        double total = 0; // declare & initialize total
        double avg = 0.0; // declare & initialize avg
        for (int i = 0; i < values.length; i++) // iterate through array values[]
        {
            total += values[i]; // sum of all values in values[]
        } // end for
        avg = (double) total / values.length; // calculate average of values in values[]
        return avg; // return average value of values[]
    }
} // end class Lab_09_ArrayStuff