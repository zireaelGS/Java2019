package Chapter2;

import java.util.Scanner;

public class Task225 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Please, enter the number: ");
        number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd");
        }
    }
}
