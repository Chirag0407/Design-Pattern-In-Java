package Creational.abstractfactory;

public interface PenFactory {
    Tube createTube();
    Refill createrefill();
    PenFactory createpen();
}
