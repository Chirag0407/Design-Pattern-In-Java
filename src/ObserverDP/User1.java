package ObserverDP;

import java.sql.SQLOutput;

public class User1 extends Observer{

    String message;

    public User1(Admin a){
        a.arr.add(this);
    }

    @Override
    public String getter(){
        return message;
    }

    @Override
    public void setter(String msg) {
        this.message = message;
        System.out.println(msg);
    }
}
