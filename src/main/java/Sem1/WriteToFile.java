package Sem1;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        String data = "Name\tSurname\tAge\n" +
                "Kate\tSmith\t20\n" +
                "Paul\tGreen\t25\n" +
                "Mike\tBlack\t23";

        String fileName = "Task9.txt";

        try {
            writeToFile(data, fileName);
            System.out.println("Data written to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    private static void writeToFile(String data, String fileName) throws IOException {
        FileWriter writer = null;

        try {
            writer = new FileWriter(fileName);
            writer.write(data);
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}

