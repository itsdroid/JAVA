
import java.util.Scanner;

public class SumAndAvg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[100];
        int sum = 0, count = 0;

        System.out.println("Enter numbers (enter 0 to stop)");

        while (true) {
            int position = count;
            String counterWord;
            if (position % 10 == 1 && position != 11) {
                counterWord = "st";
            } else if (position % 10 == 2 && position != 12) {
                counterWord = "nd";
            } else if (position % 10 == 3 && position != 13) {
                counterWord = "rd";
            } else {
                counterWord = "th";
            }

            System.out.print("Enter your " + count + counterWord + " number: ");
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }
            numbers[count] = num;
            count++;
        }

        for (int i = 0; i < count; i++) {
            sum += numbers[i];
        }

        double avg = sum / count;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
