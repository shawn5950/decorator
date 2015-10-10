package com.j2.decorator;

public class Mocha extends CondimentDecorator {
  Beverage beverage;
  
  public Mocha(Beverage beverage){
    this.beverage = beverage;
  }
  
  public String getDescription(){
    return beverage.getDescription() + ", ��ī";
  }
  
  public double cost()
  {
    return .20 + beverage.cost();
  }
}