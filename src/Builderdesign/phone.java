package Builderdesign;
public class phone {
    String os;
    String ram;
    public phone(String os,String ram){
        this.os=os;
        this.ram=ram;
    }
    void print() {
        System.out.println("phone"+" "+os+" "+ram);
    }
}
