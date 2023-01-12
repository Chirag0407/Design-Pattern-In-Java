package Prototypedesign;

public class main {
    public static void main(String[] args) {
        Prototype p=new tictactoe("green","blue",9,"#","0");
        p.showRecord();
        Prototype pc=p.getClone();
        pc.showRecord();
        Prototype p1=new Chess("green","blue",9,"#","0");
        p1.showRecord();
        Prototype pc1=p1.getClone();
        pc1.showRecord();
    }
}
