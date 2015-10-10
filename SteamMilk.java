package com.j2.decorator;

public class SteamMilk extends CondimentDecorator {
  Beverage beverage;
  
  public SteamMilk(Beverage beverage){
    this.beverage = beverage;
  }
  
  public String getDescription(){
    return beverage.getDescription() + ", ½ºÆÀ¿ìÀ¯";
  }
  
  public double cost()
  {
    return .15 + beverage.cost();
  }
}