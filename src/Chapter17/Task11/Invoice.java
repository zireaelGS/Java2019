package Chapter17.Task11;

public class Invoice {
    private int partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(int partNumber, String partDescription, int quantity, double price) {
        setPartDescription(partDescription);
        setPartNumber(partNumber);
        setPrice(price);
        setQuantity(quantity);
    }

    public void setPartNumber(int partNumber) {
        if (partNumber <= 0) {
            throw new IllegalArgumentException("partNumber must be more than 0");
        }
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("quantity must be more than 0");
        }
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("price must be more than 0");
        }
        this.price = price;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Part Description: " + getPartDescription() + "\n" + "Part Number: " + getPartNumber() + "\n"
                + "Price: " + getPrice() + "\n" + "Quantity: " + getQuantity() + "\n";
    }
}
