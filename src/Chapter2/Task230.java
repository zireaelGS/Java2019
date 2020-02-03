package Chapter2;

import java.util.Scanner;

public class Task230 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Please, enter the number consisting of five digits");
        number = input.nextInt();

        if ((number < 100000) && (number > 9999)) {

            System.out.print(number / 10000 + "   ");
            System.out.print((number / 1000) % 10 + "   ");
            System.out.print((number / 100) % 10 + "   ");
            System.out.print((number / 10) % 10 + "   ");
            System.out.println(number % 10);

        }

        if (number <= 9999) {
            System.out.println("Try again. Your number should consist more digits");
        }

        if (number >= 100000) {
            System.out.println("Try again. Your number should consist less digits");
        }

    }
}
