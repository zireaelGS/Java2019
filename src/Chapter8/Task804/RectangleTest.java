package Chapter8.Task804;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //if we will input right numbers
        Rectangle rectangle1 = new Rectangle(6, 5);
        System.out.println(rectangle1.perimeter(rectangle1.getLength(), rectangle1.getWidth()));
        System.out.println(rectangle1.area(rectangle1.getLength(), rectangle1.getWidth()));
        //if we will input wrong numbers
        Rectangle rectangle2 = new Rectangle(-99, 21);
        System.out.println(rectangle2.perimeter(rectangle2.getLength(), rectangle2.getWidth()));
        System.out.println(rectangle2.area(rectangle2.getLength(), rectangle2.getWidth()));

    }
}
