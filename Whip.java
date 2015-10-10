package com.j2.decorator;

public class Whip extends CondimentDecorator {
  Beverage beverage;
  
  public Whip(Beverage beverage){
    this.beverage = beverage;
  }
  
  public String getDescription(){
    return beverage.getDescription() + ", ÈÖÇÎÅ©¸²";
  }
  
  public double cost()
  {
    return .05 + beverage.cost();
  }
}