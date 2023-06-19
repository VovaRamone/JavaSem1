package Sem4;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkListSolution {

    private static LinkedList<String> list = new LinkedList<>();

    public static void run() {
        boolean getIteration = true;
        while (getIteration) {
            String cmd = InputUser("Enter the command");
            String[] cline = cmd.toUpperCase().split("~");
            switch (cline[0]) {
                case "EXIT":
                    getIteration = false;
                    break;
                case "PRINT":
                    System.out.println(list.get(Integer.parseInt(cline[1])));
                    break;
                case "LIST":
                    while (list.size() > 0) {
                        System.out.println(list.pop());
                    }
                    break;
                case "REVERSE":
                    reverseList();
                    System.out.println("Reversed List:");
                    for (String item : list) {
                        System.out.println(item);
                    }
                    break;
                default:
                    if (cline.length > 1) {
                        if (isInt(cline[1])) {
                            adder(cline, list);
                        } else {
                            list.addFirst(cline[0]);
                        }
                    } else {
                        list.addFirst(cline[0]);
                    }
                    break;
            }
        }

    }

    private static String InputUser(String msg) {
        System.out.println(msg + " -> ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static boolean isInt(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static LinkedList<String> adder(String[] splitted, LinkedList<String> list) {
        if (isInt(splitted[1])) {
            int num = Integer.parseInt(splitted[1]);
            if (num > list.size()) {
                for (int i = list.size() - num; i < num + 1; i++) {
                    list.add(" ");
                }
            }
            list.add(num, splitted[0]);
        }
        return list;
    }

    private static void reverseList() {
        LinkedList<String> reversedList = new LinkedList<>();
        while (!list.isEmpty()) {
            reversedList.addFirst(list.pop());
        }
        list = reversedList;
    }
}
