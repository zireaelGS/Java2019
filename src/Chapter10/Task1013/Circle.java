package Chapter10.Task1013;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius) {
        if (radius <= 0)
            throw new IllegalArgumentException("radius must be > 0");

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return getRadius() * pow(PI, 2);
    }

    @Override
    public String toString() {
        return String.format("%s: %s",
                "Circle", super.toString());
    }

}
