package Sem5;

import java.util.Set;
import java.util.TreeMap;
import java.util.HashSet;

public class StringSorter {
    public static void test5() {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Under the arc of a weather stain boards.");
        stringSet.add("Ancient goblins and warlords.");
        stringSet.add("Come out of the ground, not making a sound.");
        stringSet.add("The smell of death is all around.");

        TreeMap<Integer, Set<String>> sortedMap = sortStringsByLength(stringSet);

        // Print the sorted strings
        for (Integer length : sortedMap.keySet()) {
            Set<String> strings = sortedMap.get(length);
            for (String str : strings) {
                System.out.println(str);
            }
        }
    }

    public static TreeMap<Integer, Set<String>> sortStringsByLength(Set<String> strings) {
        TreeMap<Integer, Set<String>> sortedMap = new TreeMap<>();

        // Group strings by length
        for (String str : strings) {
            int length = str.length();
            sortedMap.computeIfAbsent(length, k -> new HashSet<>()).add(str);
        }
        return sortedMap;
    }
}



//    public static TreeMap<Integer, String> sortByLength(List<String> strings){
//        TreeMap<Integer, String> result = new TreeMap<>();
//        strings.forEach(s-> result.put(s.length(), s));
//        return result;
//    }
//
//    public static void main(String[] args) {
//        String sentence = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
//        var result = sortByLength(Arrays.stream(sentence.split(" ")).toList());
//        System.out.println(result);
//    }
