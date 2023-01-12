package Decorator_Design_Pattern;

public class DecoratorDemo {

    public static void main(String[] args) {
    Currency curr = new Dollar();
    System.out.println(curr.getDescription() +" $ "+curr.cost(200.0)); 

    Currency curr2 =  new USDDecorator(new SGDDecorator(new Dollar()));
    System.out.println(curr2.getDescription() +" US$ "+curr2.cost(4.0));

    Currency curr3 = new SGDDecorator(new Rupee());
    System.out.println(curr3.getDescription() +" Rs. "+curr3.cost(3.0));
    }
    
}

// Component on Decorator design pattern



 