package State_Design_Pattern;

public class Game_State_Context {
    Game_State state;
    Game_State_Context(){
        this.state=new Level_1();
    }

    void Set_State(Game_State s){
        this.state=s;
    }

    Game_State get_state(){
        return state;
    }

    void work(){
        System.out.println("Checking Game ");
        state.work();
    }
}
