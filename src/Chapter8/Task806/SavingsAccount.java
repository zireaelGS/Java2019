package Chapter8.Task806;

public class SavingsAccount {
    private static double annualInterestRate;//процентная става для всех счетов сначала 4 процента
    private double savingsBalance;//сумма, которую вкладчик в настоящее время имеет на депозите.

    //конструктор, который позволяет создать 2 сберегательных счета с каким-то балансом
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    //метод для рассчета ежемесячного процента
    public double calcMonthlyInterest() {
        return savingsBalance += (savingsBalance * annualInterestRate) / 12;
    }

    public static void modifyInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate / 100;//тут типа меняем процентную ставку для всех счетов//
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
}

