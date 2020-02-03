package Chapter10.Task1013;


import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Sphere extends ThreeDimensionalShape {
    private int radius;

    public Sphere(int radius) {
        setRadius(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius <= 0)
            throw new IllegalArgumentException("radius must be > 0");

        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4 / 3) * PI * pow(getRadius(), 3);
    }

    @Override
    public double getArea() {
        return 4 * PI * pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        return String.format("%s: %s",
                "Sphere", super.toString());
    }
}
