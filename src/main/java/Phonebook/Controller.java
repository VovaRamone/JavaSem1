package Phonebook;

import java.util.Scanner;

public class Controller {
    public static void start() {
        Model.openPb();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int choice = View.mainMenu(scanner);

            switch (choice) {
                case 1:
                    Model.openPb();
                    View.printMessage(Text.LOAD_SUCCESSFUL);
                    break;
                case 2:
                    Model.savePb();
                    View.printMessage(Text.SAVE_SUCCESSFUL);
                    break;
                case 3:
                    Contact[] pb = Model.getPb();
                    View.printContacts(pb, Text.PB_EMPTY);
                    break;
                case 4:
                    Contact newContact = View.inputContact(scanner, Text.INPUT_NEW_CONTACT);
                    Model.addContact(newContact);
                    break;
                case 5:
                    String keyword = View.inputSearch(scanner, Text.INPUT_SEARCH);
                    Contact[] result = Model.searchContact(keyword);
                    View.printContacts(result, Text.emptySearch(keyword));
                    break;
                case 6:
                    keyword = View.inputSearch(scanner, Text.INPUT_CHANGE);
                    result = Model.searchContact(keyword);
                    if (result.length > 0) {
                        if (result.length > 1) {
                            View.printContacts(result, "");
                            int currentIndex = View.inputIndex(scanner, Text.INPUT_INDEX);
                            if (currentIndex >= 0 && currentIndex < result.length) {
                                Contact currentContact = result[currentIndex];
                                Contact newContactData = View.inputContact(scanner, Text.CHANGE_CONTACT);
                                Model.changeContact(newContactData, currentIndex);
                            } else {
                                View.printMessage(Text.emptySearch(keyword));
                            }
                        } else {
                            Contact currentContact = result[0];
                            Contact newContactData = View.inputContact(scanner, Text.CHANGE_CONTACT);
                            Model.changeContact(newContactData, 0);
                        }
                    } else {
                        View.printMessage(Text.emptySearch(keyword));
                    }
                    break;
                case 7:
                    keyword = View.inputSearch(scanner, Text.INPUT_DELETE);
                    result = Model.searchContact(keyword);
                    if (result.length > 0) {
                        if (result.length > 1) {
                            View.printContacts(result, "");
                            int currentIndex = View.inputIndex(scanner, Text.INPUT_INDEX);
                            if (currentIndex >= 0 && currentIndex < result.length) {
                                Model.deleteContact(currentIndex);
                            } else {
                                View.printMessage(Text.emptySearch(keyword));
                            }
                        } else {
                            Model.deleteContact(0);
                        }
                    } else {
                        View.printMessage(Text.emptySearch(keyword));
                    }
                    break;
                case 8:
                    boolean saveBeforeExit = View.askSaveBeforeExit(scanner);
                    if (saveBeforeExit) {
                        Model.savePb();
                    }
                    scanner.close();
                    System.exit(0);
                    break;
            }
        }
    }
}


