package Chapter8.Task806;

public class SavingAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(4);
        System.out.println(saver1.calcMonthlyInterest());
        System.out.println(saver2.calcMonthlyInterest());

        SavingsAccount.modifyInterestRate(5);
        System.out.println(saver1.calcMonthlyInterest());
        System.out.println(saver2.calcMonthlyInterest());
    }
}
