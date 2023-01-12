package ObserverDP;

public class User3 extends Observer{

    String message;

    public User3(Admin a){
        a.arr.add(this);
    }

    @Override
    public String getter() {
        return message;
    }

    @Override
    public void setter(String msg) {
        this.message = message;
        System.out.println(msg);
    }
}
