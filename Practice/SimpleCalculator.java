import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------Simple Calculator------------");
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter an operator: (+, -, *, /)");
        char operator = sc.next().charAt(0);

        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        double result=0;
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
            if(num2 != 0) {
            result = num1 / num2;
            }
            else {
                System.out.println("Error division by zero");
            }
            break;
            default:
                System.out.print("Invalid input!");
        }

        System.out.print(result);


    }
}