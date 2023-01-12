package Template_Design_Pattern;

public class main {
    public static void main(String[] args) {
        Food_order_abstract a=new Zomato();
        a.details();
        a=new Swiggy();
        a.details();
    }
}
