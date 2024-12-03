package Liskov;
public class Main {
    public static void main(String[] args) {
        // Create different shapes
        Shape rectangle = new Rectangle(5, 4, "blue");
        Shape square = new Square(5, "red");
        Shape circle = new Circle(3, "green");
        
        // Create array of shapes
        Shape[] shapes = {rectangle, square, circle};
        
        // Use ShapeCalculator
        ShapeCalculator calculator = new ShapeCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);
        double totalPerimeter = calculator.calculateTotalPerimeter(shapes);
        
        // Print individual shape details
        for (Shape shape : shapes) {
            System.out.println(shape.getDescription());
        }
        
        // Print totals
        System.out.println("\nTotal Area: " + totalArea);
        System.out.println("Total Perimeter: " + totalPerimeter);
    }
}