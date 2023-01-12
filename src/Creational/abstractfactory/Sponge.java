package Creational.abstractfactory;

public class Sponge implements Refill{
    String data="Sponge";
    @Override
    public void printRefill() {
        System.out.println(data);
    }
}
