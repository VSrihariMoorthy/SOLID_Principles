// Robot only implements interfaces it needs
class Robot implements Workable, Administrative {
    public void work() {
        System.out.println("Robot is working");
    }
    
    public void fillTimesheet() {
        System.out.println("Logging robot operation hours");
    }
    
    public void attendMeetings() {
        System.out.println("Robot attending maintenance briefing");
    }
}