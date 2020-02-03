package Chapter4;

import java.util.Scanner;

public class Task420 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int imployees = 3;
        int i = 0;
        while (i < imployees) {
            System.out.println("Please enter number of hours worked last week for the employee: ");
            double hours = input.nextDouble();
            System.out.println("Please enter hourly rates for the  employee: ");
            double hourlyRates = input.nextDouble();
            System.out.println("The gross pay fot the employee = " + grossPay(hours, hourlyRates));
            i += 1;
        }
    }

    public static double grossPay(double hours, double hourlyRates) {
        if (hours <= 40) {
            double grossPay = hours * hourlyRates;
            return grossPay;
        } else {
            double extraHours = hours - 40;
            double grossPay = (40 * hourlyRates) + extraHours * 1.5 * hourlyRates;
            return grossPay;
        }
    }
}
