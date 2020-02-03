package Chapter10.Task1013;

public class Triangle extends TwoDimensionalShape {
    private double base;//основание
    private double height;


    // constructor
    public Triangle(double base, double height) {

        setBase(base);
        setHeight(height);

    }

    public void setBase(double base) {
        if (base <= 0)
            throw new IllegalArgumentException("side1 must be > 0");

        this.base = base;
    }

    public void setHeight(double height) {
        if (height <= 0)
            throw new IllegalArgumentException("side2 must be > 0");

        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (1 / 2) * getBase() * getHeight();
    }

    // return String representation of Triangle object
    @Override
    public String toString() {
        return String.format("%s: %s",
                "Triangle", super.toString());
    }
}
