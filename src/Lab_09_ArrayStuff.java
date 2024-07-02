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

        // Task 7 -

    } // return main()
} // end class Lab_09_ArrayStuff