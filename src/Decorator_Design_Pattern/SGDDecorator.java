package Decorator_Design_Pattern;

public class SGDDecorator extends Decorator{
 //Currency currency;      IMP
 //int x;

 public SGDDecorator(Currency currency){
  super.component = currency;
 }

 public String getDescription(){
  return super.component.getDescription()+" ,its Decorated singapore Dollar";
 }
public double cost(double value){
super.cost(value);
  return value;
}
}
