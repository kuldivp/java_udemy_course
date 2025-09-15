/*Create an abstract class Shape with abstract method area(). Implement it in Circle and Rectangle.
*/

// The Main class is the only public class and must match the filename.
public class ShapeExample {
    public static void main(String[] args) {
        // Create objects of the concrete classes
        Shape myCircle = new Circle(5.0);
        Shape myRectangle = new Rectangle(4.0, 6.0);

        // Call the area() method on each object
        System.out.println("The area of the circle is: " + myCircle.area());
        System.out.println("The area of the rectangle is: " + myRectangle.area());
    }
}

// The abstract class Shape is not public
abstract class Shape {
    public abstract double area();
}

// The Circle class is not public
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// The Rectangle class is not public
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}
