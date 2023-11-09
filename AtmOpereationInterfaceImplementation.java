
public class AtmOpereationInterfaceImplementation implements AtmOperationInterface {
    // Object of the ATM
    private ATM atm;

    public AtmOpereationInterfaceImplementation(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount < atm.getBalance()) {
            System.out.println(withdrawAmount + " withdrawn successfully!");
            atm.setBalance(atm.getBalance() - withdrawAmount);
            viewBalance();
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        System.out.println(depositAmount + " deposited successfully!!!");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public String viewBalance() {
        String val = "Your available balance is " + atm.getBalance();
        System.out.println(val);
        return String.valueOf(atm.getBalance());
    }

}
