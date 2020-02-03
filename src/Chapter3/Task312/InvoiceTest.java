package Chapter3.Task312;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("53255423", "resistor", 33, 10.5);
        Invoice invoice2 = new Invoice("09876346", "luminodiode", 67, 1.39);

// shows how much product is in stock
        System.out.printf("There are %d %ss in stock (Part number:%s) price per unit %.2f $%n",
                invoice1.getquantity(), invoice1.getpartDescription(), invoice1.getPartNumber(), invoice1.getprice());
        System.out.printf("There are %d %ss in stock (Part number:%s) price per unit %.2f $%n%n",
                invoice2.getquantity(), invoice2.getpartDescription(), invoice2.getPartNumber(), invoice2.getprice());
// create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
// Asking the user how many items he wants to buy and calculating the Amount(for invoice1)
        System.out.print("Enter the number of items for invoice1: " + '\n');
        int quantityBought = input.nextInt();
        if (invoice1.getquantity() < 0) {
            quantityBought = 0;
        }
        if (invoice1.getprice() < 0) {
            invoice1.setPrice(0);
        }
        if (quantityBought < 0) {
            System.out.println("Please, enter the positive number of items");
        } else {
            System.out.println("You are going to buy " + quantityBought + " pieces of " + invoice1.getpartDescription() + "s" + '\n');
            invoice1.countInvoiceAmount(quantityBought);

//shows the result of calculation(for invoice1)
            if (quantityBought >= 0) {
                System.out.printf("For %d %ss you are given an invoice in the amount of %.2f$%n%n",
                        quantityBought, invoice1.getpartDescription(), invoice1.countInvoiceAmount(invoice1.getquantity()));
            }

// Asking the user how many items he wants to buy and calculating the Amount(for invoice2)
            System.out.print("Enter the number of items for invoice2: " + '\n');
            quantityBought = input.nextInt();
            System.out.println("You are going to buy " + quantityBought + " pieces of " + invoice2.getpartDescription() + "s" + '\n');
            invoice2.countInvoiceAmount(quantityBought);

//shows the result of calculation(for invoice2)
            if (quantityBought >= 0) {
                System.out.printf("For %d %ss you are given an invoice in the amount of %.2f$%n",
                        quantityBought, invoice2.getpartDescription(), invoice2.countInvoiceAmount(invoice1.getquantity()));
            }
        }
    }
}