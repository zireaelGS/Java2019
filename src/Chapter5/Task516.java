package Chapter5;

import java.util.Scanner;

public class Task516 {
    public static void main(String[] args) {
        int number;
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int number5 = 0;
        int counter = 1;
        Scanner input = new Scanner(System.in);
        while (counter <= 5) {
            System.out.println("Please enter the number between 1 and 30: \n");
            number = input.nextInt();
            if (number >= 1 && number <= 30) {
                switch (counter) {
                    case 1:
                        number1 = number;
                        break;
                    case 2:
                        number2 = number;
                        break;
                    case 3:
                        number3 = number;
                        break;
                    case 4:
                        number4 = number;
                        break;
                    case 5:
                        number5 = number;
                        break;
                }
                counter++;
            } else {
                System.out.println("Error. Remember that you should enter the number between 1 and 30.");

            }
        }
        stars(number1);
        System.out.println();
        stars(number2);
        System.out.println();
        stars(number3);
        System.out.println();
        stars(number4);
        System.out.println();
        stars(number5);

    }

    public static void stars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
    }
}
