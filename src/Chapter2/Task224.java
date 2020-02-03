package Chapter2;

import java.util.Scanner;

public class Task224 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        System.out.println("Please, enter the first number: ");
        number1 = input.nextInt();
        System.out.println("Please, enter the second number: ");
        number2 = input.nextInt();
        System.out.println("Please, enter the third number: ");
        number3 = input.nextInt();
        System.out.println("Please, enter the fourth number: ");
        number4 = input.nextInt();
        System.out.println("Please, enter the fifth number: ");
        number5 = input.nextInt();

        if (number1 <= number2 && number1 <= number3 && number1 <= number4 && number1 <= number5) {
            System.out.println("The smallest integer is " + number1);
        }else if (number2 <= number1 && number2 <= number3 && number2 <= number4 && number2 <= number5) {
            System.out.println("The smallest integer is " + number2);
        }else if (number3 <= number2 && number3 <= number1 && number3 <= number4 && number3 <= number5) {
            System.out.println("The smallest integer is " + number3);
        }else if (number4 <= number2 && number4 <= number3 && number4 <= number1 && number4 <= number5) {
            System.out.println("The smallest integer is " + number4);
        }else  {
            System.out.println("The smallest integer is " + number5);
        }

        if (number1 >= number2 && number1 >= number3 && number1 >= number4 && number1 >= number5) {
            System.out.println("The largest integer is " + number1);
        }else if (number2 >= number1 && number2 >= number3 && number2 >= number4 && number2 >= number5) {
            System.out.println("The largest integer is " + number2);
        }else if (number3 >= number2 && number3 >= number1 && number3 >= number4 && number3 >= number5) {
            System.out.println("The largest integer is " + number3);
        }else if (number4 >= number2 && number4 >= number3 && number4 >= number1 && number4 >= number5) {
            System.out.println("The largest integer is " + number4);

        }else {
            System.out.println("The largest integer is " + number5);
        }


    }
}
