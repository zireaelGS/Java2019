package Chapter10.Task1013;

import static java.lang.Math.pow;

public class Cube extends ThreeDimensionalShape {
    private int side;

    public Cube(int side) {
        setSide(side);
    }

    public int getSide() {

        return side;
    }

    public void setSide(int side) {
        if (side <= 0)
            throw new IllegalArgumentException("side must be > 0");

        this.side = side;
    }

    @Override
    public double getVolume() {
        return pow(getSide(), 3);
    }

    @Override
    public double getArea() {
        return 6 * pow(getSide(), 2);
    }

    @Override
    public String toString() {
        return String.format("%s: %s",
                "Cube", super.toString());
    }
}
