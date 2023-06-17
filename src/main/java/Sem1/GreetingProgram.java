import java.time.LocalTime;
import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Read the input string provided by the user
        String name = scanner.nextLine();

        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Determine the appropriate greeting based on the time of day
        String greeting;
        if (currentTime.isAfter(LocalTime.of(5, 0)) && currentTime.isBefore(LocalTime.of(12, 0))) {
            greeting = "Good morning";
        } else if (currentTime.isAfter(LocalTime.of(12, 0)) && currentTime.isBefore(LocalTime.of(18, 0))) {
            greeting = "Good afternoon";
        } else if (currentTime.isAfter(LocalTime.of(18, 0)) && currentTime.isBefore(LocalTime.of(23, 0))) {
            greeting = "Good evening";
        } else {
            greeting = "Good night";
        }

        // Print the greeting message with the user's name
        System.out.println(greeting + ", " + name + "!");

        // Close the scanner to release resources
        scanner.close();
    }
}

