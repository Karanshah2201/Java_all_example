package java_prac.pkg21;
interface Shape {
    double area();
    String getColor();
}
class Circle implements Shape {
    private double radius;
    private String color;
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    @Override
    public String getColor() {
        return color;
    }
}
class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;
    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }
    @Override
    public double area() {
        return length * width;
    }
    @Override
    public String getColor() {
        return color;
    }
}
interface Sign {
    void display();
}
class SignWithShape implements Sign {
    private Shape shape;
    private String text;
    public SignWithShape(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }
    @Override
    public void display() {
        System.out.println("Sign Background: " + shape.getColor());
        System.out.println("Sign Text: " + text);
        System.out.println("Shape Area: " + shape.area());
    }
}
public class Java_prac21{
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red");
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue");
        SignWithShape circleSign = new SignWithShape(circle, "Circle Sign");
        SignWithShape rectangleSign = new SignWithShape(rectangle, "Rectangle Sign");
        circleSign.display();
        rectangleSign.display();
    }            }
