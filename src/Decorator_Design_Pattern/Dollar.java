package Decorator_Design_Pattern;

public class Dollar extends Currency{
  double value;

  public Dollar (){
    description = "Dollar";
    value=1.0;
  }

  public double cost(double v){
    value=v;
    return value;
  }
}
