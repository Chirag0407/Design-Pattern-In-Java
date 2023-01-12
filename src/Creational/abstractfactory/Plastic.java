package Creational.abstractfactory;

public class Plastic implements Refill{
    String data="Plastic";
    @Override
    public void printRefill() {
        System.out.println(data);
    }
}
