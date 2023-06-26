package Sem6;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UniquePercentageCalculator {
    public static void sem6Test2() {
        int[] array = new int[300]; // Create an array of 1000 elements

        fillArrayWithRandomNumbers(array); // Fill the array with random numbers from 0 to 24

        float uniquePercentage = calculateUniquePercentage(array); // Calculate the percentage of unique numbers

        System.out.println("Unique Percentage: " + uniquePercentage + "%");
    }

    /**
     * Fills the given array with random numbers from 0 to 24.
     *
     * @param array The array to be filled with random numbers.
     */
    private static void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25); // Generate a random number from 0 to 24
        }
    }

    /**
     * Calculates the percentage of unique numbers in the given array.
     *
     * @param array The array to calculate the unique percentage from.
     * @return The percentage of unique numbers as a floating point number.
     */
    private static float calculateUniquePercentage(int[] array) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        // Add all elements of the array to the set to get unique numbers
        for (int num : array) {
            uniqueNumbers.add(num);
        }

        int uniqueCount = uniqueNumbers.size();
        int totalCount = array.length;

        return (float) (uniqueCount * 100.0 / totalCount);
    }
}

