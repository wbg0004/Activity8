public class SavingsAccount extends Account {
    public static double MONTHLY_FEE = 35.0;
    private int monthlyWithdrawals = 0;
    private double monthlyDeposited = 0;
    public static double MIN_WAVE_FEE = 100;

    public SavingsAccount(String owner, double balance) {
        super(owner, balance);
    }

    public void chargeNewMonth() {
        monthlyWithdrawals = 0;
        if (monthlyDeposited < MIN_WAVE_FEE) {
            mTotalFee -= MONTHLY_FEE;
        }
        monthlyDeposited = 0;
    }

    public void withdraw(double amount) {
        if (monthlyWithdrawals >= 6) {
            System.out.println("You can only make 6 withdrawals a month.");
            return;
        }
        if (amount > mBalance) {
            System.out.println("You do not have that much money.");
            return;
        }
        super.withdraw(amount);
        monthlyWithdrawals++;
    }

    public void deposit(double amount) {
        super.deposit(amount);
        monthlyDeposited += amount;
    }
}
