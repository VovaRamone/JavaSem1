import java.util.Arrays;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        // Generate an array of random binary numbers
        int[] binaryArray = generateBinaryArray(10);

        // Print the generated array
        System.out.println("Generated array: " + Arrays.toString(binaryArray));

        // Find the maximum number of consecutive 1's
        int maxConsecutiveOnes = findMaxConsecutiveOnes(binaryArray);

        // Print the result
        System.out.println("Maximum consecutive ones: " + maxConsecutiveOnes);
    }

    // Generate an array of random binary numbers
    private static int[] generateBinaryArray(int length) {
        int[] binaryArray = new int[length];
        for (int i = 0; i < length; i++) {
            binaryArray[i] = Math.random() < 0.5 ? 0 : 1;
        }
        return binaryArray;
    }

    // Find the maximum number of consecutive 1's in the array
    private static int findMaxConsecutiveOnes(int[] binaryArray) {
        int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;

        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 1) {
                currentConsecutiveOnes++;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);
            } else {
                currentConsecutiveOnes = 0;
            }
        }

        return maxConsecutiveOnes;
    }
}
