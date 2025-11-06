import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsVeryEasy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter your choice: rock, paper or scissors");
        String user = sc.nextLine();

        int randomNumber = rand.nextInt(3);  // 0, 1 or 2
        String computer = "";

        if (randomNumber == 0) {
            computer = "rock";
        } else if (randomNumber == 1) {
            computer = "paper";
        } else {
            computer = "scissors";
        }

        System.out.println("Computer chose: " + computer);

        if (user.equals(computer)) {
            System.out.println("It's a tie!");
        } else if (user.equals("rock") && computer.equals("scissors")) {
            System.out.println("You win!");
        } else if (user.equals("paper") && computer.equals("rock")) {
            System.out.println("You win!");
        } else if (user.equals("scissors") && computer.equals("paper")) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        sc.close();
    }
}
