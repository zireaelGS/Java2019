package Chapter10.Task1013;

public class Square extends TwoDimensionalShape {
    private double side1;
    private double side2;

    // constructor
    public Square(double side1, double side2) {

        setSide1(side1);
        setSide2(side2);

    }

    public void setSide1(double side1) {
        if (side1 <= 0)
            throw new IllegalArgumentException("side1 must be > 0");

        this.side1 = side1;
    }

    public void setSide2(double side2) {
        if (side2 <= 0)
            throw new IllegalArgumentException("side2 must be > 0");

        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    @Override
    public double getArea() {
        return getSide1() * getSide2();
    }

    // return String representation of Square object
    @Override
    public String toString() {
        return String.format("%s: %s",
                "Square", super.toString());
    }
}
