package Chapter7;

import java.util.Scanner;

public class Task712 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        int number;
        for (int i = 0; i < array.length; i++) {
            System.out.println("\nInput the number between 10 and 100 inclusive. Number " + (i + 1) + " = ");
            number = input.nextInt();
            //check that our number between 10 and 100 inclusive
            while (number < 10 || number > 100) {
                System.out.println("Try again. Remember that the number should equal between 10 and 100, inclusive");
                number = input.nextInt();
            }
            //if our number was entered into the array earlier, then we will reassign the value zero to it.
            //here we checking all array
            for (int j = 0; j < array.length; j++) {
                if (number == array[j]) {
                    number = 0;
                }
            }
            //assign the number to array
            array[i] = number;
            //display all unique values of the array(all values of the array that not equals to zero by logic of my code).
            for (int k = 0; k < array.length; k++) {
                if (array[k] != 0) {
                    System.out.print(array[k] + " ");
                }
            }

        }
    }
}


