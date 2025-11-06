
import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input;
        int r = (int) (Math.floor(Math.random() * 4) + 1);
        do {
            System.out.println("-------------------------------------------------------------");
            System.out.print("Enter the number for choosing your move \n 1. Rock  \n 2. Paper \n 3. Scissors \n 4. Exit \n : ");
            input = sc.nextInt();

            if (r == input) {
                System.out.println("Thats a draw !");
            } else if (input == 1 && r == 2) {
                System.out.println("System choosen Paper You lost ! ");
            } else if (input == 1 && r == 3) {
                System.out.println("Sytem choosen Scissors You Won !");
            } else if (input == 2 && r == 1) {
                System.out.println("System choosen Rock You won !");
            }
            else if (input == 2 && r == 3) {
                System.out.println("System choosen Scissors You lost !");
            } 
            else if (input == 3 && r == 1) {
                System.out.println("System choosen Rock you lost !");
            }
            else if (input == 3 && r == 2) {
                System.out.println("System choosen Paper you Won !");
            }
            else if (input == 4 ) {
                System.out.println("Exiting ..............");
                break;
            }
            
        } while (true);
    }
}
