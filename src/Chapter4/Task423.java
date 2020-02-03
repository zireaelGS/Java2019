package Chapter4;

import java.util.Scanner;

public class Task423 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int number;
        int largest1 = 0;
        int largest2 = 0;
        System.out.println("Hello, this program will inputs a series of 10 integers and determines \n and prints the two largest values");
        while (counter < 10) {
            System.out.println("Please enter the number:");
            number = input.nextInt();
            if (counter == 0) {
                largest1 = number;
            } else if (counter == 1) {
                //largest2 is always>largest1
                if (number > largest1) {
                    largest2 = number;
                } else {
                    largest2 = largest1;
                    largest1 = number;
                }
            } else {
                //if number is bigger that our 2 numbers than largest1 get value of the largest2(it was the biggest number earlier)
                //and largest2 become a number(a new biggest value)
                if (number > largest1 && number > largest2) {
                    largest1 = largest2;
                    largest2 = number;
                }
                //the lesser of the 2 numbers( largest1) replases by the new number which are bigger then previous value largest1,
                // but still lesser than largest2
                else if (number > largest1 && number < largest2) {
                    largest1 = number;
                }
            }
            counter++;
        }
        System.out.println("The largest numbers are " + largest1 + " and " + largest2);
    }
}
