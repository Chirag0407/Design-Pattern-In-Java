package factorypattern;

public class SMS implements notification{

    @Override
    public void notifyuser() {
        System.out.println("SMS Recieved");
    }
}
