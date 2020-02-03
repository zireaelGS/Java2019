package Chapter2;

import java.util.Scanner;

public class Task226 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int result;

        System.out.println("Please, enter the first number: ");
        number1 = input.nextInt();
        System.out.println("Please, enter the second number: ");
        number2 = input.nextInt();

        if (number1 % number2 == 0) {
            result = number1 / number2;
            System.out.println("The first number is multiple of the second. Result = " + result);
        } else {
            System.out.println("The first number isn't multiple of the second. Please, try again.");
        }

    }
}
