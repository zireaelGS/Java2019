package Chapter8.Task808;

public class Date {
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year

    private static final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // constructor: confirm proper value for month and day given the year
    public Date(int month, int day, int year) {
        // check if year is OK
        if (year < 1900 || year > 2019)
            throw new IllegalArgumentException(
                    "year (" + year + ") must at least more than 1900 an less than this year");

        // check if month in range
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException(
                    "month (" + month + ") must be 1-12");

        // check if day in range for month
        if (day <= 0 ||
                (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day +
                    ") out-of-range for the specified month and year");

        // check for leap year if month is 2 and day is 29
        if (month == 2 && day == 29 && !(year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day +
                    ") out-of-range for the specified month and year");

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf(
                "Date object constructor for date %s%n", this);
    }

    public int getDay() {
        return day;
    }

    // return a String of the form month/day/year
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }

    public int nextDay() {
        day += 1;
        if (day > daysPerMonth[month]) {
            month += 1;
            day = 1;
        }
        if (month > 12) {
            year += 1;
            month = 1;
        }
        return day;
    }
} // end class Date

