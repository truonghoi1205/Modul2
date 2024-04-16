package ss9_automation_and_tdd.bai_tap.calculate_the_next_day;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayCalculatorTest {
    @Test
    public void calculatorNextDay1Month1Year2018() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = String.format("%d / %d / %d", 2, 1, 2018);
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String actualDate = nextDayCalculator.CalculatorNextDay(day,month,year);
        assertEquals(expected,actualDate);
    }

    @Test
    public void calculatorNextDay31Month1Year2018() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = String.format("%d / %d / %d", 1, 2, 2018);
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String actualDate = nextDayCalculator.CalculatorNextDay(day,month,year);
        assertEquals(expected,actualDate);
    }
    @Test
    public void calculatorNextDay30Month4Year2018() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = String.format("%d / %d / %d", 1, 5, 2018);
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String actualDate = nextDayCalculator.CalculatorNextDay(day,month,year);
        assertEquals(expected,actualDate);
    }
      @Test
    public void calculatorNextDay28Month2Year2018() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = String.format("%d / %d / %d", 1, 3, 2018);
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String actualDate = nextDayCalculator.CalculatorNextDay(day,month,year);
        assertEquals(expected,actualDate);
    }
  @Test
    public void calculatorNextDay29Month2Year2020() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = String.format("%d / %d / %d", 1, 3, 2020);
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String actualDate = nextDayCalculator.CalculatorNextDay(day,month,year);
        assertEquals(expected,actualDate);
    }
    @Test
    public void calculatorNextDay31Month12Year2018() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = String.format("%d / %d / %d", 1, 1, 2019);
        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        String actualDate = nextDayCalculator.CalculatorNextDay(day,month,year);
        assertEquals(expected,actualDate);
    }


}
