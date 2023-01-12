package Creational.abstractfactory;

public class main {
    public static void main(String[] args) {
        PenFactory p =new SketchPenFactory();
        PenFactory q=p.createpen();
        PenFactory w=p.createpen();

        PenFactory r=new GelPenFactory();
    }
}

