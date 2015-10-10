package com.j2.decorator;

public class Soy extends CondimentDecorator {
  Beverage beverage;
  
  public Soy(Beverage beverage){
    this.beverage = beverage;
  }
  
  public String getDescription(){
    return beverage.getDescription() + ", µÎÀ¯";
  }
  
  public double cost()
  {
    return .10 + beverage.cost();
  }
}