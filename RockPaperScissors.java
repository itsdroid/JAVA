import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] options = {"rock", "paper", "scissors"};
        System.out.println("Welcome to Rock, Paper, Scissors!");
        
        while (true) {
            System.out.print("\nEnter your move (rock, paper, scissors or quit): ");
            String userMove = sc.next().toLowerCase();

            if (userMove.equals("quit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {
                System.out.println("Invalid move, try again.");
                continue;
            }

            int compIndex = rand.nextInt(3);
            String compMove = options[compIndex];

            System.out.println("Computer chose: " + compMove);

            if (userMove.equals(compMove)) {
                System.out.println("It's a tie!");
            } else if (
                (userMove.equals("rock") && compMove.equals("scissors")) ||
                (userMove.equals("paper") && compMove.equals("rock")) ||
                (userMove.equals("scissors") && compMove.equals("paper"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }

        sc.close();
    }
}
