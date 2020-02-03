package Chapter3.Task311;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);


        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());


        Scanner input = new Scanner(System.in);

        System.out.print("Enter withdraw amount from account1: ");
        double withdrawAmount = input.nextDouble();
        System.out.printf("%nwithdrawn %.2f from account1 balance%n%n",
                withdrawAmount);
        account1.withdraw(withdrawAmount);


        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        System.out.print("Enter withdraw amount from account2: ");
        withdrawAmount = input.nextDouble();
        System.out.printf("%nwithdrawn %.2f from account2 balance%n%n",
                withdrawAmount);
        account2.withdraw(withdrawAmount);


        System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                account2.getName(), account2.getBalance());
    }
}
