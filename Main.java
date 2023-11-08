import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int defaultAtmNumber = 987654321;
        int defaultAtmPin = 1234;

        Scanner logIn = new Scanner(System.in);
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

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;

                    default:
                        break;
                }

            }

        } else {
            System.out.println("Incorrect Atm number or pin");
            System.exit(0);
        }
    }
}
