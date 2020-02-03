package Chapter10.Task1013;

public class TestProgram {
    public static void main(String[] args) {

        // create subclass objects
        Square square = new Square(2, 5);
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(3, 2);
        Sphere sphere = new Sphere(3);
        Cube cube = new Cube(4);
        Tetrahedron tetrahedron = new Tetrahedron(5);

        // create six-element Shape array
        Shape[] shapes = new Shape[6];

        // initialize array with Shapes
        shapes[0] = square;
        shapes[1] = circle;
        shapes[2] = triangle;
        shapes[3] = sphere;
        shapes[4] = cube;
        shapes[5] = tetrahedron;

        System.out.printf("Shapes processed polymorphically:%n%n");

        for (Shape currentShape : shapes) {
            System.out.println(currentShape);
            if (currentShape instanceof TwoDimensionalShape) {
                System.out.printf("%s: %.2f%n",
                        "Area: ", currentShape.getArea());
            } else if (currentShape instanceof ThreeDimensionalShape) {
                System.out.printf("%s: %.2f%n%s: %.2f%n",
                        "Area: ", currentShape.getArea(),
                        "Volume: ", ((ThreeDimensionalShape) currentShape).getVolume());
            }
        }
    }
}
