package Creational.abstractfactory;

public class SketchPenFactory implements PenFactory{
    Refill s;
    Tube f;
    @Override
    public Sponge createrefill() {
        return new Sponge();
    }

    @Override
    public Fibre createTube() {
        return new Fibre();
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
