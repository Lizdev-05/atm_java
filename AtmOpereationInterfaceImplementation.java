import java.util.HashMap;
import java.util.Map;

public class AtmOpereationInterfaceImplementation implements AtmOperationInterface {
    // Object of the ATM
    private ATM atm;

    public AtmOpereationInterfaceImplementation(ATM atm) {
        this.atm = atm;
    }

    Map<Double, String> accountStatement = new HashMap<>();

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount % 500 == 0) {
            if (withdrawAmount < atm.getBalance()) {
                accountStatement.put(withdrawAmount, " withdrawn");
                System.out.println(withdrawAmount + " withdrawn successfully!");
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Please, enter the amount in multiple of 500");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        accountStatement.put(depositAmount, " withdrawn");
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

    @Override
    public void viewAccountStatement() {
        for (Map.Entry<Double, String> m : accountStatement.entrySet()) {
            System.out.println(m.getKey() + m.getValue());
        }
    }

}
