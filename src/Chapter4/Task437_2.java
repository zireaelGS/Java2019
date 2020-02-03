package Chapter4;

import java.util.Scanner;

public class Task437_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int counter = 1;
        double factorial = 1;
        double e = 1;
        System.out.println("Please enter a nonnegative integer: ");
        n = input.nextInt();
        if (n >= 0) {
            while (counter <= n) {
                factorial *= counter;
                e += 1 / factorial;
                counter++;
            }
            System.out.println("The value of the mathematical constant e = " + e);
        } else {
            System.out.println("Error. You have entered a negative integer");
        }

    }
}
