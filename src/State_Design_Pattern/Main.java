package State_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        Game_State_Context gc=new Game_State_Context();
        gc.work();
        gc.Set_State(new Level_2());
        gc.work();
    }
}
