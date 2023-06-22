package Phonebook;

public class Text {
    public static final String MAIN_MENU = "\nГлавное меню:\n" +
            "1. Открыть файл\n" +
            "2. Сохранить файл\n" +
            "3. Показать контакты\n" +
            "4. Добавить контакт\n" +
            "5. Найти контакт\n" +
            "6. Изменить контакт\n" +
            "7. Удалить контакт\n" +
            "8. Выход\n";

    public static final String INPUT_CHOICE = "Выберите пункт меню: ";
    public static final String LOAD_SUCCESSFUL = "Телефонная книга успешно открыта!";
    public static final String SAVE_SUCCESSFUL = "Телефонная книга успешно сохранена!";
    public static final String PB_EMPTY = "Телефонная книга пуста или не загружена!";
    public static final String INPUT_NEW_CONTACT = "Введите данные нового контакта: ";
    public static final String[] NEW_CONTACT = {"Введите имя: ", "Введите номер телефона: ", "Введите комментарий: "};

    public static String newContactSuccessful(String name) {
        return "Контакт " + name + " успешно добавлен";
    }

    public static final String INPUT_SEARCH = "Что будем искать: ";

    public static String emptySearch(String word) {
        return "Контакты содержащие слово \"" + word + "\" не найдены";
    }

    public static final String INPUT_CHANGE = "Какой контакт будем менять: ";
    public static final String INPUT_INDEX = "Введите индекс контакта: ";
    public static final String CHANGE_CONTACT = "Введите новые данные или оставьте поле пустым, чтобы не менять: ";

    public static String changeSuccessful(String name) {
        return "Контакт " + name + " успешно изменен!";
    }

    public static final String ASK_SAVE_BEFORE_EXIT = "Хотите сохранить данные перед выходом? (y/n): ";
    public static final String DELETE_SUCCESSFUL = "Контакт %s успешно удален!";
    public static final String INPUT_DELETE = "Какой контакт будем удалять: ";
}

