package ObserverDP;

public class Main {
    public static void main(String[] args) {
        Admin a=new Admin();

        Observer o1=new User1(a);
        Observer o2=new User2(a);
        Observer o3=new User3(a);

        a.setMessage("helllo hi");
        a.setMessage("Hi How are you");

    }
}
