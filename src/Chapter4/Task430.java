package Chapter4;

import java.util.Scanner;

public class Task430 {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the five-digit integer: ");
        number = input.nextInt();
        if (number > 9999 && number < 100000) {
            palindrome(number);
        } else {
            while (number >= 10000 || number <= 9999) {
                System.out.println("Error. Please try again. Get attention that it should be five-digit number.");
                number = input.nextInt();
                if (number > 9999 && number < 100000) {
                    palindrome(number);
                    break;
                }
            }
        }

    }

    public static void palindrome(int number) {
        if (number % 10 == number / 10000) {
            if ((number / 10) % 10 == (number / 1000) % 10) {
                System.out.println("Congratilations. It’s a palindrome");
            }
        } else {
            System.out.println("It’s not a palindrome");
        }
    }
}
