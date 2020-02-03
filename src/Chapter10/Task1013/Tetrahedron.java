package Chapter10.Task1013;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Tetrahedron extends ThreeDimensionalShape {
    private int side;

    public Tetrahedron(int side) {
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("side should be more than 0");
        }
        this.side = side;
    }


    @Override
    public double getArea() {
        return pow(getSide(), 2) * sqrt(3);
    }

    @Override
    public double getVolume() {
        return (pow(getSide(), 3) * sqrt(2)) / 3;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",
                "Tetrahedron", super.toString());
    }
}
