package Chapter8.Task807;

public class Time2Test {

    public static void main(String[] args) {
        Time2 t1 = new Time2(23, 34, 42); // 12:25:42
        Time2 t2 = new Time2(11, 59, 59); // 12:25:42

        System.out.println("Constructed with:");
        displayTime("t1: hour, minute and second specified", t1);

        t1.incrementMinute();
        System.out.println("incrementing into the next minute:");
        displayTime("t1: hour, minute and second specified", t1);

        t1.incrementHour();
        System.out.println("incrementing into the next hour:");
        displayTime("t1: hour, minute and second specified", t1);


        System.out.println("Constructed with:");
        displayTime("t2: hour, minute and second specified", t2);

        t2.tick();
        System.out.println("incrementing into the next day (i.e., 11:59:59 PM to 12:00:00 AM).:");
        displayTime("t2: hour, minute and second specified", t2);


    }

    // displays a Time2 object in 24-hour and 12-hour formats
    private static void displayTime(String header, Time2 t) {
        System.out.printf("%s%n   %s%n   %s%n",
                header, t.toUniversalString(), t.toString());
    }
}
