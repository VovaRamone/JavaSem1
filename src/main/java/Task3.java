import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task3 {
    public static void StudentParser() {
        String jsonFilePath = "C:/GIT/JAVASem/JavaSem1/src/main/java/students.json";
//        String jsonFilePath = "students.json";
        String jsonString = readJsonFile(jsonFilePath);

        if (jsonString != null) {
            try {
                JSONArray jsonArray = new JSONArray(jsonString);
                StringBuilder result = new StringBuilder();

                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    String surname = jsonObject.getString("surname");
                    String grade = jsonObject.getString("grade");
                    String subject = jsonObject.getString("subject");

                    result.append("Student ").append(surname)
                            .append(" received ").append(grade)
                            .append(" in subject ").append(subject)
                            .append(".\n");
                }

                System.out.println(result.toString());
            } catch (JSONException e) {
                System.out.println("Error parsing JSON.");
            }
        }
    }

    private static String readJsonFile(String filePath) {
        try {
            byte[] encodedBytes = Files.readAllBytes(Paths.get(filePath));
            return new String(encodedBytes);
        } catch (IOException e) {
            System.out.println("Error reading JSON file.");
        }
        return null;
    }
}

