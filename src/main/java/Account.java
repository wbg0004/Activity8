public class Account {
    protected double mBalance;
    protected double mTotalFee = 0;

    private String mOwner;

    public Account(String owner, double balance) {
        mOwner = owner;
        mBalance = balance;
    }
    public double getBalance() {
        return mBalance;
    }
    public double getTotalFee() {
        return mTotalFee;
    }
    public String getOwner() {
        return mOwner;
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("A negative amount is not allowed.");
        }
        else {
            mBalance += amount;
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("A negative amount is not allowed.");
        }
        else {
            mBalance -= amount;
        }
    }

    public void tell() {
        System.out.println(mOwner + " has " + mBalance + " in the bank!");
    }
}
