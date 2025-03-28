package DesignPattern.Creational.Factory.AmazonLocker.NotificationService;

public class SMSNotificationSender implements INotificationSender {
    public void sendNotification(String message){
        System.out.println("Sending SMS "+message);
    }
}
