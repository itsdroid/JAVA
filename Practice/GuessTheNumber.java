import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = (int) Math.floor(Math.random() * 10);
        int userNum;
        do {
            System.out.println("Guess the number : ");
            userNum = sc.nextInt();

            if (userNum == num) {
                System.out.println("Wohoo!! , You guessed it right ");
                break;
            } else if (userNum < num) {
                System.out.println("Guessed number is too low !");
            } else {
                System.out.println("Guessed number is too high !");
            }
        } while (userNum > 0);
    }
}
