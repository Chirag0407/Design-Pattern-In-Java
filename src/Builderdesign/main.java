package Builderdesign;

public class main {
    public static void main(String[] args) {
        phone p;
        phoneBuilder x=new phoneBuilder();
        p=x.setos("windows").setram("ram 45gb").build();

    }
}
