package DesignPattern.Creational.Factory.AmazonLocker.NotificationService;

public abstract class NotificationFactory {
    public abstract INotificationSender createNotificationSender();
}
