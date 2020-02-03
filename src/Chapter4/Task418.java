package Chapter4;

import java.util.Scanner;

public class Task418 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int accountNumber = 1;
        int beginningBalance;
        int itemsCharged;
        int creditsApplied;
        int creditLimit;
        int newBalance;
        while (accountNumber != 0) {
            System.out.println("Please enter the account number: ");
            accountNumber = input.nextInt();
            System.out.println("Please enter the balance at the beginning of the month: ");
            beginningBalance = input.nextInt();
            System.out.println("Please enter total of all items charged by you this month: ");
            itemsCharged = input.nextInt();
            System.out.println("Please enter total of all credits applied to the your’s account this month: ");
            creditsApplied = input.nextInt();
            System.out.println("Please enter allowed credit limit: ");
            creditLimit = input.nextInt();
            newBalance = beginningBalance + itemsCharged - creditsApplied;
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
                break;
            }

        }


    }
}
