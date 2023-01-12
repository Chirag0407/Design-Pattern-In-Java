package Singletonfactory;

public class SingletonFactory {
    private static SingletonFactory S = null;
    private String name;
    private SingletonFactory(){
        System.out.println("Object created");
    }
    public static SingletonFactory getInstance(){
        if (S == null) {
            S = new SingletonFactory();
        }
        return S;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void getName(){
        System.out.println(this.name);
    }
}
