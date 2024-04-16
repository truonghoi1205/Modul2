package ss9_automation_and_tdd.bai_tap.calculate_the_next_day;

public class NextDayCalculator {
    String nextDay;
    public String CalculatorNextDay(int day, int month, int year) {
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1) {
            throw new IllegalArgumentException("Invalid date");
        }
        int maxDaysInMonth = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDaysInMonth = 30;
        } else if (month == 2) {
            maxDaysInMonth = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
        }
        if (day > maxDaysInMonth) {
            throw new IllegalArgumentException("Invalid day for the given month");
        }
        if (day == maxDaysInMonth) {
            day = 1;
            if (month == 12) {
                month = 1;
                year++;
            } else {
                month++;
            }
        } else {
            day++;
        }
        return nextDay = day + " / " + month + " / " + year;
    }
}
