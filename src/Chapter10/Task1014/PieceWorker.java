package Chapter10.Task1014;

public class PieceWorker extends Employee {

    private double wage;//для хранения заработной платы работника на единицу
    private int pieces;//для хранения количества штук производства

    public PieceWorker(String firstName, String lastName,
                       String socialSecurityNumber, double wage, int pieces) {

        super(firstName, lastName, socialSecurityNumber);
        setWage(wage);
        setPieces(pieces);

    }

    public void setPieces(int pieces) {

        if (pieces < 0)
            throw new IllegalArgumentException(
                    "Pieces must be >= 0");

        this.pieces = pieces;
    }

    public void setWage(double wage) {

        if (wage < 0.0)
            throw new IllegalArgumentException(
                    "Wage must be >= 0.0");

        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public int getPieces() {
        return pieces;
    }

    @Override
    public double earnings() {
        return getPieces() * getWage();
    }

    @Override
    public String toString() {
        return String.format("Employee PieceWorker: %s%n%s: $%,.2f; %s: %d",
                super.toString(), "wage", getWage(),
                "pieces", getPieces());
    }
}
