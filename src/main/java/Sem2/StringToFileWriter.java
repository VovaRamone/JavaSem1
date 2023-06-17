package Sem2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringToFileWriter {
    public static void main(String[] args) {
        String rptdString = rptString("TEST", 100);
        wrtStrToFile(rptdString, "test.txt");
    }

    public static String rptString(String word, int reps) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < reps; i++) {
            stringBuilder.append(word);
        }
        return stringBuilder.toString();
    }

    public static void wrtStrToFile(String content, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("Успех.");
        } catch (IOException e) {
            System.err.println("Провал: " + e.getMessage());
        }
    }
}

