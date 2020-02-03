package Chapter4;

import java.util.Scanner;

public class Task431 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int position = 1;
        int decimal = 0;
        int count = 1;
        int number1;
        int length;

        System.out.println("Please enter the integer containing only 0s and 1s (i.e., a binary integer): ");
        number = input.nextInt();
        //getting length of the number
        length = (int) Math.ceil(Math.log10(number));
        while (count <= length) {
            number1 = number % 10;
            number /= 10;
            decimal += number1 * position;
            position += position;
            count++;
        }
        System.out.println(decimal);
    }
}
