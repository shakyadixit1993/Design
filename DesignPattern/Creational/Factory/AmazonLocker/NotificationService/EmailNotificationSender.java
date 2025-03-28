package DesignPattern.Creational.Factory.AmazonLocker.NotificationService;

public class EmailNotificationSender implements INotificationSender {
    public void sendNotification(String message){
        System.out.println("Sending Emal "+message);
    }
}
