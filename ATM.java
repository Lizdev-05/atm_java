public class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawnAmount;

    // Default constructor
    public ATM() {

    }

    // Getter and Setter
    public double getBalance() {
        return balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public double getWithdrawnAmount() {
        return withdrawnAmount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void setWithdrawnAmount(double withdrawnAmount) {
        this.withdrawnAmount = withdrawnAmount;
    }

}
