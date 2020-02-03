package Chapter10.Task1013;

public abstract class Shape {
    public abstract double getArea();

    // return String representation of Shape object
    @Override
    public String toString() {
        return String.format("%s",
                "This object reference to indirect superclass that calls Shape");
    }

}
