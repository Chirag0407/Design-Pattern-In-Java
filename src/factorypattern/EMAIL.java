package factorypattern;

public class EMAIL implements notification{
    @Override
    public void notifyuser(){
        System.out.println("Email Recieved");
    }
}
