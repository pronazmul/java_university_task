abstract class Shape {
    protected int dimension1;
    protected int dimension2;
    public Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
    // Abstract method to be implemented by subclasses
    public abstract void printArea();
}
class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }
    @Override
    public void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}
class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }
    @Override
    public void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}
class Circle extends Shape {
    public Circle(int radius) {
        super(radius, 0); // Using only one dimension for radius
    }
    @Override
    public void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Area of Circle: " + area);
    }
}
public class ShapeTest {
    public static void main(String[] args) {
        // Creating objects of Rectangle, Triangle, and Circle
        Rectangle rectangle = new Rectangle(5, 8);
        Triangle triangle = new Triangle(4, 6);
        Circle circle = new Circle(3);
        // Calling printArea() method for each shape
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}

