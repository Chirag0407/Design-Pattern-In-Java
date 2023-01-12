package ObserverDP;

import java.util.ArrayList;

public class Admin {
    private String message;
    ArrayList<Observer> arr = new ArrayList<>();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        update();
    }

    public void update(){
        for(Observer o : arr){
            o.setter(message);
        }
    }

}
