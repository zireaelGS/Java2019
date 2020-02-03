package Chapter4;

import java.util.Scanner;

public class Task429 {
    public static void main(String[] args) {
        int counter = 1;
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size if the side of the square between 1 and 20: ");
        size = input.nextInt();
        if (size >= 1 && size <= 20) {
            if (size == 1) {
                System.out.println("*");
            } else {
                horizontalSide(size);
                while (counter <= size - 2) {
                    starSpace(size);
                    System.out.println();
                    counter++;
                }
                horizontalSide(size);
            }
        } else {
            System.out.println("Error.Remember that the size of the sqare should be between 1 and 20.");
        }

    }

    public static void horizontalSide(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("*  ");
        }
        System.out.println();
    }

    public static void starSpace(int size) {
        int i = 1;
        while (i <= size) {
            if (i == 1) {
                System.out.print("*  ");
            } else if (i == size) {
                System.out.print("*");
            } else {
                System.out.print("   ");
            }
            i++;
        }

    }

}
