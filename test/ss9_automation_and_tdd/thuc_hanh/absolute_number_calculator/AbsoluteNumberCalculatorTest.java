package ss9_automation_and_tdd.thuc_hanh.absolute_number_calculator;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AbsoluteNumberCalculatorTest {
    @Test
    public void testFindAbsolute0() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }

    @Test
    public void testFindAbsolutePositive() {
        int number = 2;
        int expected = 2;

        int result = AbsoluteNumberCalculator.findAbsolute(number);//result = 1;
        assertEquals(expected,result);//1 == 1
    }

    @Test
    public void testFindAbsoluteNegative() {
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
}
