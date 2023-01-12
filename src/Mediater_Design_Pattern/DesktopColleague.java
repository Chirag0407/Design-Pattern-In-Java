package Mediater_Design_Pattern;
public class DesktopColleague extends Colleague{

    public DesktopColleague(Mediator m) {
        super(m);
    }
    public void receive(String message) {
        System.out.println("Desktop Received: " + message);
    }

}
