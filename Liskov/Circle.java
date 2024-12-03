package Liskov;

// Circle.java
public class Circle extends Shape {
    private double radius;
    private final double PI = Math.PI;
    
    public Circle(double radius, String color) {
        super("Circle", color);
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}
