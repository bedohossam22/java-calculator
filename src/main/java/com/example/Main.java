package com.example;

import java.util.Scanner;

/**
 * Entry point for the Java Calculator console application.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("╔══════════════════════════╗");
        System.out.println("║    Java Calculator 1.0   ║");
        System.out.println("╚══════════════════════════╝");

        boolean running = true;

        while (running) {
            System.out.println("\nOperations:");
            System.out.println("  1. Addition       (+)");
            System.out.println("  2. Subtraction    (-)");
            System.out.println("  3. Multiplication (*)");
            System.out.println("  4. Division       (/)");
            System.out.println("  5. Modulo         (%)");
            System.out.println("  0. Exit");
            System.out.print("\nChoose an operation: ");

            String choice = scanner.nextLine().trim();

            if (choice.equals("0")) {
                System.out.println("Goodbye!");
                running = false;
                continue;
            }

            if (!choice.matches("[1-5]")) {
                System.out.println("Invalid choice. Please enter a number between 0 and 5.");
                continue;
            }

            double a = readNumber(scanner, "Enter first number : ");
            double b = readNumber(scanner, "Enter second number: ");

            try {
                double result = switch (choice) {
                    case "1" -> calculator.add(a, b);
                    case "2" -> calculator.subtract(a, b);
                    case "3" -> calculator.multiply(a, b);
                    case "4" -> calculator.divide(a, b);
                    case "5" -> calculator.modulo(a, b);
                    default -> throw new IllegalStateException("Unexpected choice: " + choice);
                };

                String operator = switch (choice) {
                    case "1" -> "+";
                    case "2" -> "-";
                    case "3" -> "*";
                    case "4" -> "/";
                    case "5" -> "%";
                    default -> "?";
                };

                // Format result: show integer if no fractional part
                String formatted = (result == Math.floor(result) && !Double.isInfinite(result))
                        ? String.valueOf((long) result)
                        : String.valueOf(result);

                System.out.printf("%n  %.6g %s %.6g = %s%n", a, operator, b, formatted);

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    /**
     * Prompts the user and reads a valid double, retrying on bad input.
     */
    private static double readNumber(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("  ⚠ Invalid number, please try again.");
            }
        }
    }
}
