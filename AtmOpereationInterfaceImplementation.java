
public class AtmOpereationInterfaceImplementation implements AtmOperationInterface {
    // Object of the ATM
    private ATM atm;

    public AtmOpereationInterfaceImplementation(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        System.out.println("Amount withdrawn balance is ");
    }

    @Override
    public void depositAmount(double depositAmount) {
        System.out.println(depositAmount + "successfully!!!");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public String viewBalance() {
        String val = "Available balance is " + atm.getBalance();
        System.out.println(val);
        return String.valueOf(atm.getBalance());
    }

}
