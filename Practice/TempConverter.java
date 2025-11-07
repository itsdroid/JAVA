import java.util.Scanner;
public class TempConverter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------Welcome to Temp converter---------");
        System.out.print("Menu \n 1. Celcius to Fahrenheit \n 2. Celcius to Kelvin \n 3. Fahrenheit to Celcius \n 4. Fahrenheit to Kelvin \n 5. Kelvin to Celcius \n 6. Kelvin to Fahrenheit");
        int input = sc.nextInt();
    
        System.out.println("Enter temprature: ");
        double temp = sc.nextDouble();

        double result=0;
        switch (input) {
            case 1:
                result = ((temp * 9/5) + 32);
                break;
            case 2:               
                result = (temp + 273.15);
                break;
            case 3:
                result = ((temp - 32) * 5/9);
                break;
            case 4:
                result = ((temp * 9/5 + 32) + 273.15);
                break;
            case 5:
                result = (temp - 273.15);
                break;
            case 6:
                result = ((temp - 273.15) * 9/5 + 32);
                break;
            default:
               System.out.println("Please enter a valid input");
        }
        System.out.print("result: " + result);
    }
}
