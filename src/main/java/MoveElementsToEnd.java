import java.util.Arrays;

public class MoveElementsToEnd {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 3, 1, 3, 0, 1, 0, 3};
        int val = 3;

        System.out.println("Original array: " + Arrays.toString(nums));

        moveElementsToEnd(nums, val);

        System.out.println("Array after moving elements: " + Arrays.toString(nums));
    }

    private static void moveElementsToEnd(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] == val) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
            } else {
                left++;
            }
        }
    }
}

