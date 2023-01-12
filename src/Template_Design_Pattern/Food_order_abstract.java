package Template_Design_Pattern;

import java.util.Scanner;

public abstract class Food_order_abstract {
    final void details(){
        welcome();
        order_app();
        payment();
    }

    abstract void order_app();
    abstract void payment();

     void welcome(){
        System.out.println("Welcome");
        System.out.println("Enter the food you want to order");
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
    }
}
