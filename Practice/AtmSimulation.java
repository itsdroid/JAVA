import java.util.Scanner;
public class AtmSimulation {

    public static boolean checkPincode(Scanner sc) {
        int correctPin = 12345;
        System.out.print("Enter your PIN: ");
        int inputPin = sc.nextInt();

        if (inputPin == correctPin) {
            return true;
        } else {
            System.out.println("Incorrect PIN! Access denied");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 50000;
        int choice;

        System.out.println("---- Welcome to ATM Simulation ----");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (checkPincode(sc)) {
                        System.out.println("Available Balance: " + balance);
                    }
                    break;
                case 2:
                    if (checkPincode(sc)) {
                        System.out.print("Enter amount to deposit: ");
                        int deposit = sc.nextInt();
                        if (deposit > 0) {
                            balance += deposit;
                            System.out.println("Amount deposited successfully.");
                        } else {
                            System.out.println("Invalid deposit amount!");
                        }
                        System.out.println("Updated Balance: " + balance);
                    }
                    break;
                case 3:
                    if (checkPincode(sc)) {
                        System.out.print("Enter amount to withdraw: ");
                        int withdraw = sc.nextInt();
                        if (withdraw > balance) {
                            System.out.println("Insufficient balance");
                        } else if (withdraw <= 0) {
                            System.out.println("Invalid withdrawal amount");
                        } else {
                            balance -= withdraw;
                            System.out.println("Withdrawal successful");
                        }
                        System.out.println("Updated Balance: " + balance);
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM");
                    break;
                default:
                    System.out.println("Invalid choice Try again!");
            }
        } while (choice != 4);
        sc.close();
    }
}
