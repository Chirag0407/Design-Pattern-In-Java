package Builderdesign;

 class phoneBuilder implements Builder{
    String os="Ios";
    String ram="9 gb";

    @Override
    public phoneBuilder setos(String s){
        this.os=s;
        return this;
    }

     @Override
     public phoneBuilder setram(String s){
        this.ram=s;
        return this;

    }

    phone build(){
        return new phone(os,ram);
    }
}
