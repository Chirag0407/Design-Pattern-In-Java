package Singletonfactory;

public class main {
    public static void main(String[] args) {
        SingletonFactory k=SingletonFactory.getInstance();
        k.setName("Jhsdc");
        k.getName();
        SingletonFactory l=SingletonFactory.getInstance();
//        l.setName("oikk");
        l.getName();
//        SingletonFactory l = new SingletonFactory();
    }
}
