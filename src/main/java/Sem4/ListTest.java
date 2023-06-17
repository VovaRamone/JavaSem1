package Sem4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void run1() {
        int numElements = 10000000;

        // Measure time for ArrayList
        long startTimeArrayList = System.currentTimeMillis();
        addElementsToArrayList(numElements);
        long endTimeArrayList = System.currentTimeMillis();
        long durationArrayList = endTimeArrayList - startTimeArrayList;

        // Measure time for LinkedList
        long startTimeLinkedList = System.currentTimeMillis();
        addElementsToLinkedList(numElements);
        long endTimeLinkedList = System.currentTimeMillis();
        long durationLinkedList = endTimeLinkedList - startTimeLinkedList;

        // Print the results
        System.out.println("Time taken to add " + numElements + " elements to ArrayList: " + durationArrayList + "ms");
        System.out.println("Time taken to add " + numElements + " elements to LinkedList: " + durationLinkedList + "ms");
    }

    private static void addElementsToArrayList(int numElements) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numElements; i++) {
            arrayList.add(i);
        }
    }

    private static void addElementsToLinkedList(int numElements) {
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < numElements; i++) {
            linkedList.add(i);
        }
    }
}

