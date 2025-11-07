
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------Welcome to simple calculator-------------");
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error division by zero");
                }
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.print("result: " + result);
    }
}
