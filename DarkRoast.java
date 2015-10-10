package com.j2.decorator;

public class DarkRoast extends Beverage{
  public DarkRoast(){
    description = "다크로스트 커피";
  }
  public double cost()
  {
    return 1.59;
  }
}