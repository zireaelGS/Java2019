package Chapter6;

import java.util.Scanner;

public class Task626 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = input.nextInt();
        reversed(number);
    }

    public static void reversed(int number) {
        int count = 0;
        int length = (int) Math.ceil(Math.log10(number));
        while (count < length) {
            int number1 = number % 10;
            System.out.print(number1);
            number /= 10;
            count++;
        }
    }
}
