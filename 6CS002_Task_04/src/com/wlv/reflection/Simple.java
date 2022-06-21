package com.wlv.reflection;

public class Simple {

  public float a =  (float) 16.25;
  public float b = (float) 25.75;
  
  public Simple() {
  }
  
  public Simple(float a, float b) {
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
  
  public void setA(float a) {
    this.a = a;
  }
  
  public void setB(float b) {
    this.b = b;
  }
  
  public String toString() {
    return String.format("(a:%d, b:%d)", a, b);
  }
}



