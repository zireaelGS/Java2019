package Chapter17.Task11;

import java.util.Arrays;
import java.util.Comparator;

public class Task11 {
    public static void main(String[] args) {
        Invoice[] invoices = new Invoice[4];
        invoices[0] = new Invoice(1001, "The coolest description ever", 25, 17);
        invoices[1] = new Invoice(2002, "Amazing description", 20, 9);
        invoices[2] = new Invoice(3003, "It is a great description", 80, 6);
        invoices[3] = new Invoice(4004, "Hi! Please, can you pretend that here we have some description?)"
                , 46, 12);

        //a
        System.out.println("Sorting the Invoice objects by PartDescription: \n");
        Arrays.stream(invoices).sorted(Comparator.comparing(Invoice::getPartDescription))
                .forEach(value -> System.out.println(value));
        //b
        System.out.println("Sorting the Invoice objects by Price: \n");
        Arrays.stream(invoices).sorted(Comparator.comparing(Invoice::getPrice))
                .forEach(value -> System.out.println(value));
        //c
        System.out.println("Mapping each Invoice to its PartDescription and Quantity,sorting the results by Quantity: \n");
        Arrays.stream(invoices).sorted(Comparator.comparing(Invoice::getQuantity))
                .forEach(value -> System.out.println("Part Description: " + value
                        .getPartDescription() + ", Quantity: " + value.getQuantity()));
        //d
        System.out.println("Mapping each Invoice to its PartDescription and the value of the Invoice " +
                "(i.e., Quantity * Price). Order the results by Invoice value.\n");
        Arrays.stream(invoices).sorted(Comparator.comparing(value -> value.getPrice() * value.getQuantity()))
                .forEach((value -> System.out.println("Part Description: " + value.getPartDescription() +
                        ", Value of the Invoice(i.e., Quantity * Price): " + value.getQuantity() * value.getPrice())));
        //e
        System.out.println("Mapping each Invoice to its PartDescription and the value of the Invoice (i.e., Quantity * Price)." +
                " Order the results by Invoice value and select the Invoice values in the range $200 to $500\n");
        Arrays.stream(invoices).sorted(Comparator.comparing(value -> value.getPrice() * value.getQuantity()))
                .filter(value -> (value.getPrice() * value.getQuantity()) >= 200 && (value.getPrice() * value.getQuantity()) <= 500)
                .forEach((value -> System.out.println("Part Description: " + value.getPartDescription() +
                        ", Value of the Invoice(i.e., Quantity * Price): " + value.getQuantity() * value.getPrice())));

    }
}

