package Chapter14;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] month = {"", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        System.out.println("Please enter the date in that format: mm/dd/yyyy");
        String date = input.nextLine();
        System.out.println(date);

        if (date.matches("(0[1-9]|1[0-2])/(0[1-9]|[1-2]\\d|3[0-1])/(\\d{4})")) {
            System.out.println(month[Integer.parseInt(date.substring(0, 2))] + " " +
                    date.substring(3, 5) + ", " + date.substring(6));
        } else {
            System.out.println("Try again, you should enter correct date");
        }
    }
}
