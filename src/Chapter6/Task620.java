package Chapter6;
import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Task620 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        System.out.println("Please enter the radius of the circle:");
        radius = input.nextDouble();
        System.out.println("The area of the circle= " + circleArea(radius));

    }

    public static double circleArea(double radius) {
        double Area;
        Area = PI * pow(radius, 2);
        return Area;
    }
}
