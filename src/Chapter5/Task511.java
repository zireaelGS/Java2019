package Chapter5;

import java.util.Scanner;

public class Task511 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value;
        int number;
        int counter;
        int smallest = 0;
        System.out.println("Please enter the number of values that you will input:  ");
        number = input.nextInt();
        System.out.println("Please enter the values:  ");
        for (counter = 1; counter <= number; counter++) {
            value = input.nextInt();
            if (counter == 1) {
                smallest = value;
            } else if (smallest > value) {
                smallest = value;
            }
        }
        System.out.println("The smallest integer is " + smallest);

    }
}
