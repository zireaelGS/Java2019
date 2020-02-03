package Chapter4;

public class Task422 {
    public static void main(String[] args) {
        int number = 1;
        System.out.println("N     " + "10*N   " + "100*N  " + "1000*N   ");
        while (number <= 4) {
            System.out.println(number + "     " + number * 10 + "     " + number * 100 + "     " + number * 1000);
            number++;
        }
    }
}
