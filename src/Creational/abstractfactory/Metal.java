package Creational.abstractfactory;

public class Metal implements Tube{
    String data="Metal";
    @Override
    public void printTube(){
        System.out.println(data);
    }
}
