package com.wlv.reflection;

public class Simple {

  public double a =  16.25;
  public double b = 25.75;
  
  public Simple() {
  }
  
  public Simple(double a, double b) {
  this.a = a;
  this.b = b;
  }

  public void rectangleA() {
    this.a *= this.a;
  }
  
  public void rectangleB() {
    this.b *= this.b;
  }
  
  public double getA() {
    return a;
  }

  public double getB() {
    return b;
  }
  
  public void setA(int a) {
    this.a = a;
  }
  
  public void setB(int b) {
    this.b = b;
  }
  
  public String toString() {
    return String.format("(a:%d, b:%d)", a, b);
  }
}
