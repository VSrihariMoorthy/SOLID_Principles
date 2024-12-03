package DependencyInversion;

public class Main {
    public static void main(String[] args) {
        // Using email
        NotificationService emailNotifier = new NotificationService(new EmailSender());
        emailNotifier.sendNotification("Hello via email!");
        
        // Using SMS
        NotificationService smsNotifier = new NotificationService(new SMSSender());
        smsNotifier.sendNotification("Hello via SMS!");
    }
}
