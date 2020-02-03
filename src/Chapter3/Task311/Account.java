package Chapter3.Task311;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0)
            this.balance = balance;
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount < 0) {
            System.out.println("Enter the amount to be withdrawn without minus\n");
        } else {
            if (withdrawAmount <= balance) {
                balance = balance - withdrawAmount;
            } else {
                System.out.println("Withdrawal amount exceeded account balance.\n");
            }
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
