package Sem3DZ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveEvenNumbers {
    public static void run2() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        System.out.println("Original list: " + numbers);

        removeEvenNumbers(numbers);

        System.out.println("List after removing even numbers: " + numbers);
    }

    private static void removeEvenNumbers(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
    }
}

