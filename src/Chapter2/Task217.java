package Chapter2;

import java.util.Scanner;

public class Task217 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int smallest = 0;
        int largest = 0;
        int sum;
        int average;
        int product;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();
        System.out.print("Enter third integer: ");
        number3 = input.nextInt();

        if (number1 <= number2 && number1 <= number3) {
            smallest = number1;
        }
        if (number1 >= number2 && number1 >= number3) {
            largest = number1;
        }

        if (number2 <= number1 && number2 <= number3) {
            smallest = number2;
        }
        if (number2 >= number1 && number2 >= number3) {
            largest = number2;
        }

        if (number3 <= number2 && number3 <= number1) {
            smallest = number3;
        }
        if (number3 >= number2 && number3 >= number1) {
            largest = number3;
        }

        sum = number1 + number2 + number3;
        average = (sum) / 3;
        product = number1 * number2 * number3;

        System.out.println("The sum of the numbers= " + sum);
        System.out.println("The average of the numbers= " + average);
        System.out.println("The product of the numbers= " + product);
        System.out.println("The smallest number = " + smallest);
        System.out.println("The largest number = " + largest);


    }
}

