// Example usage
class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        HumanWorker human = new HumanWorker();
        
        // Both can work and handle administrative tasks
        robot.work();
        human.work();
        
        robot.fillTimesheet();
        human.fillTimesheet();
        
        // Only human can eat and sleep
        human.eat();
        human.sleep();
        
        // Only human deals with salary
        human.calculateSalary();
    }
}