package Creational.abstractfactory;

public class GelPenFactory implements PenFactory {
    Metal f;
    Plastic s;
    public Plastic createrefill() {
        return new Plastic();
    }

    @Override
    public Metal createTube() {
        return new Metal();
    }

    @Override
    public PenFactory createpen() {
        f=createTube();
        s=createrefill();
        f.printTube();
        s.printRefill();
        return this;
    }


}
