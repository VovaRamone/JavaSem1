package Sem2DZ;
import org.json.JSONObject;

public class Task1 {
    public static void QueryBuilder() {
        String jsonString = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        JSONObject filter = new JSONObject(jsonString);

        StringBuilder queryBuilder = new StringBuilder("select * from students where");

        if (filter.has("name")) {
            queryBuilder.append(" name = '").append(filter.getString("name")).append("' and");
        }

        if (filter.has("country")) {
            queryBuilder.append(" country = '").append(filter.getString("country")).append("' and");
        }

        if (filter.has("city")) {
            queryBuilder.append(" city = '").append(filter.getString("city")).append("' and");
        }

        if (filter.has("age") && !"null".equals(filter.getString("age"))) {
            queryBuilder.append(" age = ").append(filter.getInt("age")).append(" and");
        }

        // Remove the trailing "and" if any
        int length = queryBuilder.length();
        if (queryBuilder.charAt(length - 1) == 'd' && queryBuilder.charAt(length - 2) == 'n' && queryBuilder.charAt(length - 3) == 'a') {
            queryBuilder.setLength(length - 4);
        }

        String query = queryBuilder.toString();
        System.out.println(query);
    }
}


