package DependencyInversion;// High-level module
class NotificationService {
    private MessageSender sender;
    
    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }
    
    public void sendNotification(String message) {
        sender.sendMessage(message);
    }
}