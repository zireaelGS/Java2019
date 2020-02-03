package Chapter4;

import java.util.Scanner;

public class Task419 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int item1Sold;
        int item2Sold;
        int item3Sold;
        int item4Sold;
        System.out.println("Please enter how many item 1 was sold: ");
        item1Sold = input.nextInt();
        System.out.println("Please enter how many item 2 was sold: ");
        item2Sold = input.nextInt();
        System.out.println("Please enter how many item 3 was sold: ");
        item3Sold = input.nextInt();
        System.out.println("Please enter how many item 4 was sold: ");
        item4Sold = input.nextInt();
        System.out.println("For this week salesperson earned= " + calc(item1Sold, item2Sold, item3Sold, item4Sold));

    }

    public static double calc(int item1Sold, int item2Sold, int item3Sold, int item4Sold) {
        double salary;
        final double item1 = 239.99;
        final double item2 = 129.75;
        final double item3 = 99.95;
        final double item4 = 350.89;
        final double weekSalary = 200.00;
        final double procent = 0.09;
        salary = weekSalary + procent * (item1 * item1Sold + item2 * item2Sold + item3 * item3Sold + item4 * item4Sold);
        return salary;

    }
}