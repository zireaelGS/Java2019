package Chapter4;

import java.util.Scanner;

public class Task437_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int counter = 1;
        double factorial = 1;
        double Ex = 1;
        int x;
        System.out.println("Please enter a nonnegative integer: ");
        n = input.nextInt();
        System.out.println("Please enter the degree x= ");
        x = input.nextInt();
        if (n >= 0) {
            while (counter <= n) {
                factorial *= counter;
                Ex = Ex + (Math.pow(x, counter) / factorial);
                counter++;
            }
            System.out.println("The value of the mathematical constant e = " + Ex);
        } else {
            System.out.println("Error. You have entered a negative integer");
        }

    }
}
