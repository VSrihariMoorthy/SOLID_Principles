// Human worker implements all interfaces
class HumanWorker implements Workable, NeedsRest, Payable, Administrative {
    public void work() {
        System.out.println("Human is working");
    }
    
    public void eat() {
        System.out.println("Human is eating lunch");
    }
    
    public void sleep() {
        System.out.println("Human is taking a break");
    }
    
    public void calculateSalary() {
        System.out.println("Calculating human salary");
    }
    
    public void fillTimesheet() {
        System.out.println("Human filling timesheet");
    }
    
    public void attendMeetings() {
        System.out.println("Human attending meeting");
    }
}
