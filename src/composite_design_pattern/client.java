package composite_design_pattern;

public class client {
    public static void main(String[] args) {
        Leaf l1=new Leaf(80);
        Leaf l2=new Leaf(100);
        Leaf l3=new Leaf(40);

        concrete_composite A1=new concrete_composite();
        concrete_composite A2=new concrete_composite();

        A2.addleaf(l1);
        A2.addleaf(l2);

        A1.addleaf(A2);
        A1.addleaf(l3);

        A1.showprice();
    }
}
