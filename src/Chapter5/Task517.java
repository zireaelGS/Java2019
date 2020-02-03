package Chapter5;

import java.util.Scanner;

public class Task517 {
    public static void main(String[] args) {
        double product1 = 2.98;
        double product2 = 4.5;
        double product3 = 9.98;
        double product4 = 4.49;
        double product5 = 6.87;
        double totalRetail = 0;
        int quantity;//кол-во
        int product = 0;
        Scanner input = new Scanner(System.in);
        // sentinel-controlled loop
        while (true) {
            System.out.println("Enter the product number or -1 to exit: ");
            product = input.nextInt();
            if (product == -1) {
                break;
            }
            System.out.println("Enter the quantity sold: ");
            quantity = input.nextInt();

            switch (product) {
                case 1:
                    totalRetail += product1 * quantity;
                    break;
                case 2:
                    totalRetail += product2 * quantity;
                    break;
                case 3:
                    totalRetail += product3 * quantity;
                    break;
                case 4:
                    totalRetail += product4 * quantity;
                    break;
                case 5:
                    totalRetail += product5 * quantity;
                    break;
            }
        }
        System.out.println("The total retail value of all products sold = " + totalRetail);
    }
}
