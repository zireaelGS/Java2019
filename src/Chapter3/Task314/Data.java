package Chapter3.Task314;

public class Data {
    private int day;
    private int month;
    private int year;

    public Data(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void setDay(int day) {
        if (day > 0 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Please check the value of the day that you entered");
        }
    }

    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Please check the value of the month that you entered");
        }
    }

    public void setYear(int year) {
        if (year >= 3000) {
            System.out.println("Oh, it seems you ran a little ahead ... Well, a littlebit... in the next millennium...");
        } else if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Please check the value of the year that you entered");
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    //method displayDate that displays the month, day and year separated by forward slashes (/)
    public void displayDate() {
        System.out.printf("%d/%d/%d%n", getDay(), getMonth(), getYear());
    }

}

