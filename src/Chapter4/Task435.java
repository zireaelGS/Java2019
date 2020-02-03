package Chapter4;

import java.util.Scanner;

public class Task435 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //треугольник существует если сумма длин двух его сторон больше третьей
        //a,b,c-it's a sides of the triangle
        int a;
        int b;
        int c;
        System.out.println("Enter first side of the triangle a= ");
        a = input.nextInt();
        System.out.println("Enter sicond side of the triangle b= ");
        b = input.nextInt();
        System.out.println("Enter third side of the triangle c= ");
        c = input.nextInt();
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && b + c > a && a + c > b) {
                System.out.println("This numbers can represent the sides of a triangle");
            } else {
                System.out.println("This numbers can't represent the sides of a triangle");
            }
        } else {
            System.out.println("Please enter the number more that zero");
        }
    }


}
