package Practice;
import java.util.Arrays;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String[] moves = { "Rock" , "Paper" , "Scissor"};
        int input;
        do {
            System.out.println("-----------------------------------------------------------------------");
            System.out.print("Enter your move:\n1. Rock\n2. Paper\n3. Scissors\n4. Exit\n: ");
            input = sc.nextInt();
            if (input == 4) break;
            if (input < 1 || input > 3) {
                System.out.println("Invalid input!");
                continue;
            }
            int r = (int) (Math.random()*3) + 1;
            System.out.println("System choice: " + moves[r-1]);
            if (r == input) System.out.println("Its a draw !");
            else if (input == 1 && r == 2 || input == 2 && r == 1 || input == 3 && r == 2 ) {
                System.out.println("You won !");
            }
            else {
                System.out.println("You lost !");
            }
        }
        while(true);
    }
}