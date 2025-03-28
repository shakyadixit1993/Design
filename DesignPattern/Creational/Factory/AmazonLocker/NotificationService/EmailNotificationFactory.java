package DesignPattern.Creational.Factory.AmazonLocker.NotificationService;

public class EmailNotificationFactory extends NotificationFactory {
    public INotificationSender createNotificationSender(){
        return new EmailNotificationSender();
    }
}
