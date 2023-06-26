package Sem6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
    public static void sem6Test1() {
        // HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(6);
        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(6);
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(6);
        linkedHashSet.add(4);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(5);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(6);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(6);
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(6);
        System.out.println("TreeSet: " + treeSet);
    }
}

