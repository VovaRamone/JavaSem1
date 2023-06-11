import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Task4 {
    private static final Logger logger = Logger.getLogger(SimpleCalculator.class.getName());
    private static FileHandler fileHandler;

    public static void LogCalc() {
        configureLogger();

        Scanner scanner = new Scanner(System.in);

        logger.info("Enter the first number: ");
        double num1 = scanner.nextDouble();

        logger.info("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        logger.info("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                logger.severe("Invalid operator");
                return; // Exit the program if the operator is invalid
        }

        logger.info("Result: " + result);
        logCalculation(num1, operator, num2, result);
    }

    private static void configureLogger() {
        try {
            fileHandler = new FileHandler("calculations.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setLevel(Level.ALL);
        } catch (IOException e) {
            logger.severe("Failed to configure logger: " + e.getMessage());
        }
    }

    public static void logCalculation(double num1, char operator, double num2, double result) {
        logger.info("Calculation: " + num1 + " " + operator + " " + num2 + " = " + result);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if (fileHandler != null) {
            fileHandler.close();
        }
    }
}
