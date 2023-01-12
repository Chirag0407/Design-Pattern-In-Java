package Template_Design_Pattern;

public class Swiggy extends Food_order_abstract{

    @Override
    void order_app() {
        System.out.println("Food Ordered from swiggy");
    }

    @Override
    void payment() {
        System.out.println("Payment successfull");
    }

    @Override
    void welcome() {
        super.welcome();
        System.out.println("Thank you");
    }
}
