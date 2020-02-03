package Chapter8.Task808;

public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(1, 26, 1997);
        System.out.println("incrementing into the next month");
        for (int i = 0; i < 40; i++) {
            date1.nextDay();
            System.out.println(date1);
        }
        Date date2 = new Date(11, 25, 1997);
        System.out.println("incrementing into the next year");
        for (int i = 0; i < 70; i++) {
            date2.nextDay();
            System.out.println(date2);
        }
    }
}
