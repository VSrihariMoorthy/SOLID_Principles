package OpenClosed;

// Example usage
class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Rectangle(5, 3),
            new Circle(2),
            new Triangle(4, 6)
        };
        
        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);
        System.out.println("Total area: " + totalArea);
    }
}
