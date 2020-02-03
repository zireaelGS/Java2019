package Chapter4;

import java.util.Scanner;

public class Task417 {
    public static void main(String[] args) {
        int miles;
        int gallons;
        int sumMiles = 0;
        int sumGallons = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of miles or enter 0 to exit: ");
        miles = input.nextInt();
        while (miles != 0) {
            System.out.println("Please enter the number of gallons for this trip: ");
            gallons = input.nextInt();
            sumMiles = sumMiles + miles;
            sumGallons = sumGallons + gallons;
            System.out.println("The miles per gallon obtained for this trip " + (double) miles / gallons);
            System.out.println("\nPlease enter the number of miles or enter 0 to exit: ");
            miles = input.nextInt();
        }
        System.out.println("Сombined miles per gallon obtained for all trips up to this point " + (double) sumMiles / sumGallons);
    }
}
