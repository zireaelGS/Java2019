package Chapter4;

import java.util.Scanner;

public class Task437_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int counter = 1;
        int factorial = 1;
        System.out.println("Please enter a nonnegative integer: ");
        n = input.nextInt();
        if (n >= 0) {
            while (counter <= n) {
                factorial *= counter;
                counter++;
            }
            System.out.println("The factorial of the " + n + " is " + factorial);
        } else {
            System.out.println("Error. You have entered a negative integer");
        }

    }
}
