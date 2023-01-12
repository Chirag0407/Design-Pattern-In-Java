package Decorator_Design_Pattern;

public abstract class Currency {
 String description = "Currency";

 public String getDescription() {
  return description;
 }
 public abstract double cost(double value);

}
