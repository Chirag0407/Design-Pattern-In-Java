package factorypattern;

public class Notificationfactory implements factory {

    @Override
    public notification createNotification(String s) {
        if(s.equalsIgnoreCase("sms")){
            return new SMS();
        }
        else if(s.equalsIgnoreCase("EMAIL")){
            return new EMAIL();
        }
        else{
            return new PUSH();
        }

    }
}
