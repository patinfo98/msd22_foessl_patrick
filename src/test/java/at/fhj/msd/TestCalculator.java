package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {
    Calculator calculator;

    @BeforeEach
    void startUp(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Testing summation")
    void testAdd(){
        assertEquals(12, calculator.add(4,8));
        assertEquals(-4, calculator.add(-10, 6));
        assertEquals(0, calculator.add(0,0));

    }

    @Test
    @DisplayName("Testing subtraction")
    void testSub(){
        assertEquals(10, calculator.minus(5, -5));
        assertEquals(2, calculator.minus(-3, -5));
        assertEquals(5, calculator.minus(10, 5));
    }

    @Test
    @DisplayName("Testing multiply")
    void testMult(){
        Throwable exception = assertThrows(NumberFormatException.class, () -> calculator.multiply(Double.parseDouble("x"), 1));
        assertEquals(10, calculator.multiply(2, 5));
        assertEquals(0, calculator.multiply(3,0));
    }

    @Test
    @DisplayName("Testing division")
    void TestDiv(){
        Throwable exception = assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        assertEquals(5, calculator.divide(10,2));
        assertEquals(0, calculator.divide(0, 10));
    }

    @Test
    @DisplayName("Test faculty")
    void TestFac(){
        assertAll(
                () -> assertEquals(0, calculator.faculty(-1) ),
                () ->assertEquals(1, calculator.faculty(0)),
                () ->assertEquals(120, calculator.faculty(120)));
    }


}
