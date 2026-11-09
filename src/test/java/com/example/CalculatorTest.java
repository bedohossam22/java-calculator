package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link Calculator}.
 */
@DisplayName("Calculator Tests")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    // ── Addition ──────────────────────────────────────────────────────────────

    @Test
    @DisplayName("2 + 3 = 5")
    void testAddPositives() {
        assertEquals(5.0, calculator.add(2, 3));
    }

    @Test
    @DisplayName("-1 + -4 = -5")
    void testAddNegatives() {
        assertEquals(-5.0, calculator.add(-1, -4));
    }

    @Test
    @DisplayName("0 + 0 = 0")
    void testAddZeros() {
        assertEquals(0.0, calculator.add(0, 0));
    }

    // ── Subtraction ───────────────────────────────────────────────────────────

    @Test
    @DisplayName("10 - 4 = 6")
    void testSubtract() {
        assertEquals(6.0, calculator.subtract(10, 4));
    }

    @Test
    @DisplayName("3 - 5 = -2")
    void testSubtractNegativeResult() {
        assertEquals(-2.0, calculator.subtract(3, 5));
    }

    // ── Multiplication ────────────────────────────────────────────────────────

    @Test
    @DisplayName("3 * 4 = 12")
    void testMultiply() {
        assertEquals(12.0, calculator.multiply(3, 4));
    }

    @Test
    @DisplayName("0 * 999 = 0")
    void testMultiplyByZero() {
        assertEquals(0.0, calculator.multiply(0, 999));
    }

    @Test
    @DisplayName("-2 * -3 = 6")
    void testMultiplyNegatives() {
        assertEquals(6.0, calculator.multiply(-2, -3));
    }

    // ── Division ──────────────────────────────────────────────────────────────

    @Test
    @DisplayName("10 / 2 = 5")
    void testDivide() {
        assertEquals(5.0, calculator.divide(10, 2));
    }

    @Test
    @DisplayName("7 / 2 = 3.5")
    void testDivideDecimal() {
        assertEquals(3.5, calculator.divide(7, 2));
    }

    @Test
    @DisplayName("Division by zero throws ArithmeticException")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }

    // ── Modulo ────────────────────────────────────────────────────────────────

    @Test
    @DisplayName("10 % 3 = 1")
    void testModulo() {
        assertEquals(1.0, calculator.modulo(10, 3));
    }

    @Test
    @DisplayName("Modulo by zero throws ArithmeticException")
    void testModuloByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.modulo(5, 0));
    }
}
