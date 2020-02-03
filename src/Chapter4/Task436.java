package Chapter4;

import java.util.Scanner;

public class Task436 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //треугольник существует если сумма длин двух его сторон больше третьей
        //a,b,c-it's a sides of the triangle
        int a;
        int b;
        int c;
        System.out.println("Enter first side of the right triangle a= ");
        a = input.nextInt();
        System.out.println("Enter sicond side of the right triangle b= ");
        b = input.nextInt();
        System.out.println("Enter third side of the right triangle c= ");
        c = input.nextInt();
        //a=5,b=12,c=13- right triangle
        if (a > 0 && b > 0 && c > 0) {
            if ((Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) || (Math.pow(b, 2) == Math.pow(c, 2) + Math.pow(a, 2))
                    || (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2))) {
                System.out.println("This numbers can represent the sides of a right triangle");
            } else {
                System.out.println("This numbers can't represent the sides of a right triangle");
            }
        }
    }
}
