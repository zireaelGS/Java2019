package Chapter8.Task807;

public class Time2 {
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // Time2 no-argument constructor:
    // initializes each instance variable to zero
    public Time2() {
        this(0, 0, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour supplied, minute and second defaulted to 0
    public Time2(int hour) {
        this(hour, 0, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour and minute supplied, second defaulted to 0
    public Time2(int hour, int minute) {
        this(hour, minute, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour, minute and second supplied
    public Time2(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    // Time2 constructor: another Time2 object supplied
    public Time2(Time2 time) {
        // invoke constructor with three arguments
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // Set Methods
    // set a new time value using universal time;
    // validate the data
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    // validate and set hour
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");

        this.hour = hour;
    }

    // validate and set minute
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");

        this.minute = minute;
    }

    // validate and set second
    public void setSecond(int second) {
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.second = second;
    }

    // Get Methods
    // get hour value
    public int getHour() {
        return hour;
    }

    // get minute value
    public int getMinute() {
        return minute;
    }

    // get second value
    public int getSecond() {
        return second;
    }

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    public void tick() {
        if (getHour() == 23 && getMinute() == 59 && getSecond() == 59) {
            setHour(0);
            setMinute(0);
            setSecond(0);
        } else if (getHour() == 11 && getMinute() == 59 && getSecond() == 59) {
            setHour(12);
            setMinute(0);
            setSecond(0);
        } else {
            setSecond(getSecond() + 1);
        }
    }

    public void incrementMinute() {
        if (getHour() == 23 && getMinute() == 59) {
            setHour(0);
            setMinute(0);
        } else if (getHour() == 11 && getMinute() == 59) {
            setHour(12);
            setMinute(0);
        } else {
            setMinute(getMinute() + 1);
        }
    }

    public void incrementHour() {
        if (getHour() == 23) {
            setHour(0);
        } else if (getHour() == 11) {
            setHour(12);
        } else {
            setHour(getHour() + 1);
        }
    }

}
