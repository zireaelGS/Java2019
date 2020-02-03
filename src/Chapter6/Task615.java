package Chapter6;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task615 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1;
        double side2;
        System.out.println("Please enter the value for side1: ");
        side1 = input.nextDouble();
        System.out.println("Please enter the value for side2: ");
        side2 = input.nextDouble();
        System.out.println("The hypotenuse of a right triangle= " + hypotenuse(side1, side2));

    }

    public static double hypotenuse(double side1, double side2) {
        double hypotenuse;
        hypotenuse = sqrt(pow(side1, 2) + pow(side2, 2));
//        hypotenuse=hypot(side1,side2); можно еще и так
        return hypotenuse;
    }
}
