import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Object of implememention class
        AtmOperationInterface operation = new AtmOpereationInterfaceImplementation(new ATM(0, 0, 0));

        int defaultAtmNumber = 987654321;
        int defaultAtmPin = 1234;
        try (// logIn Scannerjjujjujuujujujju987654321 to read input from the user
                Scanner logIn = new Scanner(System.in)) {
            System.out.println("Welcome to Lizdev ATM !");
            System.out.print("Enter your atm number:  ");
            int atmNumber = logIn.nextInt();
            System.out.print("Enter your atm pin: ");
            int atmPin = logIn.nextInt();

            if ((defaultAtmNumber == atmNumber) && (defaultAtmPin == atmPin)) {
                while (true) {
                    System.out.println(
                            "1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Account Statement\n5.Exit");
                    System.out.println("Enter choice ");
                    int choice = logIn.nextInt();
                    switch (choice) {
                        case 1:
                            operation.viewBalance();

                            break;
                        case 2:
                            System.out.println("Enter amount to withdraw");
                            double withdrawAmount = logIn.nextDouble();
                            operation.withdrawAmount(withdrawAmount);
                            break;
                        case 3:
                            System.out.println("Enter amount to deposit");
                            double depositAmount = logIn.nextDouble();
                            operation.depositAmount(depositAmount);
                            break;
                        case 4:

                            break;
                        case 5:
                            System.out.println("Kindly take your card\n Thank you for using Lizdev ATM!");
                            System.exit(0);
                            break;

                        default:
                            System.out.println("Please enter correct number");
                            break;
                    }

                }

            } else {
                System.out.println("Incorrect Atm number or pin");
                System.exit(0);
            }
        }
    }
}
