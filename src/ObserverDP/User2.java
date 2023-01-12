package ObserverDP;

public class User2 extends Observer{
    String message;

    public User2(Admin a){
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
