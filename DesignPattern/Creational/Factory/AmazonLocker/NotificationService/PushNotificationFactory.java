package DesignPattern.Creational.Factory.AmazonLocker.NotificationService;

public class PushNotificationFactory extends NotificationFactory {
    public INotificationSender createNotificationSender(){
        return new PushNotificationSender();
    }
}
