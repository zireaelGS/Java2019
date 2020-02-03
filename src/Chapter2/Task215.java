package Chapter2;

import java.util.Scanner;

public class Task215 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;
        int prod;
        int differ;
        int quotient = 0;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;
        prod = number1 * number2;
        differ = number1 - number2;


        System.out.printf("Sum is %d%n", sum);
        System.out.println("product is " + prod);
        System.out.println("difference is " + differ);

        if (number2 != 0) {
            quotient = number1 / number2;
            System.out.println("quotient is " + quotient);
        } else {
            System.out.println("Cannot be divided by zero. Enter another integer to get a result of the quotient");
        }


    }
}
