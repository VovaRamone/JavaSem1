import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;


public class Task2 {
    public static void BS() {
        int[] array = generateRandomArray(10);
        System.out.println("Unsorted Array:");
        printArray(array);

        bubbleSort(array);

        System.out.println("Sorted Array:");
        printArray(array);
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;
        boolean sorted;
        FileWriter logFileWriter;

        try {
            logFileWriter = new FileWriter("log.txt");
        } catch (IOException e) {
            System.out.println("Error opening log file.");
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            sorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sorted = false;
                }
            }

            // Write current iteration to log file
            try {
                logFileWriter.write("Iteration " + (i + 1) + ": " + Arrays.toString(array) + "\n");
            } catch (IOException e) {
                System.out.println("Error writing to log file.");
                return;
            }

            if (sorted) {
                break;
            }
        }

        // Close the log file writer
        try {
            logFileWriter.close();
        } catch (IOException e) {
            System.out.println("Error closing log file.");
        }
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10); // Generate random numbers from 0 to 9
        }

        return array;
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
        System.out.println();
    }
}
