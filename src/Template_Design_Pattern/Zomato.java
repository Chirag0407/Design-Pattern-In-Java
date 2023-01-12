package Template_Design_Pattern;

public class Zomato extends Food_order_abstract{

    @Override
    void order_app() {
        System.out.println("Food Ordered From Zomato");
    }

    @Override
    void payment() {
        System.out.println("Payment SuccessFull");
    }

    @Override
    void welcome() {
        super.welcome();
        System.out.println("Thank you");
    }
}
