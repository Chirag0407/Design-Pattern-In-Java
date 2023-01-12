package composite_design_pattern;

import java.util.ArrayList;

public class Leaf implements composite_interface{

    private int cost;
    Leaf(int cost){
        this.cost=cost;
    }
    @Override
    public void showprice() {
        System.out.println("Cost"+" "+cost);
    }
}
