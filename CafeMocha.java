package com.j2.decorator;

public class CafeMocha extends Beverage{
  public CafeMocha(){
    description = "카페모카";
  }
  public double cost()
  {
    return 1.59;
  }
}