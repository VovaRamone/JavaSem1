package Phonebook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Model {
    private static final String PATH = "phonebook.txt";
    private static List<Contact> phoneBook = new ArrayList<>();

    public static void openPb() {
        phoneBook.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(":");
                phoneBook.add(new Contact(fields[0], fields[1], fields[2], fields[3]));
            }
            System.out.println(Text.LOAD_SUCCESSFUL);
        } catch (FileNotFoundException e) {
            System.out.println(Text.PB_EMPTY);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void savePb() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH))) {
            for (Contact contact : phoneBook) {
                writer.write(contact.getId() + ":" +
                        contact.getName() + ":" +
                        contact.getPhone() + ":" +
                        contact.getComment());
                writer.newLine();
            }
            System.out.println(Text.SAVE_SUCCESSFUL);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Contact[] getPb() {
        return phoneBook.toArray(new Contact[0]);
    }

    public static void addContact(Contact contact) {
        String id = String.valueOf(phoneBook.size() + 1);
        contact.setId(id);
        phoneBook.add(contact);
        System.out.println(Text.newContactSuccessful(contact.getName()));
    }

    public static Contact[] searchContact(String keyword) {
        List<Contact> result = new ArrayList<>();
        for (Contact contact : phoneBook) {
            if (contact.getName().toLowerCase().contains(keyword.toLowerCase()) ||
                    contact.getPhone().toLowerCase().contains(keyword.toLowerCase()) ||
                    contact.getComment().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(contact);
            }
        }
        return result.toArray(new Contact[0]);
    }

    public static void changeContact(Contact newContact, int index) {
        if (index >= 0 && index < phoneBook.size()) {
            Contact contact = phoneBook.get(index);
            contact.setName(newContact.getName() != null ? newContact.getName() : contact.getName());
            contact.setPhone(newContact.getPhone() != null ? newContact.getPhone() : contact.getPhone());
            contact.setComment(newContact.getComment() != null ? newContact.getComment() : contact.getComment());
            System.out.println(Text.changeSuccessful(contact.getName()));
        }
    }

    public static void deleteContact(int index) {
        if (index >= 0 && index < phoneBook.size()) {
            Contact contact = phoneBook.remove(index);
            System.out.println(String.format(Text.DELETE_SUCCESSFUL, contact.getName()));
        }
    }
}

