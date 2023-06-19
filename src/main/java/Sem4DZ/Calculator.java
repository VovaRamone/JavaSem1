package Sem4DZ;

import java.util.Scanner;

public class Calculator {
    private static double result;
    private static double previousResult;
    private static boolean hasPreviousResult;

    public static void runDZ3() {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.print("Enter the first number: ");
            double num1 = readDouble(scanner);

            System.out.print("Enter an operator (+, -, *, /, u for undo, q for quit): ");
            String operator = scanner.next();

            if (operator.equals("u")) {
                undoLastOperation();
                continue;
            } else if (operator.equals("q")) {
                exit = true;
                continue;
            }

            System.out.print("Enter the second number: ");
            double num2 = readDouble(scanner);

            switch (operator) {
                case "+":
                    performAddition(num1, num2);
                    break;
                case "-":
                    performSubtraction(num1, num2);
                    break;
                case "*":
                    performMultiplication(num1, num2);
                    break;
                case "/":
                    performDivision(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator");
                    break;
            }

            System.out.println("Result: " + result);
            System.out.println();
        }
    }

    private static double readDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next(); // Clear the invalid input
        }
        return scanner.nextDouble();
    }

    private static void performAddition(double num1, double num2) {
        result = num1 + num2;
        storePreviousResult();
    }

    private static void performSubtraction(double num1, double num2) {
        result = num1 - num2;
        storePreviousResult();
    }

    private static void performMultiplication(double num1, double num2) {
        result = num1 * num2;
        storePreviousResult();
    }

    private static void performDivision(double num1, double num2) {
        if (num2 != 0) {
            result = num1 / num2;
            storePreviousResult();
        } else {
            System.out.println("Error: Division by zero");
        }
    }

    private static void storePreviousResult() {
        previousResult = result;
        hasPreviousResult = true;
    }

    private static void undoLastOperation() {
        if (hasPreviousResult) {
            result = previousResult;
            System.out.println("Undo successful");
        } else {
            System.out.println("No previous result to undo");
        }
    }
}

