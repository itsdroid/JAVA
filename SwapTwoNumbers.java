import java.util.Arrays;
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void swap(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // input two numbers
        System.out.print("Enter the first number: ");
        int[] nums = new int[2];
        nums[0] = sc.nextInt();
        System.out.print("Enter the second number: ");
        nums[1] = sc.nextInt();

        System.out.println("-----------------------------------------------");
        System.out.println("Before swap a: " + nums[0] + " and b: " + nums[1]);
        swap(nums);
        System.out.println("After swap a: " + nums[0] + " and b: " + nums[1]);

    }
}