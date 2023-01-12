package Prototypedesign;

public class tictactoe implements Prototype{
    String Color1,Color2;
    int grids;
    String symbol1,symbol2;

    public tictactoe(){
        System.out.println("Tic tac toe");
        System.out.println("---------------------------------");
        System.out.println("Color1---Color2-----grids----symbol1-----symbol2");
    }

    public tictactoe(String color1,String color2,int grids,String symbol1,String symbol2) {
        this();
        this.Color1 = color1;
        this.Color2 = color2;
        this.grids = grids;
        this.symbol1 = symbol1;
        this.symbol2 = symbol2;
    }

    @Override
    public Prototype getClone(){
        return new tictactoe(Color1,Color2,grids,symbol1,symbol2);
    }
    @Override
    public void showRecord() {
        System.out.println("color1 "+"= "+Color1);

    }
}
