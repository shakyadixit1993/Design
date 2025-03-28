package DesignPattern.Creational.Factory.AmazonLocker.NotificationService;

public class LockerSystem {
    public static void main(String[] args){
        NotificationFactory factory = new PushNotificationFactory();
        INotificationSender sender1 =  factory.createNotificationSender();
        sender1.sendNotification("Your package is delivered ");


        NotificationFactory factory2 = new SMSNotificationFactory();
        INotificationSender sender2 = factory2.createNotificationSender();
        sender2.sendNotification("Your package is delivered ");

        NotificationFactory factory3 = new EmailNotificationFactory();
        INotificationSender sender3 = factory3.createNotificationSender();
        sender3.sendNotification("Your package is delivered ");
    }
}
