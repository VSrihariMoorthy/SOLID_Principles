package Liskov;

public abstract class Shape {
    // Common properties for all shapes
    protected String name;
    protected String color;
    
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    // Abstract methods that all shapes must implement
    abstract double calculateArea();
    abstract double calculatePerimeter();
    
    // Common methods for all shapes
    public String getName() {
        return name;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    // Common behavior for all shapes
    public String getDescription() {
        return String.format("This is a %s %s with area %.2f and perimeter %.2f",
            color, name, calculateArea(), calculatePerimeter());
    }
}