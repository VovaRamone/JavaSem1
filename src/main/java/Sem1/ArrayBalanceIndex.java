package Sem1;

public class ArrayBalanceIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};

        int balanceIndex = findBalanceIndex(nums);

        if (balanceIndex == -1) {
            System.out.println("No balance index found");
        } else {
            System.out.println("Balance index: " + balanceIndex);
        }
    }

    private static int findBalanceIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of all elements
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate through the array and check for balance index
        for (int i = 0; i < nums.length; i++) {
            totalSum -= nums[i];  // Subtract the current element from the total sum
            if (leftSum == totalSum) {
                return i;  // Found balance index
            }
            leftSum += nums[i];  // Add the current element to the left sum
        }

        return -1;  // No balance index found
    }
}
