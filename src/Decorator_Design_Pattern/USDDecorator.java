package Decorator_Design_Pattern;

public class USDDecorator extends Decorator{
 //Currency currency;

 public USDDecorator(Currency currency){
  component = currency;
 }
 public String getDescription(){
  return component.getDescription()+" ,its Decorated US Dollar";
 }
 public double cost(double value){
  super.cost(value);
  return value;
}
}

