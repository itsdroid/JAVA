
import java.util.Scanner;

public class EvenOdd {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Even/Odd checker ! \nEnter number to check even or odd \nEnter 0 to exit");
        System.out.println("---------------------------------------------------------");
        do {
            System.out.println("---------------------------------------------------------");
            System.out.print("Enter your number: ");
            int num = sc.nextInt();

            if (num == 0) {
                System.out.println("Exiting program.... Goodbye!");
                break;
            } else if (num % 2 == 0) {
                System.out.println("Your input " + num + " is Even!");
            } else {
                System.out.println("Your input " + num + " is Odd!");
            }
        } while (true);
    }
}
