package Chapter6;

import java.util.Scanner;

public class Task608 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amountOfCustumer;
        double hours;
        double totalFee = 0;
        int count = 1;
        System.out.println("Please enter the amount of the customer who parked in the garage yesterday: ");
        amountOfCustumer = input.nextInt();
        while (count <= amountOfCustumer) {
            System.out.println("Please enter how many hours the customer " + count + " have spend on the parking: ");
            hours = input.nextDouble();
            if (hours <= 24) {
                calculateCharges(hours);
                totalFee += calculateCharges(hours);
                count++;
            } else {
                System.out.println("The customer cannot stay on the parking for more than 24 hours");
            }
        }
        System.out.println("The total amount for yesterday= " + totalFee);
    }

    public static double calculateCharges(double hours) {
        double minFee = 2;
        double maxFee = 10;
        double additionalFee = 0.5;
        double fee;
        if (hours <= 3) {
            fee = minFee;
        } else {
            hours -= 3;
            fee = minFee + hours * additionalFee;
        }
        if (fee <= 10) {
            System.out.println("This customer have payed " + fee + "$");
        } else {
            fee = maxFee;
            System.out.println("This customer have payed " + fee + "$.");
        }
        return fee;
    }


}
