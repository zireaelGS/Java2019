package Chapter4;

import java.util.Scanner;

public class Task421 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int number;
        int largest = 0;
        System.out.println("Hello, this program will inputs a series of 10 integers and determines \n and prints the largest integer");
        while (counter < 10) {
            System.out.println("Please enter the number:");
            number = input.nextInt();
            if (number > largest) {
                largest = number;
            }
            counter++;
        }
        System.out.println("The largest number is " + largest);
    }
}
