package ss9_automation_and_tdd.thuc_hanh.simple_calculator_application;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {
    @Test
    public void testAdd0And0() {
        int first = 0;
        int second = 0;
        int expected = 0;

        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    public void testAdd1And0() {
        int first = 1;
        int second = 0;
        int expected = 1;

        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    public void testAdd3And5() {
        int first = 3;
        int second = 5;
        int expected = 8;

        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    public void testSub0and0() {
        int first = 0;
        int second = 0;
        int expected = 0;
        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    public void testSub0and1() {
        int first = 0;
        int second = 1;
        int expected = -1;
        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }
    @Test
    public void testSub5and3() {
        int first = 5;
        int second = 3;
        int expected = 2;
        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }
}
