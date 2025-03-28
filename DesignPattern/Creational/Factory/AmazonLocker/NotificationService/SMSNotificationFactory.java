package DesignPattern.Creational.Factory.AmazonLocker.NotificationService;

public class SMSNotificationFactory  extends NotificationFactory {
    public INotificationSender createNotificationSender(){
        return new SMSNotificationSender();
    }
}
