package composite_design_pattern;

import java.util.ArrayList;

public class concrete_composite implements composite_interface{

    ArrayList<composite_interface> a=new ArrayList<>();
    @Override
    public void showprice() {
        for(composite_interface w:a){
            w.showprice();
        }
    }

    public void addleaf(composite_interface p){
         a.add(p);
    }
}
