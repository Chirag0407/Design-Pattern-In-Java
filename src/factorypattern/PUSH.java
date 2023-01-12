package factorypattern;

public class PUSH implements notification{

    @Override
    public void notifyuser() {
        System.out.println("PUSH Recieved");
    }
}
