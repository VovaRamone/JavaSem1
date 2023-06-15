package Sem3DZ;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListStats {
    public static void run3()
    {
        List<Integer> numbers = generateRandomNumbers(20);

        System.out.println("Numbers: " + numbers);

        int minimum = findMinimum(numbers);
        int maximum = findMaximum(numbers);
        double average = calculateAverage(numbers);

        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
        System.out.println("Average: " + average);
    }

    private static List<Integer> generateRandomNumbers(int size) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int number = random.nextInt(100) + 1;
            numbers.add(number);
        }
        return numbers;
    }

    private static int findMinimum(List<Integer> numbers) {
        int minimum = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < minimum) {
                minimum = number;
            }
        }
        return minimum;
    }

    private static int findMaximum(List<Integer> numbers) {
        int maximum = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }
        return maximum;
    }

    private static double calculateAverage(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }
}

