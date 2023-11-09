public class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    // Default constructor
    public ATM(double balance, double depositAmount, double withdrawAmount) {
        this.balance = balance;
    }

    // Getter and Setter

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

}
