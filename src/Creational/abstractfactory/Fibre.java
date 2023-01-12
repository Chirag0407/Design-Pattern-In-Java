package Creational.abstractfactory;

public class Fibre implements Tube {
    String data="Fibre";
    @Override
    public void printTube(){
        System.out.println(data);
    }
}
