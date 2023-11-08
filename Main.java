import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int defaultAtmNumber = 987654321;
        int defaultAtmPin = 1234;

        Scanner logIn = new Scanner(System.in);
        System.out.print("Enter your atm number:  ");
        int atmNumber = logIn.nextInt();
        System.out.print("Enter your atm pin: ");
        int atmPin = logIn.nextInt();

        if ((defaultAtmNumber == atmNumber) && (defaultAtmPin == atmPin)) {
            System.out.println("Validation Successful!");
        } else {
            System.out.println("Incorrect Atm number or pin");
            System.exit(0);
        }
    }
}
