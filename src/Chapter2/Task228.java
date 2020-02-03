package Chapter2;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Task228 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int radius;
        double diameter;
        double circumference;
        double area;

        System.out.print("Enter the radius of a circle: "); // prompt
        radius = input.nextInt();

        diameter = 2 * radius;
        circumference = 2 * PI * radius;
        area = PI * radius * 2;

        System.out.println("The diameter of a circle= " + diameter);
        System.out.println("The circumference of a circle= " + circumference);
        System.out.println("The area of a circle= " + area);


    }
}

