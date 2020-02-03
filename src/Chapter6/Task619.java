package Chapter6;

import java.util.Scanner;

public class Task619 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side;
        int count = 0;
        System.out.println("Input the value for side of the square: ");
        side = input.nextInt();
        System.out.println("Enter the character your square will consist of: ");
        char fill = input.next().charAt(0);
        while (count < side) {
            squareOfAsterisks(side, fill);
            System.out.println();
            count++;
        }
    }

    public static void squareOfAsterisks(int side, char fill) {
        int count = 1;
        while (count <= side) {
            System.out.print(fill + "  ");
            count++;
        }

    }
}
