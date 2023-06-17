package Sem4;

import java.util.ArrayList;
import java.util.List;

public class TextMemory {
    public static boolean isInt(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static List<String> adder(String[] splitted, List<String> list) {
        if (isInt(splitted[1])) {
            int num = Integer.parseInt(splitted[1]);
            if (num > list.size()) {
                for (int i = list.size() - num; i < num + 1; ++i) {
                    list.add(" ");
                }
            }
            list.add(num, splitted[0]);
        }
        return list;
    }

    public static void run2() {
        List<String> textList = new ArrayList<>();
        textList.add("First");
        textList.add("Second");
        textList.add("Third");

        String[] splitted = {"NewText", "2"};
        textList = adder(splitted, textList);

        System.out.println(textList);
    }
}

