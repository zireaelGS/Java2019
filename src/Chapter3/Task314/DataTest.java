package Chapter3.Task314;

public class DataTest {
    public static void main(String[] args) {

        Data data1 = new Data(12, 12, 2012);
        Data data2 = new Data(-12, 12, 2012);
        Data data3 = new Data(12, 12, 3200);

        data1.displayDate();
        data2.displayDate();
        data3.displayDate();

    }
}
