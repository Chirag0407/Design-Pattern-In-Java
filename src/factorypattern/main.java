package factorypattern;

public class main {
    public static void main(String[] args) {
        Notificationfactory f=new Notificationfactory();
        notification noti=f.createNotification("SMS");
        noti.notifyuser();
    }
}
