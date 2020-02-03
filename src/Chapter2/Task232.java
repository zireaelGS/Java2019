package Chapter2;

import java.util.Scanner;

public class Task232 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int negative = 0;
        int positive = 0;
        int zero = 0;
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        System.out.println("Please,enter the first number= ");
        number1 = input.nextInt();
        System.out.println("Please,enter the second number= ");
        number2 = input.nextInt();
        System.out.println("Please,enter the third number= ");
        number3 = input.nextInt();
        System.out.println("Please,enter the fourth number= ");
        number4 = input.nextInt();
        System.out.println("Please,enter the fifth number= ");
        number5 = input.nextInt();

        if (number1 == 0) {
            zero++;
        }
        if (number1 > 0) {
            positive++;
        }
        if (number1 < 0) {
            negative++;
        }

        if (number2 == 0) {
            zero++;
        }
        if (number2 > 0) {
            positive++;
        }
        if (number2 < 0) {
            negative++;
        }

        if (number3 == 0) {
            zero++;
        }
        if (number3 > 0) {
            positive++;
        }
        if (number3 < 0) {
            negative++;
        }

        if (number4 == 0) {
            zero++;
        }
        if (number4 > 0) {
            positive++;
        }
        if (number4 < 0) {
            negative++;
        }

        if (number5 == 0) {
            zero++;
        }
        if (number5 > 0) {
            positive++;
        }
        if (number5 < 0) {
            negative++;
        }

        System.out.println("You inputed zero " + zero + " times");
        System.out.println("You inputed positive integers " + positive + " times");
        System.out.println("You inputed negative integers " + negative + " times");


    }
}
