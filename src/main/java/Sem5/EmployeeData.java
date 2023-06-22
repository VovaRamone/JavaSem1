package Sem5;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class EmployeeData {
    public static void test1() {
        // Create a HashMap to store the Passport Numbers and Surnames
        HashMap<Integer, String> employeeMap = new HashMap<>();

        // Add employee data to the HashMap
        employeeMap.put(123456, "Иванов");
        employeeMap.put(321456, "Васильев");
        employeeMap.put(234561, "Петрова");
        employeeMap.put(234432, "Иванов");
        employeeMap.put(654321, "Петрова");
        employeeMap.put(345678, "Иванов");

        // Find and display data for employees with the last name Ivanov
        List<Integer> passportNumbers = new ArrayList<>();
        for (Integer passportNumber : employeeMap.keySet()) {
            String surname = employeeMap.get(passportNumber);
            if (surname.equals("Иванов")) {
                passportNumbers.add(passportNumber);
            }
        }

        System.out.println("Номера паспортов сотрудников по фамилии Иванов:");
        for (Integer passportNumber : passportNumbers) {
            System.out.println(passportNumber + " " + employeeMap.get(passportNumber));
        }
    }
}
