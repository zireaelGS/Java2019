package Chapter3.Task312;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    //constructor
    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        setPartNumber(partNumber);
        setPartDescription(partDescription);
        setQuantity(quantity);
        setPrice(price);
    }

    // set method for each instance variable
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0)
            this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
    }

    // get method for each instance variable
    public String getPartNumber() {
        return partNumber;
    }

    public String getpartDescription() {
        return partDescription;
    }

    public int getquantity() {
        return quantity;
    }

    public double getprice() {
        return price;
    }


    //method that calculates the invoice amount
    public double countInvoiceAmount(int quantityBought) {
        return price * quantityBought;
    }
}
