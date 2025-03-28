package DesignPattern.Creational.Factory.AmazonLocker.NotificationService;

public class PushNotificationSender implements INotificationSender {
    public void sendNotification(String message){
        System.out.println("Sending Push Notification "+message);
    }
}
