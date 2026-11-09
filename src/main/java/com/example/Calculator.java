package com.example;

/**
 * Core calculator logic.
 * Supports addition, subtraction, multiplication, division, and modulo.
 */
public class Calculator {

    /**
     * Adds two numbers.
     *
     * @param a first operand
     * @param b second operand
     * @return a + b
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts b from a.
     *
     * @param a first operand
     * @param b second operand
     * @return a - b
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     *
     * @param a first operand
     * @param b second operand
     * @return a * b
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides a by b.
     *
     * @param a dividend
     * @param b divisor
     * @return a / b
     * @throws ArithmeticException if b is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    /**
     * Returns the remainder of a divided by b.
     *
     * @param a dividend
     * @param b divisor
     * @return a % b
     * @throws ArithmeticException if b is zero
     */
    public double modulo(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Modulo by zero is not allowed.");
        }
        return a % b;
    }
}

