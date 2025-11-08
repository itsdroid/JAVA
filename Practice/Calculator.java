
import java.util.Scanner;

public class Calculator {

    public static void calculatorOperation() {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        double result = 0;

        System.out.println(" \n -------Welcome to Calculator-------- ");
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

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
            case 5:
                break;
            default:
                System.out.println("Enter a valid input");
        }
        System.out.println("Result: " + result);
    }

    public static void factorial(Scanner sc) {
        System.out.println("\n ------Welcome to Factorial Calculator-----");
        int facto = 1;
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        for( int i = 1 ; i <= num ; i++){
            facto *= i;
        }
        System.out.println("Result: " + facto);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Welcome to simple calculator----");
        System.out.println(" Menu \n 1. Calcualtor \n 2. Factorial \n 3. Exit");
        System.out.print("Enter your choice: ");
        int input = sc.nextInt();

        if( input == 1) {
            calculatorOperation();
        }
        else if (input == 2) {
            factorial(sc);
        }
        else if(input == 0) {
            System.out.println("Exiting ......");
        }
        else {
            System.out.println("Please enter a valid input");
        }
    }
}


//  java Calculator.java
