
public class SwapTwoNumbers {

    public static void swap(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
    }
    public static void main(String args[]) {
        int[] nums = {5, 7};
        System.out.println("Before swap a: " + nums[0] + " and b: " + nums[1]);
        swap(nums);
        System.out.println("After swap a: " + nums[0] + " and b: " + nums[1]);
    }
}
