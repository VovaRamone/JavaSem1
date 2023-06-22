package Phonebook;

import java.util.Scanner;

public class View {
    public static int mainMenu(Scanner scanner) {
        System.out.println(Text.MAIN_MENU);
        int choice = 0;
        do {
            System.out.print(Text.INPUT_CHOICE);
            String input = scanner.nextLine();
            if (input.matches("\\d+")) {
                choice = Integer.parseInt(input);
            }
        } while (choice < 1 || choice > 8);
        return choice;
    }

    public static void printMessage(String message) {
        System.out.println();
        System.out.println(repeatChar('=', message.length()));
        System.out.println(message);
        System.out.println(repeatChar('=', message.length()) + "\n");
    }

    private static String repeatChar(char c, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void printContacts(Contact[] book, String error) {
        if (book.length > 0) {
            System.out.println();
            System.out.println("ID\tName\t\tPhone\t\tComment");
            for (Contact contact : book) {
                System.out.println(contact.getId() + "\t" +
                        contact.getName() + "\t" +
                        contact.getPhone() + "\t" +
                        contact.getComment());
            }
        } else {
            printMessage(error);
        }
    }

    public static Contact inputContact(Scanner scanner, String message) {
        System.out.println(message);
        String[] fields = new String[3];
        for (int i = 0; i < Text.NEW_CONTACT.length; i++) {
            System.out.print(Text.NEW_CONTACT[i]);
            fields[i] = scanner.nextLine();
        }
        return new Contact(fields[0], fields[1], fields[2]);
    }

    public static String inputSearch(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static int inputIndex(Scanner scanner, String message) {
        System.out.print(message);
        int index = 0;
        do {
            String input = scanner.nextLine();
            if (input.matches("\\d+")) {
                index = Integer.parseInt(input);
            }
        } while (index <= 0);
        return index;
    }

    public static boolean askSaveBeforeExit(Scanner scanner) {
        System.out.print(Text.ASK_SAVE_BEFORE_EXIT);
        String input = scanner.nextLine();
        return input.toLowerCase().equals("y");
    }

    public static String inputDelete(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}

