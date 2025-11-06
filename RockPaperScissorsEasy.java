import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter your move (rock, paper, or scissors): ");
        String userMove = sc.next().toLowerCase();

        int computerNum = rand.nextInt(3);
        String computerMove = "";

        if (computerNum == 0) {
            computerMove = "rock";
        } else if (computerNum == 1) {
            computerMove = "paper";
        } else {
            computerMove = "scissors";
        }

        System.out.println("Computer chose: " + computerMove);

        if (userMove.equals(computerMove)) {
            System.out.println("It's a tie!");
        } else if (userMove.equals("rock") && computerMove.equals("scissors") ||
                   userMove.equals("paper") && computerMove.equals("rock") ||
                   userMove.equals("scissors") && computerMove.equals("paper")) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        sc.close();
    }
}
