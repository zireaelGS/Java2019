package Chapter4;

import java.util.Scanner;


public class Task424 {
    public static void main(String[] args) {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // initializing variables in declarations
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;
        boolean check = true;

        // process 10 students using counter-controlled loop
        while (studentCounter <= 10) {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();
            if (result == 1 || result == 2) {
                // if...else is nested in the while statement
                if (result == 1) {
                    passes = passes + 1;
                } else {
                    failures = failures + 1;
                }
                studentCounter = studentCounter + 1;
            } else {
                System.out.println("Try again. You should enter 1 or 2.");
            }
        }

        // termination phase; prepare and display results
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        // determine whether more than 8 students passed
        if (passes > 8)
            System.out.println("Bonus to instructor!");
    }
}
